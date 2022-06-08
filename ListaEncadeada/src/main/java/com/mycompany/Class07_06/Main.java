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
        Lista list = new Lista();
        int opt, pos, elem;
        while(true){
            System.out.println("\n---------------------------------------------------");
            System.out.println("01 - Imprimir Lista;");
            System.out.println("02 - Inserir no inicio;");
            System.out.println("03 - Inserir no meio;");
            System.out.println("04 - Inserir no fim;");
            System.out.println("05 - Remover do inicio;");
            System.out.println("06 - Remover do meio;");
            System.out.println("07 - Remover do fim;");
            System.out.println("08 - Buscar elemento;");
            System.out.println("09 - Tamanho da lista;");
            System.out.println("0 - Finalizar;");
            opt = scan.nextInt();
            switch(opt){
                case 1:
                    System.out.println(list);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            if(opt == 0) break;
        }
    }
}
