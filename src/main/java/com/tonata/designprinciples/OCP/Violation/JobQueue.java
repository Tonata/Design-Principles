/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.OCP.Violation;

/**
 *
 * @author student
 */
public class JobQueue {
    
    public void performJob(Work w){
        if(w.workCode == 101)
        {
           photography();
        }
        else
            if(w.workCode == 102){
            editing();
        }
    }
    public void photography(){
        
    }
    public void editing(){
        
    }
}
