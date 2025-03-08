/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada;

import java.util.Scanner;

/**
 *
 * @author ludvi
 */
public class APP {
    public static void main(String[] args) {
        ListaEncadeada<Double> a = new ListaEncadeada();
        System.out.println("TESTESS");
        
        a.inserir(2.0);
        a.inserir(3.0);
        a.inserir(4.0);
        a.retirar(3.0);
        System.out.println("Tamanho " + a.obterComprimento());
    }
}
