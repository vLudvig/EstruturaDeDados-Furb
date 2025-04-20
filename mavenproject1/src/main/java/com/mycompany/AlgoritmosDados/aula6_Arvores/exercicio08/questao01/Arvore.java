/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio08.questao01;

/**
 *
 * @author vludvig
 */
public class Arvore<T> {
    private NoArvore raiz;
    
    public Arvore(){
        this.raiz = null;
    }

    public void setRaiz(NoArvore raiz) {
        this.raiz = raiz;
    }

    public NoArvore getRaiz() {
        return raiz;
    }
    
    public String toString(){
        if(this.raiz == null){
            return "";
        }
        return obterRepresentacaoTextual(this.raiz);
    }   
    
    public String obterRepresentacaoTextual(NoArvore<T> no){
        var p = no.getPrimeiro();
        String texto = "<" + no.getInfo();
        
        while(p != null){
            texto += obterRepresentacaoTextual(p);
            p = p.getProximo();//percorre todos os irmãos;
        }
        texto += ">";
        return texto;
    }
    
    public boolean pertence(T info){
        if(this.raiz == null){
            return false;
        }
        return pertence(this.raiz, info);
    }
    
    private boolean pertence(NoArvore<T> no, T info){
        if(no.getInfo() == info){
            return true;
        }
        var p = no.getPrimeiro();
        while(p != null){
            if(p.getInfo() == info){
                return true;
            }else{
                p = p.getProximo();
            }
        }
        return false;
    }
    
    public int contarNos(){
        if(this.raiz == null){
            return 0;
        }
        return contarNos(this.raiz);
    }
    
    private int contarNos(NoArvore<T> no){
        int quantidadeNos = 1;
        var p = no.getPrimeiro();
        
        while(p != null){
            quantidadeNos += contarNos(p);
            p = p.getProximo();
        }
        
        return quantidadeNos;
    }
}
