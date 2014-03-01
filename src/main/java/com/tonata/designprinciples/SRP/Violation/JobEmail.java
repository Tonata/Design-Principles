/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.SRP.Violation;

/**
 *
 * @author student
 */
public class JobEmail implements Email {
    private String send;
    private String recieve;
    private String information;
    @Override
    public void setSender(String sender) {
        send = sender;
        
    }

    @Override
    public void setReciever(String reciever) {
        recieve = reciever;
    }

    @Override
    public void setContent(String content) {
        information = content;
    }

   

    @Override
    public String getContent() {
        return information;
    }

    @Override
    public String getSender() {
        return send;
    }

    @Override
    public String getReciever() {
        return recieve;
    }
    
}
