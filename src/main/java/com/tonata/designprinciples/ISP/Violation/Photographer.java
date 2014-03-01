/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.ISP.Violation;

/**
 *
 * @author student
 */
public class Photographer implements Duties{

    @Override
    public void editing() {
        
    }

    @Override
    public void handleCustomerQueries() {
        System.out.println("Handle job related queries");
    }

    @Override
    public void capturePhotos() {
        System.out.println("Capture Moments");
    }
    
}
