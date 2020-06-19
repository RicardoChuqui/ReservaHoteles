
package Controlador;

import Modelo.Cliente;
import Modelo.Persona;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author jhonn
 */
public class ControladorCliente {
    
    private int id;
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
    
    public void crear(int codigo, Cliente l) {
        listaPersona.put(codigo, l);
        cont++;
    }

    public void actualizar(int codigo, Cliente nuevo) {
        listaPersona.replace(codigo, nuevo);
    }
    public Cliente leer(int codigo){
        Cliente l = (Cliente)listaPersona.get(codigo);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
