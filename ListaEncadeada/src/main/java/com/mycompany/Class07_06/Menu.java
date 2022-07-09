/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Class07_06;

import java.util.Scanner;

/**
 *
 * @author robso
 */
public class Menu {
    private int type;
    
    Menu(int type){
        this.type = type;
    }

    void createMenu(){
        Scanner scan = new Scanner(System.in);
        int opt, pos, elem;
        if(this.type == 1){
            Lista list = new Lista();
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
                        System.out.print("Insira o valor a ser inserido no início: ");
                        elem = scan.nextInt();
                        list.insert(elem);
                        break;
                    case 3:
                        System.out.print("Insira o valor a ser inserido: ");
                        elem = scan.nextInt();
                        System.out.print("Insira a posição na qual o valor será inserido: ");
                        pos = scan.nextInt();
                        list.insertAt(elem, pos);
                        break;
                    case 4:
                        System.out.print("Insira o valor a ser inserido no final: ");
                        elem = scan.nextInt();
                        list.push(elem);
                        break;
                    case 5:
                        list.removeFirst();
                        break;
                    case 6:
                        System.out.print("Insira a posição da qual o valor será removido: ");
                        pos = scan.nextInt();
                        list.removeAt(pos);
                        break;
                    case 7:
                        list.removeLast();
                        break;
                    case 8:
                        System.out.print("Insira o valor a ser procurado: ");
                        elem = scan.nextInt();
                        System.out.println("O valor " + (list.includes(elem)?"":"não ") +"está presente na lista!");
                        break;
                    case 9:
                        System.out.println("O tamanho da lista é " + list.getSize() + ".");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                if(opt == 0) break;
            }
        } else if(this.type == 2){
            Pilha pilha = new Pilha();
            while(true){
                System.out.println("\n---------------------------------------------------");
                System.out.println("01 - Imprimir Lista;");
                System.out.println("02 - Inserir (FIM);");
                System.out.println("03 - Remover (FIM);");
                System.out.println("04 - Buscar elemento;");
                System.out.println("05 - Tamanho da lista;");
                System.out.println("0 - Finalizar;");
                opt = scan.nextInt();
                switch(opt){
                    case 1:
                        System.out.println(pilha);
                        break;
                    case 2:
                        System.out.print("Insira o valor a ser inserido: ");
                        elem = scan.nextInt();
                        pilha.push(elem);
                        break;
                    case 3:
                        pilha.remove();
                        break;
                    case 4:
                        System.out.print("Insira o valor a ser procurado: ");
                        elem = scan.nextInt();
                        System.out.println("O valor " + (pilha.includes(elem)?"":"não ") +"está presente na lista!");
                        break;
                    case 5:
                        System.out.println("O tamanho da lista é " + pilha.getSize() + ".");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                if(opt == 0) break;
            }
        } else if(this.type == 3){
            Fila fila = new Fila();
            while(true){
                System.out.println("\n---------------------------------------------------");
                System.out.println("01 - Imprimir Lista;");
                System.out.println("02 - Inserir (FIM);");
                System.out.println("03 - Remover (INICIO);");
                System.out.println("04 - Buscar elemento;");
                System.out.println("05 - Tamanho da lista;");
                System.out.println("0 - Finalizar;");
                opt = scan.nextInt();
                switch(opt){
                    case 1:
                        System.out.println(fila);
                        break;
                    case 2:
                        System.out.print("Insira o valor a ser inserido: ");
                        elem = scan.nextInt();
                        fila.push(elem);
                        break;
                    case 3:
                        fila.remove();
                        break;
                    case 4:
                        System.out.print("Insira o valor a ser procurado: ");
                        elem = scan.nextInt();
                        System.out.println("O valor " + (fila.includes(elem)?"":"não ") +"está presente na lista!");
                        break;
                    case 5:
                        System.out.println("O tamanho da lista é " + fila.getSize() + ".");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                if(opt == 0) break;
            }
        } else if(this.type == 4){
            ListaDupla list = new ListaDupla();
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
                        System.out.print("Insira o valor a ser inserido no início: ");
                        elem = scan.nextInt();
                        list.insert(elem);
                        break;
                    case 3:
                        System.out.print("Insira o valor a ser inserido: ");
                        elem = scan.nextInt();
                        System.out.print("Insira a posição na qual o valor será inserido: ");
                        pos = scan.nextInt();
                        list.insertAt(elem, pos);
                        break;
                    case 4:
                        System.out.print("Insira o valor a ser inserido no final: ");
                        elem = scan.nextInt();
                        list.push(elem);
                        break;
                    case 5:
                        list.removeFirst();
                        break;
                    case 6:
                        System.out.print("Insira a posição da qual o valor será removido: ");
                        pos = scan.nextInt();
                        list.removeAt(pos);
                        break;
                    case 7:
                        list.removeLast();
                        break;
                    case 8:
                        System.out.print("Insira o valor a ser procurado: ");
                        elem = scan.nextInt();
                        System.out.println("O valor " + (list.includes(elem)?"":"não ") +"está presente na lista!");
                        break;
                    case 9:
                        System.out.println("O tamanho da lista é " + list.getSize() + ".");
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
}
