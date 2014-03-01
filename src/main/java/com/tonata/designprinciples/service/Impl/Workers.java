/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.service.Impl;

import com.tonata.designprinciples.DIP.Correction.WorkHours;

/**
 *
 * @author student
 */
public class Workers implements WorkHours {

    @Override
    public String hours() {
        return "Standard 10 hours per staff member";
    }
    
}
