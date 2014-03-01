/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.SRP.Correction;

/**
 *
 * @author student
 */
public interface Email {
    void setSender(String sender);
    void setReciever(String reciever);
    void setContent(Content c);
}
