/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jhonn
 */
public class Gerente extends Persona{
    private String codigo_gerente;

    public Gerente() {
    }

    public Gerente(String codigo_gerente) {
        this.codigo_gerente = codigo_gerente;
    }

    public String getCodigo_gerente() {
        return codigo_gerente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_gerente = codigo_gerente;
    }
    
}