/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.service.Impl;

import com.tonata.designprinciples.OCP.Correction.Edits;
import com.tonata.designprinciples.OCP.Correction.JobQueue;
import com.tonata.designprinciples.OCP.Correction.Photograph;
import com.tonata.designprinciples.OCP.Correction.Work;

/**
 *
 * @author student
 */
public class WorkImpl implements Work {
   JobQueue j;
    @Override
    public String job() {
       
       return j.performJob();
    }
    
}
