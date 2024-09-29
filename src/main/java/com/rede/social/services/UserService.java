/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rede.social.services;

import com.rede.social.entities.User;
import com.rede.social.repositories.UserRepository;
import com.rede.social.services.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rodri
 */

@Service //Define esta classe como uma entidade de serviço
public class UserService {
    
    @Autowired //Instancia o objeto
    private UserRepository repository;
    
    //Retorna todos os registro da tabela
    public List<User> findAll(){
        
        return repository.findAll();
        
    }
    
    //Faz uma pesquisa a tabela por id
    public User findById(Long id){
        
        Optional<User> opt = repository.findById(id);
        
        return opt.orElseThrow( () -> new ResourceNotFoundException(id) );
        
    }
    
}
