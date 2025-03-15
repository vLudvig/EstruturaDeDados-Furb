/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaDuplamenteEncadeada;

import com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada.ListaEncadeada;

/**
 *
 * @author vludvig
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;
    private int tamanho;

    public ListaDupla() {
        this.primeiro = null;
        this.tamanho = 0;
    }
    
    public NoListaDupla<T> getPrimeiro(){
        return this.primeiro;
    }
    
    public void inserir(T valor){
        NoListaDupla<T> p = new NoListaDupla<>();
        p.setInfo(valor);
        p.setProximo(this.primeiro);
        p.setAnterior(null);
        
        if(this.primeiro != null){
            this.primeiro.setAnterior(p);
        }
        
        this.primeiro = p;
        this.tamanho++;
    }
    
    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> p = new NoListaDupla<>();
        p = this.primeiro;
        while(p != null && !p.getInfo().equals(valor)){
            p = p.getProximo();
        }
        
        if(p != null){
            return p;
        }
        
        return null;
    }
    
    public void retirar(T valor){
        NoListaDupla<T> p = this.buscar(valor);
        
        if(p != null){
            if(p == this.primeiro){//valida se esta na primeira posicao
                this.primeiro = p.getProximo();
            }else{
                p.getAnterior().setProximo(p.getProximo());
            }
            if(p.getProximo() != null){//valida se não esta na ultima posicao
                p.getProximo().setAnterior(p.getAnterior());
            }
            tamanho--;
        }  
    }
    
    public void exibirOrdemInversa(){
        ListaDupla<T> lista = new ListaDupla<>();
        NoListaDupla<T> p = this.primeiro;
        
        while(p != null){
          lista.inserir(p.getInfo());
          p = p.getProximo();
        }
        
        System.out.println("Inversa: " + lista.toString());
    }
    
    public void liberar(){
        NoListaDupla<T> p = this.primeiro;

        while(p.getProximo() != null){
            p = p.getProximo();
            
            System.out.println("liberou");
        }
    }
    
    @Override
    public String toString(){
        String texto = "";
        NoListaDupla<T> p = this.primeiro;
        
        for(int i = 0; i < this.tamanho; i++){
            if(i != this.tamanho - 1){
                texto += p.getInfo() + ", ";
            }else{
                texto += p.getInfo();
            }
            
            p = p.getProximo();
        } 
        return texto;
    }
}
