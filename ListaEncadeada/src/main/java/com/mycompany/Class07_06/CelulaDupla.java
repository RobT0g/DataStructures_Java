/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

/**
 *
 * @author Aluno
 */
public class CelulaDupla {
    private CelulaDupla prox;
    private CelulaDupla ante;
    private Object elem;
    
    public CelulaDupla(Object elem, CelulaDupla prox){
        this.prox = prox;
        this.elem = elem;
    }
    
    public CelulaDupla(Object elem){
        this.elem = elem;
    }

    public CelulaDupla getProx() {
        return prox;
    }

    public void setProx(CelulaDupla prox) {
        this.prox = prox;
    }
    
    public CelulaDupla getAnte() {
        return this.ante;
    }

    public void setAnte(CelulaDupla ante) {
        this.ante = ante;
    }

    public Object getElem() {
        return elem;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }
}
