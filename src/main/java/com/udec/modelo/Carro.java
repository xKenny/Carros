/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dalej
 */
public class Carro {
    private String nombre;
    private String marca;
    private int año;
    private List<Integer> listaAños = new ArrayList();

    public void listarAños(){
        for(int i=1900;i<2020;i++){
            listaAños.add(i);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public List<Integer> getListaAños() {
        return listaAños;
    }

    public void setListaAños(List<Integer> listaAños) {
        this.listaAños = listaAños;
    }
    
}
