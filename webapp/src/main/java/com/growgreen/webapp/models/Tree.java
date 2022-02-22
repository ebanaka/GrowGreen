package com.growgreen.webapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//test comments
@Entity
@Table(name = "Trees")
public class Tree {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public long Id;

   public String Name;

   public Tree(String name) {
      this.Name = name;
   }

   
   public String getName() {
      return Name;
  }

  public void setName(String name) {
      this.Name = name;
  }

}
