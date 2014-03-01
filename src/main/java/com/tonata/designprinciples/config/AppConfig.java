/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.designprinciples.config;

import com.tonata.designprinciples.DIP.Correction.WorkHours;
import com.tonata.designprinciples.ISP.Correction.Duties;
import com.tonata.designprinciples.Inheritance.Camera;
import com.tonata.designprinciples.Inheritance.Equipment;
import com.tonata.designprinciples.OCP.Correction.Work;
import com.tonata.designprinciples.SRP.Correction.Email;
import com.tonata.designprinciples.SRP.Violation.*;

import com.tonata.designprinciples.service.Impl.DutiesImpl;
import com.tonata.designprinciples.service.Impl.JobEmailImpl;
import com.tonata.designprinciples.service.Impl.WorkImpl;
import com.tonata.designprinciples.service.Impl.Workers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="DIP")
    public WorkHours getService(){
        return new Workers();
    }
    @Bean(name="OCP")
    public Work getService1(){
        return new WorkImpl();
    }
    @Bean(name="SRP")
    public Email getService2(){
        return new JobEmailImpl();
    }
    
    @Bean(name="ISP")
    public Duties getService3(){
        return new DutiesImpl();
    }
    @Bean(name="Inheritance")
    public Equipment getService4(){
        return new Camera();
    }
    
}
