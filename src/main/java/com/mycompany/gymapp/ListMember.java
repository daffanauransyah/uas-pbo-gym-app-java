/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sevim
 */
public class ListMember {
     private List<Member> items;

    public ListMember() {
        this.items = new ArrayList<>();
    }

    public void addMember(String name, int age, String address) { 
        Member member = new Member(name, age, address);
        items.add(member);
    }
    
      public List<Member> getItems() {
        return items;
    }
}

