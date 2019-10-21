/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.Carro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author dalej
 */
@Named(value = "carroBean")
@RequestScoped
public class CarroBean implements Serializable {

  private Carro carro = new Carro();
  private static List<Carro> listaCarros = new ArrayList();

    @PostConstruct
    public void CarroBean(){
        carro.listarAños();
    }
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }
    public void agregarCarro(){
        this.listaCarros.add(this.carro);
    }
  
}
