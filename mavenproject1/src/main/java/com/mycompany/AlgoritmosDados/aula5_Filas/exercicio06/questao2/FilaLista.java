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
    private ListaEncadeada<T> info;
    
    public FilaLista() {
        this.info = new ListaEncadeada();
    }
    
    @Override
    public void inserir(T valor){
        info.inserirNoFinal(valor);
    }
    
    @Override
    public boolean estaVazia(){
        return info.estaVazia();
    }
    
    @Override
    public T peek(){
        return info.getPrimeiro().getInfo();
    }
    
    @Override
    public T retirar(){
        T valor = this.peek();
        info.retirar(valor);
        
        return valor;
    }
    
    @Override
    public void liberar(){
        info.liberar();
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
}
