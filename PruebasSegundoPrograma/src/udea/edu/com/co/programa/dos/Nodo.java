/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea.edu.com.co.programa.dos;

/**
 *
 * @author DAVID, SANTIAGO, RAFAEL
 */
public class Nodo {
    private double dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(double dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Nodo(){
        
    }
    
    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
