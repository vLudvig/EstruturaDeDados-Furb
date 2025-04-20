/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio08.questao01;

/**
 *
 * @author vludvig
 */
public class NoArvore<T> {
    private T info;
    private NoArvore primeiro; //Primeiro filho a baixo
    private NoArvore proximo; //Próximo irmão lateral
    
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

    public NoArvore getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore proximo) {
        this.proximo = proximo;
    }
}
