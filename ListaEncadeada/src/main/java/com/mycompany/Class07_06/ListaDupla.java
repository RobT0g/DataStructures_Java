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
public class ListaDupla {
    private CelulaDupla ini;
    private CelulaDupla fim;
    private int tam;
    
    public ListaDupla(){
        this.ini = this.fim = null;
        this.tam = 0;
    }
    
    public void insert(Object elem){
       this.ini = new CelulaDupla(elem, this.ini);
       this.tam++;
       if(this.tam == 1)
           this.fim = this.ini;
    }
    
    public void push(Object elem){
        if(this.tam == 0){
            this.insert(elem);
        } else {
            CelulaDupla nova = new CelulaDupla(elem);
            nova.setAnte(this.fim);
            this.fim.setProx(nova);
            this.fim = nova;
            this.tam++;
        }
    }
    
    public void insertAt(Object elem, int pos){
        if(pos == 1){
            this.insert(elem);
        } else if(pos == this.tam+1){
            this.push(elem);
        } else{
        CelulaDupla cel = this.getCelAt(pos-1);
            if(cel != null){
                CelulaDupla nova = new CelulaDupla(elem, cel.getProx());
                nova.setAnte(cel);
                cel.getProx().setAnte(nova);
                cel.setProx(nova);
                this.tam++;
            }
        }
    }
    
    private CelulaDupla getCelAt(int pos){
        return this.iterate(pos, false);
    }

    private CelulaDupla iterate(int pos, boolean print){
        if(!this.occupied(pos) || this.tam == 0){
            return null;
        }
        CelulaDupla cur = this.ini;
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
        CelulaDupla cur = this.ini;
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

    public void removeFirst(){
        if(this.tam == 1)
            this.fim = this.ini = null;
        else if(this.tam > 1){
            this.ini = this.ini.getProx();
            if(this.ini != null){
                this.ini.setAnte(null);
            }
        }
        this.tam--;
    }
    
    public void removeLast(){
        if(this.tam <= 1){
            this.removeFirst();
        } else {
            CelulaDupla ant = this.getCelAt(this.tam-1);
            ant.setProx(null);
            this.tam--;
        }
    }

    public void removeAt(int pos){
        if(pos == 1){
            this.removeFirst();
        } else if(pos == this.tam){
            this.removeLast();
        } else {
            CelulaDupla ant = this.getCelAt(pos-1);
            if(ant != null){
                ant.getProx().getProx().setProx(ant);
                ant.setProx(ant.getProx().getProx());
                this.tam--;
            }
        }
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
