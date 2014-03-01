/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.LSP.Violation;

/**
 *
 * @author student
 */
public class Designer {
    private String name;
    private String workerId;
    
    public void setEmployeeName(String fullName){
        name = fullName;
    }
    public void setWorkerID(String id){
        workerId = id;
    }
    public String getEmployeeName(){
        return name;
    }
    public String getWorkedId(){
        return workerId;
    }
    
}
