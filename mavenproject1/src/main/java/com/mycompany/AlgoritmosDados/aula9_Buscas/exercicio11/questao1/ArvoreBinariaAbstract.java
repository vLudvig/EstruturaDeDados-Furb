/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao1;

import com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio07.questao01.*;

/**
 *
 * @author User
 */
public abstract class ArvoreBinariaAbstract<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract(){
        this.raiz = null;
    }
    
    protected void setRaiz(NoArvoreBinaria<T> raiz) {
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
    
     public void inverter() {
        this.inverter(this.raiz);
    }
    
    private void inverter(NoArvoreBinaria<T> no) {
        if (no == null) {
            return;
        }

        var direita = no.getDireita();
        var esquerda = no.getEsquerda();
        no.setDireita(esquerda);
        no.setEsquerda(direita);

        this.inverter(esquerda);
        this.inverter(direita);
    }
    
    public void fromString(String str) {
        this.raiz = this.noFromString(str);
    }

    public NoArvoreBinaria<T> noFromString(String str) {
        if (str.equals("<>")) {
            return null;
        }

        String strValores = str.substring(1, str.length() - 1); // remove < e > finais

        int idxInicioEsquerda = strValores.indexOf('<');
        int idxFimEsquerda = this.buscarIndexFinalEsquerda(idxInicioEsquerda, strValores);

        var valorStr = strValores.substring(0, idxInicioEsquerda);
        Integer valor = Integer.parseInt(valorStr); // infelizmente é obrigatório usar integer

        var no = new NoArvoreBinaria<T>();
        no.setInfo((T) valor);

        String strEsquerda = strValores.substring(idxInicioEsquerda, idxFimEsquerda + 1);
        var noEsquerda = this.noFromString(strEsquerda);
        no.setEsquerda(noEsquerda);

        String strDireita = strValores.substring(idxFimEsquerda + 1, strValores.length());
        var noDireita = this.noFromString(strDireita);
        no.setDireita(noDireita);

        return no;
    }
    
    private int buscarIndexFinalEsquerda(int inicio, String str) {
        int idxFimEsquerda = 0;
        int controle = 1;
        for (int idx = inicio; idx < str.length(); idx++) {
            if (str.charAt(idx) == '<') {
                controle++;
            } else if (str.charAt(idx) == '>') {
                controle--;
            }

            if (controle <= 1) {
                idxFimEsquerda = idx;
                break;
            }
        }
        return idxFimEsquerda;
    }
}
