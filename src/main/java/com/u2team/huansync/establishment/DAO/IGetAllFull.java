/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.u2team.huansync.establishment.DAO;

import java.util.List;

/**
 *
 * @author misae
 */
public interface IGetAllFull <T> extends IDao{
    List<T> getAllFull();
}
