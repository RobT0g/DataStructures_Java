/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

import java.util.Set;

/**
 *
 * @author Aluno
 */
public class Fila {
    private Celula ini;
    private Celula fim;
    private int tam;
    
    public Fila(){
        this.ini = this.fim = null;
        this.tam = 0;
    }
    
    public void push(Object elem){
        Celula nova = new Celula(elem);
        if(this.tam == 0){
            this.ini = this.fim = nova;
        } else {
            this.fim.setProx(nova);
            this.fim = nova;
        }
        this.tam++;
    }
    
    private Celula getCelAt(int pos){
        return this.iterate(pos, false);
    }

    private Celula iterate(int pos, boolean print){
        if(!this.occupied(pos) || this.tam == 0){
            return null;
        }
        Celula cur = this.ini;
        if(print) System.out.println(cur.getElem());
        for(int i = 1; i < pos; i++){
            cur = cur.getProx();
            if(cur == null) break;
            if(print) System.out.println(cur.getElem());
        }
        return cur;
    }
    
    public void printAll(){
        this.iterate(this.tam, true);
    }

    @Override
    public String toString(){
        if(this.tam == 0)
            return "[]";
        Celula cur = this.ini;
        String txt = "[" + cur.getElem();
        for(int i = 1; i < this.tam; i++){
            cur = cur.getProx();
            txt += ", " + cur.getElem();
        }
        return txt + "]";
    }
    
    private boolean occupied(int pos){
        return pos > 0 && pos <= this.tam;
    }
    
    public void remove(){
        if(this.tam == 1)
            this.fim = this.ini = null;
        else if(this.tam > 1){
            this.ini = this.ini.getProx();
        }
        this.tam--;
    }
    
    public boolean includes(Object elem){
        Celula cur = this.ini;
        for(int i = 0; i <= this.tam; i++){
            if(cur.getElem() == elem) return true;
            cur = cur.getProx();
        }
        return false;
    }

    public int getSize(){
        return this.tam;
    }
}
