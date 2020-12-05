/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.service;

import java.util.List;
import com.project.entity.country;
/**
 *
 * @author ishma
 */
public interface countryservice {
    
    public List<country> retriveCountry();
    
    public country getCountry(Long id);
    
    public void saveCountry(country cont);
    
    public void deleteCountry(Long id);
    
    public void updateCountry(country cont);
}
