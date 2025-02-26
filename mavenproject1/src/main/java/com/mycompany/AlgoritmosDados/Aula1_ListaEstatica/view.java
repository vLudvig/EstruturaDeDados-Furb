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
        
        for(int i = 0; i < 23; i++){
            listaEstatica.inserir(i);
        }
        
        listaEstatica.exibir();
    //    System.out.println(listaEstatica.toString());
    }
}
