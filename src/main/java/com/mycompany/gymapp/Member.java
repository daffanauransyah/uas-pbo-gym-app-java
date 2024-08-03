/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymapp;

/**
 *
 * @author sevim
 */
public class Member {
    public String name;
    public int age;
    public String address;
    
    public Member(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
}
