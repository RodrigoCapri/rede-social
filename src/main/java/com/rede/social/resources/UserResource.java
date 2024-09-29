/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rede.social.resources;

import com.rede.social.entities.User;
import com.rede.social.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodri
 */

@RestController //Classe de controle que disponibiliza os recursos
@RequestMapping(value = "/users") //Caminho http para acessar os recursos desta classe
public class UserResource {
    
    @Autowired
    private UserService service;
    
    //Faz uma requisição simples que retorna todos os elementos da tabela
    @GetMapping //@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity< List<User> > findAll(){
        
        List<User> list = service.findAll();
        
        return ResponseEntity.ok().body(list);
                
    }
    
    //Faz uma resquisição com parametro para retornar apenas um registro específico
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity< User > findById(@PathVariable Long id){
        
        User obj = service.findById(id);
        
        return ResponseEntity.ok().body(obj);
        
    }
    
}
