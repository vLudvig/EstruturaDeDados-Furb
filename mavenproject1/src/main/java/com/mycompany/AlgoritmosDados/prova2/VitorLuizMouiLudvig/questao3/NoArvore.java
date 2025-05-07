/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.prova2.VitorLuizMouiLudvig.questao3;

/**
 *
 * @author vludvig
 */
public class NoArvore<T> {
    private T info;
    private NoArvore<T> primeiro; //Primeiro filho a baixo
    private NoArvore<T> proximo; //Próximo irmão lateral
    
    public NoArvore(T info){
        this.info = info;
    }
    
    public void inserirFilho(NoArvore<T> sa){
        sa.proximo = this.primeiro;
        this.primeiro = sa;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }
}
