package com.u2team.huansync.activity.cosplay.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.u2team.huansync.activity.model.ActivityDAO;
import com.u2team.huansync.persistence.BDConnection;

/**
 * Implementation of CosplayValidatorDao interface for validating Cosplay
 * entities.
 */
public class CosplayValidatorDaoImpl implements CosplayValidatorDao {

    private ActivityDAO activityDao;
    private final Connection con;

    // query for consulting customers
    private static final String SELECT_CUSTOMER_QUERY = "SELECT * FROM tbl_cosplay cp WHERE cp.participantId in(SELECT c.customerId from tbl_customers c)  and cp.participantId = ? and cp.statusCosplay =true ";
    // query for consulting cosplays
    private static final String SELECT_COSPLAY_QUERY = "SELECT * FROM tbl_cosplay WHERE cosplayId = ? AND statusCosplay = true";

    // query for consultin participantion of the user in the activitie

    private static final String SELECT_PARTICIPATION_QUERY = """

            select * from tbl_participation p
            JOIN tbl_activities act on  p.activityId = act.activityId
            where p.activityId = ? and p.customerId =? and  p.statusParticipation = 'participate'
            and  act.typeActivity = 'cosplay' and act.completed =false ;

            """;

    // CONSTRUCTORS

    public CosplayValidatorDaoImpl() {
        this.activityDao = new ActivityDAO();
        this.con = BDConnection.MySQLConnection();
    }

    // VALIDATIONS

    /* testing methods */

    /**
     * Validates whether the participant is participating in a specific cosplay
     * activity.
     *
     * @param activityId    The ID of the cosplay activity.
     * @param participantId The ID of the participant to be validated.
     * @return True if the participant is participating in the specified activity,
     *         false otherwise.
     */
    public boolean validateParticipantion(int activityId, int participantId) {
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_PARTICIPATION_QUERY)) {
            preparedStatement.setInt(1, activityId);
            preparedStatement.setInt(2, participantId);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next() == false) {
                throw new Exception(
                """
                        error: the operation cannot be applied, it seems that there are 3 possibilities why this error arises
                        1 - the type of activity is different from cosplay
                        2 -the participant is not participating
                        3 - the activity has already finished
                        4 -the participant does not exist
                                """);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Validates whether the participant is already participating in a cosplay
     * activity.
     *
     * @param idParticipant The ID of the participant to be validated.
     * @return True if the participant is not already participating, false
     *         otherwise.
     */
    public boolean validateParticipant(int idParticipant) {
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_CUSTOMER_QUERY)) {
            preparedStatement.setInt(1, idParticipant);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                throw new Exception("Error: The participant is already competing");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Handle the exception appropriately, e.g., log the error or throw a different
            // exception
            return false; // If an exception occurs, you might want to return false here
        }

        return true; // Return true if the participant is not already participating
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    /**
     * Validates whether the cosplay with the provided ID is active.
     *
     * @param idCosplay The ID of the cosplay to be validated.
     */
    @Override
    public void validateCosplayisActive(int idCosplay) {
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_COSPLAY_QUERY)) {
            preparedStatement.setInt(1, idCosplay);
            ResultSet rs = preparedStatement.executeQuery();
            if (!rs.next()) {
                throw new Exception("The cosplay you want to delete is not in the database.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    /**
     * Validates whether the cosplay with the provided ID is deactivated.
     *
     * @param idCosplay The ID of the cosplay to be validated.
     */
    public void validateCosplayisDesact(int idCosplay) {
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_COSPLAY_QUERY)) {
            preparedStatement.setInt(1, idCosplay);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next() == false) {
                throw new Exception("The cosplay you want to delete is not in the database.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
