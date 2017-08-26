///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mypack.demo.controllers;
//
//import com.mypack.demo.entities.Student;
//import com.mypack.demo.repositories.StudentRepository;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author suresh
// */
//@RestController
//public class ConfigurationController {
//    @Autowired
//    private StudentRepository studentrepository;
//    @GetMapping("/students/**")
//   public  ResponseEntity<List<Student>> listAllstudent(){
//    List<Student> stdList =    studentrepository.findAll();
//    return (ResponseEntity<List<Student>>) stdList;
//        
//    }
//            }
