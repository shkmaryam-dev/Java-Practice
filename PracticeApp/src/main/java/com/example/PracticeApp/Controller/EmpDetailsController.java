/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PracticeApp.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
public class EmpDetailsController {
   private static List<String> data = new ArrayList<>();
   static{
       data.add("Maryam");
       data.add("Muzammil");
       data.add("Aaysha");
       data.add("Baby");
       data.add("Fatema");
       data.add("Ammar");
   }
   
   @GetMapping("/getData")
   public List<String> getData(){
      return data;
   }
   
   @PostMapping("/addData")
   public void addData(){
       data.add("abc");
   }
   
   @DeleteMapping("/deleteData")
   public void deleteData(){
       data.remove(5);
   }
   
   @PutMapping("/updateData")
   public void updateData(){
       data.set(0, "Maryam SHaikh");
   }
}
