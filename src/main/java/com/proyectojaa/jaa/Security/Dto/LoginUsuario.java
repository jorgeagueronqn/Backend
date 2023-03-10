/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectojaa.jaa.Security.Dto;

import javax.validation.constraints.NotBlank;



/**
 *
 * @author Jorge
 */
public class LoginUsuario {
    //no pueden ser vacios
    @NotBlank
    private String nombreUsuario;
    private String Password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
