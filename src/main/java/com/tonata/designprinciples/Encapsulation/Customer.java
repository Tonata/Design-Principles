/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.Encapsulation;

/**
 *
 * @author student
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String custNum;
    
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String surname){
        lastName = surname;
    }
    public void setCustomerNum(String num){
        custNum = num;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCustomerNum(){
        return custNum;
    }
}
