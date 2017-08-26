/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.repositories;

import com.mypack.demo.entities.User;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author suresh
 */
public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username); 
}
