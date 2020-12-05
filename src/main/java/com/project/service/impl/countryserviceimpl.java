/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.service.countryservice;
import com.project.repo.repository;
import com.project.entity.country;
/**
 *
 * @author ishma
 */
@Service
public class countryserviceimpl implements countryservice {

 @Autowired
 private repository rep;
 
 public void setrepo(repository rep){
     this.rep=rep;
 }
 
 public List<country> retriveCountry(){
   List<country> countries=rep.findAll();
   return countries;
 }

    @Override
    public country getCountry(Long id) {
        Optional<country> optcon=rep.findById(id);
        return optcon.get();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveCountry(country cont) {
        rep.save(cont);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCountry(Long id) {
        rep.deleteById(id);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCountry(country cont) {
        rep.save(cont);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
