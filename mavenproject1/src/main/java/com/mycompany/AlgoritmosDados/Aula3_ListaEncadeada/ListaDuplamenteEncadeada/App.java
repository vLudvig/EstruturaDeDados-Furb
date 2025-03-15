/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaDuplamenteEncadeada;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        ListaDupla<Integer> lista = new ListaDupla<>();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        
        System.out.println("Valor " + lista.buscar(3).getInfo());
        
        //lista.retirar(1);
        System.out.println("Lista Duplamente encadeada " + lista.toString());
    }
}
