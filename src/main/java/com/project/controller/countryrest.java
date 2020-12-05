/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.country;
import com.project.service.countryservice;
/**
 *
 * @author ishma
 */
@RestController
public class countryrest {
    
@Autowired
private countryservice conser;

public void setcoutryservice(countryservice conser){
    this.conser=conser;
}

@GetMapping("/api/countries")
 public List<country> getCountry() {
     List<country> countries=conser.retriveCountry();
     return countries;
 }
 
 @GetMapping("/api/countries/{id}")
 public country getCountry(@PathVariable(name="id")Long id) {
  return conser.getCountry(id);
 }
 
 @PostMapping("/api/countries")
 public void saveCountry(country con){
  conser.saveCountry(con);
  System.out.println("country Saved Successfully");
 }

 @DeleteMapping("/api/countries/{id}")
 public void deleteCountry(@PathVariable(name="id")Long id){
  conser.deleteCountry(id);
  System.out.println("Country Deleted Successfully");
 }
 
  @PutMapping("/api/countries/{id}")
   public void updateCountry(@RequestBody country cont,
   @PathVariable(name="id")Long id){
   country con = conser.getCountry(id);
   if(con != null){
   conser.updateCountry(cont);
  }
   
 }
}
