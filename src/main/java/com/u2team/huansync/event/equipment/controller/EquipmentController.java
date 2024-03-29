package com.u2team.huansync.event.equipment.controller;

import com.u2team.huansync.event.equipment.model.DAO.EquipmentDAO;
import com.u2team.huansync.event.equipment.model.classes.Equipment;

import java.util.List;

/**
 *
 * @author Cristina Jerez
 */
public class EquipmentController {

    private static EquipmentDAO equipmentDao = new EquipmentDAO();

    public static void insertEquipment(Equipment equipment) {
        equipmentDao.save(equipment);
    }

    public static void deleteEquipment(long equipmentid) {
        equipmentDao.delete(equipmentid);
    }

    public static Equipment getByIdEquipment(long equipmentId) {
        return equipmentDao.getById(equipmentId);
    }

    public static List<Equipment> getAllEquipment() {
        return equipmentDao.getAll();
    }
      public static void updateEquipment(Equipment equipment) {
        equipmentDao.update(equipment);
    }
}