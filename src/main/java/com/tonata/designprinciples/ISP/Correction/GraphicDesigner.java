/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.ISP.Correction;

/**
 *
 * @author student
 */
public class GraphicDesigner implements CustomerQueries , Editing {
     @Override
    public void editing() {
        System.out.println("Edit pictures");
    }

    @Override
    public void handleCustomerQueries() {
        System.out.println("Handle job related queries");
    }
}
