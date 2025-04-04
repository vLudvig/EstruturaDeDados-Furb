/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao01;

/**
 *
 * @author vludvig
 */
public class FilaVetor<T> implements Fila<T> {
    private Object info[];
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limite){
        this.info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) throws FilaCheiaException {
        if(this.tamanho == this.limite){
            throw new FilaCheiaException();
        }
        this.info[(inicio + tamanho)% limite] = valor;
        this.tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public T peek() {
        if(estaVazia()){
            throw new FilaVaziaException();
        }
        
        return (T) this.info[this.inicio];
    }

    @Override
    public T retirar() {
        T valor = this.peek();
        this.info[this.inicio] = null;
        this.inicio++;
        this.tamanho--;
        
        if(this.inicio == this.limite){
            this.inicio = 0;
        }
        
        return valor;
    }

    @Override
    public void liberar() {
        for(int i = 0; i < this.info.length; i++){
            info[i] = null;
        }
        
        this.tamanho = 0;
        this.inicio = 0;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        f2 = this;
        
        return f2;
    }
    
    
}
