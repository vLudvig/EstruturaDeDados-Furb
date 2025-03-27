/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5;

/**
 *
 * @author vludvig
 */
public class PilhaVetor<T> implements Pilha<T>{
    private int limite;
    private int tamanho;
    private Object info[];

    public PilhaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }
    
    public void push(T valor){
        if(tamanho == info.length){
            throw new PilhaCheiaException();
        }
        
        info[tamanho] = valor;
        this.tamanho++;
    }
    
    public T pop(){
      if(estaVazia()){
          throw new PilhaVaziaExcpetion();
      }  
      
      T temp = (T)info[tamanho - 1];
      tamanho--;
      return temp;
    }
    
    public T peek(){
        if(estaVazia()){
            throw new PilhaVaziaExcpetion();
        }
        
        return (T)info[tamanho - 1];
    }
    
    public boolean estaVazia(){
        return tamanho == 0;
    }
    
    public void liberar(){
        for(int i = 0; i < this.tamanho - 1; i++){
            
        }
        this.tamanho = 0;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}
