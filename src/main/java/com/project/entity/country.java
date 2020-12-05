/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author ishma
 */
@Entity
@Table(name="COUNTRY")
public class country {
    
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
 
 @Column(name="COUNTRY")
 private String name;
 
 @Column(name="CONTINENT")
 private String continent;
 
 @Column(name="SIZE")
 private Integer size;
 
 @Column(name="PRESIDENT")
 private String president;
 
 public void setid(Long id){
     this.id=id;
 }
 
 public Long getid(){
     return id;
 }
 
 public void setname(String name){
     this.name=name;
 }
 
 public String getname(){
     return name;
 }
 
 public void setsize(Integer size){
     this.size=size;
 }
 
 public Integer getsize(){
     return size;
 }
 
 public void setpresident(String president){
     this.president=president;
 }
 
 public String getpresident(){
     return president;
 }
}
