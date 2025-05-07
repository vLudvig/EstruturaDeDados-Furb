/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.prova2.VitorLuizMouiLudvig.questao1;

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
        
        this.inicio = (inicio + 1) % limite;
        this.tamanho--;
        
        return valor;
    }

    @Override
    public void liberar() {
        int posicao = this.inicio;
        for(int i = 0; i < this.tamanho; i++){
            posicao = (posicao + i) % this.limite;
            info[posicao] = null;
        }
        
        this.tamanho = 0;
        this.inicio = 0;
    }
    
    public FilaVetor<T> criarFilaConcatenadaByVitor(FilaVetor<T> f2){
       FilaVetor novaFila = new FilaVetor(this.limite + f2.limite); 
       int posicaoF1 = this.inicio;
       int posicaoF2 = f2.inicio;
       
       for(int i = 0; i < this.tamanho + f2.tamanho; i++){
           if(i < this.tamanho){
               novaFila.inserir(this.info[posicaoF1]);
               if(posicaoF1 + this.tamanho > this.limite){
                   posicaoF1 = (this.inicio + this.tamanho) % this.limite;
               }else{
                   posicaoF1++;
               }
           }         
           
           if(i >= this.tamanho){
               novaFila.inserir(f2.info[posicaoF2]);
               if(posicaoF2 + f2.tamanho > f2.limite){
                   posicaoF2 = (f2.inicio + f2.tamanho) % f2.limite;
               }else{
                   posicaoF2++;
               }
           }
       }
        
        return novaFila;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
       FilaVetor novaFila = new FilaVetor(this.limite + f2.limite); 
       
       int posicao = this.inicio;
       for(int i =0; i < this.tamanho; i++){
           novaFila.inserir((T)this.info[posicao]);
           posicao = (posicao + 1) % limite;
       }
       
       posicao = f2.inicio;
       for(int i=0; i < f2.tamanho; i++){
           novaFila.inserir((T)f2.info[posicao]);
           posicao = (posicao + 1) % f2.limite;
       }
        
       return novaFila;
    }
    
    @Override
    public String toString(){
        String texto = "";
        int posicao = this.inicio;
        
        for(int i = 0; i < this.tamanho; i++){
            if(i != this.tamanho - 1){
                texto += info[posicao] + ",";
                posicao = (posicao + 1) % this.limite;
                
            }else{
                texto += info[posicao].toString();
            }
        }
         
        return texto;
    }
    
    public int getLimite(){
        return this.limite;
    }
    
    public void encolher(){
       int ini = this.inicio;
       for(int i =0; i < this.tamanho;i++ ){
           this.info[i] = info[ini];
           ini = (ini + 1) % this.limite;
       }
       Object[] novoVetor = new Object[this.tamanho];
       
       for(int i = 0; i < novoVetor.length; i++){
           novoVetor[i] = this.info[i];
       }
       
       this.info = novoVetor;
       this.limite = this.tamanho;
       this.inicio =0;
    }
}
