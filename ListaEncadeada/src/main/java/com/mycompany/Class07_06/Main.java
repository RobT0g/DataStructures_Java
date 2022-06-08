/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String [] args){
        Lista list = new Lista();
        list.insertAt(10, 1);
        list.push(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.push(2);
        list.push(3);
        list.push(4);
        //4 3 2 1 10 2 2 3 4
        list.insertAt(10, 5);
        list.insertAt(12, 4);
        list.insertAt(13, 3);
        System.out.println(list);
    }
}
