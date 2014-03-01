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
public class Photographer implements CustomerQueries , Photography{

    @Override
    public void handleCustomerQueries() {
       System.out.println("Handle job related queries");
    }

    @Override
    public void capturePhotos() {
         System.out.println("Capture Moments");
    }
    
}
