/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.OCP.Correction;

/**
 *
 * @author student
 */
public class Photograph implements Work{

    @Override
    public String job() {
        return "Capture Photos";
    }
    
}
