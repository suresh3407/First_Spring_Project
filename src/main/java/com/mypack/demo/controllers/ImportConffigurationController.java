/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.controllers;

import com.mypack.demo.configuration.ImportConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author suresh
 */
@RestController

public class ImportConffigurationController {
  @Autowired
  private ImportConfiguration importConfiguration;
  @GetMapping("/imp")
  public String getFile(){
String fileDirectory =      importConfiguration.getFileDirectory();
return fileDirectory;      
  }
    
}
