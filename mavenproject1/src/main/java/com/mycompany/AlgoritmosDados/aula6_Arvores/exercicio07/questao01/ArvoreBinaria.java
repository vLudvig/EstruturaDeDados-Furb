/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio07.questao01;

/**
 *
 * @author User
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }
    
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }
    
    public boolean estaVazia(){
        return raiz == null;
    }
    
    public boolean pertence(T info){
        return pertence(this.raiz, info);
    }
    
    private boolean pertence(NoArvoreBinaria<T> no, T info){
        if(no == null){
           return false; 
        }else{
            return no.getInfo() == info 
                   || pertence(no.getEsquerda(), info)
                   || pertence(no.getDireita(), info);
        }
    }
    
    @Override
    public String toString(){
        return arvorePre(this.raiz);
    }
    
    private String arvorePre(NoArvoreBinaria<T> no){
        if(no == null){
            return "<>";
        }
        
        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
    }
    
    public int contarNos(){
        return contarNos(this.raiz);
    }
    
    private int contarNos(NoArvoreBinaria<T> no){
        if(no == null){
            return 0;
        }
        
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
}
