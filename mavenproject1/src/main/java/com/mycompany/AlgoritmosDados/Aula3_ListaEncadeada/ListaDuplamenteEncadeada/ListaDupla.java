/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaDuplamenteEncadeada;

/**
 *
 * @author vludvig
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
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
    
    public void retirar(){
        
    }
    
    public void exibirOrdemInversa(){
        
    }
}
