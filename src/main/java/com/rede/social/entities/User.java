/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rede.social.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author rodri
 */

@Entity //Define esta classe como uma classe entidade de dados
@Table(name = "tb_user") //Define o nome da entidade de dados
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id //Define o campo como uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nick;
    private String nome;
    private String email;
    private String phone;
    private String cpf;
    private String password;

    private List<String> imgUrlPerfil;
    
    public User(){
    }
    
    public User(Long id, String nick, String nome, String email, String phone, String cpf, String password, List<String> imgUrlPerfil) {
        this.id = id;
        this.nick = nick;
        this.nome = nome;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
        this.password = password;
        this.imgUrlPerfil = imgUrlPerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<String> getImgUrlPerfil() {
        return imgUrlPerfil;
    }

    public void setImgUrlPerfil(List<String> imgUrlPerfil) {
        this.imgUrlPerfil = imgUrlPerfil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nick=" + nick + ", nome=" + nome + ", email=" + email + ", phone=" + phone + ", cpf=" + cpf + ", password=" + password + ", imgUrlPerfil=" + imgUrlPerfil + '}';
    }
    
}
