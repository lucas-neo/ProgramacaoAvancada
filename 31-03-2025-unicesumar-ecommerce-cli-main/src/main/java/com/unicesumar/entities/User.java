package com.unicesumar.entities;

import java.util.UUID;

public class User extends Entity {

    private String name;
    private String email;
    private String password;

    public User (UUID uuid, String name, String email, String password){
        super(uuid);
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return this.password;
    }
    void setPassword(String password){
        this.password = password;
    }
    @Override
    public String toString() {
        return String.format("Usuario: %s | Email: %s | Senha: %s | UUID: %s", name, email, password, getUuid());
    }
    
}
