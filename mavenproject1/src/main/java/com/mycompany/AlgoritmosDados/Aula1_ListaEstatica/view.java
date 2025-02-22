/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula1_ListaEstatica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class view {
    public static void main(String[] args) {
        Lista listaEstatica = new Lista();
        Scanner read = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++){
            System.out.println("Escreva um valor para ser inserido no vetor");
            int valor = read.nextInt();
        
            listaEstatica.inserir(valor);
        }
        
        listaEstatica.exibir();
        
        System.out.println("Escolha um valor para ser retirado do Vetor");
        int valor = read.nextInt();
        listaEstatica.retirar(valor);
        
        listaEstatica.exibir();
        
        System.out.println("Digite uma posicao para descobrir o valor desta");
        valor = read.nextInt();
        System.out.println("Valor da posicao " + valor +
                " eh " + listaEstatica.obterElemento(valor));
        
        System.out.println(listaEstatica.toString());
    }
}
