/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rede.social.repositories;

import com.rede.social.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodri
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}
