package com.u2team.huansync.event.model.util;

import com.u2team.huansync.persistence.BDConnection;
import com.u2team.huansync.persistence.Operations;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Cristina Jerez Salas
 * 
 */
public class Validations {
    

    /**
    * Checks if a date is between an initial date and a final date, within a specified range of days.
    *
    * @param initialDate the initial date
    * @param finalDate the final date
    * @param minDays the minimum number of days allowed between the initial and final dates
    * @param maxDays the maximum number of days allowed between the initial and final dates
    * @return true if the date is between the initial and final dates within the specified range of days, false otherwise
    */
    public static boolean dateBetween(LocalDate initialDate, LocalDate finalDate, int minDays, int maxDays){
        long difDate = ChronoUnit.DAYS.between(initialDate, finalDate);
        return !(difDate < minDays || difDate > maxDays);
    }

    /**
     * Counts the number of occurrences of a specific value in a column of a table.
     *
     * @param table the name of the table
     * @param column the name of the column
     * @param value the value to search for in the column
     * @return the number of occurrences of the value in the column, or -1 if an error occurs
     */
    
    public static int counterRepeated(String table, String column, String value){
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "select count(" + column + ") as repeated from " + table + " WHERE " + column + " = ?;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setString(1, value);
            ResultSet rs = Operations.query_db(ps);
            if (rs != null) {
                if(rs.next()){
                    int repeated = rs.getInt("repeated");
                    return repeated;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int counterRepeatedUpdate(String table, String column, String value, long eventId) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "SELECT COUNT(" + column + ") AS repeated FROM " + table + " WHERE " + column + " = ? AND eventId <> ?;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setString(1, value);
            ps.setLong(2, eventId);
            ResultSet rs = Operations.query_db(ps);
            if (rs != null && rs.next()) {
                int repeated = rs.getInt("repeated");
                return repeated;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
