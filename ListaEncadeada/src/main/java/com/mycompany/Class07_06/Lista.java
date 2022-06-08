/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

/**
 *
 * @author Aluno
 */
public class Lista {
    private Celula ini;
    private Celula fim;
    private int tam;
    
    public Lista(){
        this.ini = this.fim = null;
        this.tam = 0;
    }
    
    public void insert(Object elem){
       this.ini = new Celula(elem, this.ini);
       this.tam++;
       if(this.tam == 1)
           this.fim = this.ini;
    }
}
