/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.Polymorphism;

/**
 *
 * @author student
 */
public class Equipment {
    private String name;
    private String code;
    
    public void setEquipmentName(String n) {
        name = n;
    }

   
    public void setEquipmentCode(String c) {
        code = c;
    }

 
    public String getEquipmentName() {
        return name;
    }

  
    public String getEquipmentCode() {
        return code;
    }
    
}
