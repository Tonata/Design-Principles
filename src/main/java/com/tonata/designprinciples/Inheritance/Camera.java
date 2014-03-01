/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.Inheritance;

/**
 *
 * @author student
 */
public class Camera implements Equipment{
    private String name;
    private String code;
    @Override
    public void setEquipmentName(String n) {
        name = n;
    }

    @Override
    public void setEquipmentCode(String c) {
        code = c;
    }

    @Override
    public String getEquipmentName() {
        return name;
    }

    @Override
    public String getEquipmentCode() {
        return code;
    }
    
}
