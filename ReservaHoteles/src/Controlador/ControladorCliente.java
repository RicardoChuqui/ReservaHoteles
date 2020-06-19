/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author jhonn
 */
public class ControladorCliente {
    
    private SortedMap listaPersona;
    int cont;

    public ControladorCliente() 
    {
        listaPersona = new TreeMap();
        cont = 1;
    }

    public SortedMap getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(SortedMap listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public void crear(int codigo, Persona l) {
        listaPersona.put(codigo, l);
        cont++;
    }

    public void actualizar(int codigo, Persona nuevo) {
        listaPersona.replace(codigo, nuevo);
    }
    public Persona leer(int codigo){
        Persona l = (Persona)listaPersona.get(codigo);
        return l;
    }
    public void eliminar (int codigo){
        listaPersona.remove(codigo);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
