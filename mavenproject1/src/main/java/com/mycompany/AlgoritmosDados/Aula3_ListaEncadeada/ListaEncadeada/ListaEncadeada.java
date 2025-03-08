/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada;

/**
 *
 * @author vludvig
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
       
    public ListaEncadeada(){
        this.primeiro = null;
    }
    
    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista novo = new NoLista<T>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }
    
    public NoLista<T> buscar(T valor){
        NoLista<T> p = this.primeiro;
        while(p != null){
            if(p.getInfo() == valor){
                return p;
            }
            p = p.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor){
        NoLista<T> anterior = null;
        NoLista<T> p = this.primeiro;
        
        while(p != null && !p.getInfo().equals(valor)){
            anterior = p;
            p = p.getProximo();
        }
        
        if(p != null){
            if(p == this.primeiro){
                this.primeiro = p.getProximo();
            }else{
               anterior.setProximo(p.getProximo()); 
            }
        }
    }
    
    public int obterComprimento(){
        NoLista<T> p = this.primeiro;
        int tamanho = 0;
        while(p != null){
            p = p.getProximo();
            tamanho++;
        }
        
        return tamanho;
    }
}
