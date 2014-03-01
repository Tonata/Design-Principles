/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.DIP.Voilation;

/**
 *
 * @author student
 */
public class Photographer {
    Designer d;
    public int hoursWorked(){
        return d.hoursWorked();
    }
}
