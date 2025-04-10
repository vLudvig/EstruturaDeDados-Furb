/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao2;

import com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao01.Fila;

/**
 *
 * @author User
 */
public class FilaLista<T> implements Fila<T> {
    private ListaEncadeada<T> lista;
    
    public FilaLista() {
        this.lista = new ListaEncadeada();
    }
    
    @Override
    public void inserir(T valor){
        lista.inserirNoFinal(valor);
    }
    
    @Override
    public boolean estaVazia(){
        return lista.estaVazia();
    }
    
    @Override
    public T peek(){
        return lista.getPrimeiro().getInfo();
    }
    
    @Override
    public T retirar(){
        T valor = this.peek();
        lista.retirar(valor);
        
        return valor;
    }
    
    @Override
    public void liberar(){
        lista.liberar();
    }
    
    @Override
    public String toString(){
        return lista.toString();
    }
}
