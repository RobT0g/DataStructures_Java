/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

/**
 *
 * @author Aluno
 */
public class Celula {
    private Celula prox;
    private Object elem;
    
    public Celula(Celula prox, Object elem){
        this.prox = prox;
        this.elem = elem;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    public Object getElem() {
        return elem;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }
}
