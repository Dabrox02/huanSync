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
 */
public class Validations {

    /**
     * Determines whether a given date range is within a specified minimum and
     * maximum number of days.
     * This method can be used to validate if an event or booking falls within an
     * acceptable timeframe.
     *
     * @param initialDate the start date of the range
     * @param finalDate   the end date of the range
     * @param minDays     the minimum number of days in the range (inclusive)
     * @param maxDays     the maximum number of days in the range (inclusive)
     * @return {@code true} if the date range is within the specified limits,
     *         {@code false} otherwise
     */
    public static boolean dateBetween(LocalDate initialDate, LocalDate finalDate, int minDays, int maxDays) {
        long difDate = ChronoUnit.DAYS.between(initialDate, finalDate);
        return difDate >= minDays && difDate <= maxDays;
    }

    /**
     * Counts the occurrences of a specific value within a column of a database
     * table.
     * This method can be particularly useful for checking the number of entries
     * matching a certain criterion,
     * such as duplicate event names or user entries.
     *
     * @param table  the database table to search
     * @param column the column within the table to search
     * @param value  the value to count occurrences of
     * @return the count of occurrences, or -1 if a database access error occurs
     */
    public static int counterRepeated(String table, String column, String value) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "SELECT COUNT(" + column + ") AS repeated FROM " + table + " WHERE " + column + " = ?;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setString(1, value);
            ResultSet rs = Operations.query_db(ps);
            if (rs != null && rs.next()) {
                return rs.getInt("repeated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * Counts the occurrences of a specific value within a column of a database
     * table excluding a particular record.
     * This can be used to validate uniqueness of a field like an event name when
     * updating a record,
     * ensuring that the new value does not clash with existing entries.
     *
     * @param table   the database table to search
     * @param column  the column within the table to search
     * @param value   the value to count occurrences of
     * @param eventId the ID of the event record to exclude from the count
     * @return the count of occurrences excluding the specified record, or -1 if a
     *         database access error occurs
     */
    public static int counterRepeatedUpdate(String table, String column, String value, long eventId) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "SELECT COUNT(" + column + ") AS repeated FROM " + table + " WHERE " + column
                + " = ? AND eventId <> ?;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setString(1, value);
            ps.setLong(2, eventId);
            ResultSet rs = Operations.query_db(ps);
            if (rs != null && rs.next()) {
                return rs.getInt("repeated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
