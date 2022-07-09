/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int type;
        System.out.println("Qual das opções você quer?\n> 01 - Lista simples;\n> 02 - Pilha;\n> 03 - Fila;\n> 04 - Lista dupla;");
        type = scan.nextInt();
        while(type < 1 || type > 4){
            System.out.print("Opção Inválida! Escolha de 1 a 4: ");
            type = scan.nextInt();
        }    
        Menu menu = new Menu(type);
        menu.createMenu();
    }
}
