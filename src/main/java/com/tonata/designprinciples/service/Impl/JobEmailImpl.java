/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.service.Impl;

import com.tonata.designprinciples.SRP.Correction.Content;
import com.tonata.designprinciples.SRP.Correction.Email;

/**
 *
 * @author student
 */
public class JobEmailImpl implements Email{
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
    public void setContent(Content c) {
       c.getContent();
    }
}
