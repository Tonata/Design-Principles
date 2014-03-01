/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.DIP.Correction;

/**
 *
 * @author student
 */
public class Photographer implements WorkHours{

    @Override
    public String hours() {
        return "12 hours of works";
    }
    
}
