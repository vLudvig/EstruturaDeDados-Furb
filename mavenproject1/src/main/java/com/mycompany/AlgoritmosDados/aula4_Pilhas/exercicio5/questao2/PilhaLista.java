/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5.questao2;

import com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5.questao1.Pilha;
import com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada.*;

/**
 *
 * @author User
 */
public class PilhaLista<T> implements Pilha<T>{
    private ListaEncadeada<T> lista;
    
    public PilhaLista(){
        this.lista = new ListaEncadeada<>();
    }
    
    @Override
    public void push(T info){
        this.lista.inserir(info);
    }
    
    @Override
    public T pop(){
        T temp = this.lista.getPrimeiro().getInfo();
        this.lista.retirar(temp);
        return temp;
    }
    
    @Override
    public T peek(){
        return this.lista.getPrimeiro().getInfo();
    }
    
    @Override
    public boolean estaVazia(){
        return this.lista.estaVazia();
    }
    
    @Override
    public void liberar(){
        this.lista.liberar();
    }
    
    @Override
    public String toString(){
        return this.lista.toString();
    }
}
