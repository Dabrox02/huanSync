package com.u2team.huansync.event.model.DAO;

import com.u2team.huansync.event.DAO.ISaveDao;
import com.u2team.huansync.event.model.classes.EventStaff;
import com.u2team.huansync.event.model.classes.EventStaffFull;
import com.u2team.huansync.event.staff.model.DAO.StaffDAO;
import com.u2team.huansync.event.staff.model.classes.Staff;
import com.u2team.huansync.event.staff.model.classes.StatusStaffEnum;
import com.u2team.huansync.persistence.BDConnection;
import com.u2team.huansync.persistence.Operations;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


/**
 * Implementation of the ISaveDao interface for managing EventStaff entities in the database.
 * This class provide method for saving a EventStaff Object.
 */
public class EventStaffDAO implements ISaveDao<EventStaff> {
    /**
     * Saves the given EventStaff object to the database by inserting a new record
     * into the tbl_staff_event table.
     *
     * @param eventStaff The EventStaff object to be saved in the database.
     */
    @Override
    public void save(EventStaff eventStaff) {
        List<EventStaffFull> eventStaffFullList = null;
        EventDAO eventDAO = new EventDAO();
        eventStaffFullList = eventDAO.getAllFull();
        EventStaffFull currentEventStaffFull = null;
        
        Staff staff = new Staff();
        StaffDAO staffDAO = new StaffDAO();
        staff = staffDAO.getById(eventStaff.getStaffId());
        
        if(staff != null){
            if( staff.getStatusStaffEnum() == StatusStaffEnum.DISMISSED || staff.getStatusStaffEnum() == StatusStaffEnum.INCAPACITED ){
                System.out.println("You cannot assign a staff member who is dismissed or incapacitated.");
                return;
            }
        }else{
            return;
        }
        
        
        if(eventStaffFullList != null){
            
            for ( EventStaffFull eventStaffFull : eventStaffFullList  ){
                if( eventStaffFull.getEventId() == eventStaff.getEventId() ){
                    currentEventStaffFull = eventStaffFull;
                }
            } 
            for ( EventStaffFull eventStaffFull : eventStaffFullList  ){
                if( eventStaffFull.getEventId() != eventStaff.getEventId() ){
                    for(Staff sqlStaff  : eventStaffFull.getStaff()){
                        if( sqlStaff.getStaffId() == eventStaff.getStaffId()  ){
                            if(eventStaffFull.getDateEvent().equals(currentEventStaffFull.getDateEvent())){
                                System.out.println("You cannot assign an staff member to two events with the same date");
                                return;
                            }
                            
                        }
                    }
                }
            } 
        }
        else{
            return;
        }

        
        staff.setStatusStaffEnum(StatusStaffEnum.TASK_ASSIGNED);
        staffDAO.update(staff);

        Operations.setConnection(BDConnection.MySQLConnection());
        String stmInsert = "INSERT INTO tbl_staff_event VALUES (?,?);";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, eventStaff.getEventId());
            ps.setLong(2, eventStaff.getStaffId());

            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("Cannot insert in table staff_event");
            } else {
                System.out.println("Successful insert in table staff_event");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
  
