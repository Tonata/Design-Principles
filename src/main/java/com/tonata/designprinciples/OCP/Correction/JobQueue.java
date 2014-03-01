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
public class JobQueue {
    Edits edit;
    Photograph photo;
    
    public String performJob(){
        return photo.job()  + " and " + edit.job();
       // w.job();
        
    }
}
