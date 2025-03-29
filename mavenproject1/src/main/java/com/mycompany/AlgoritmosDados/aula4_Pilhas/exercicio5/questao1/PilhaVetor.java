/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula4_Pilhas.exercicio5.questao1;

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
    
    @Override
    public void push(T valor){
        if(tamanho == this.limite){
            throw new PilhaCheiaException();
        }
        
        info[tamanho] = valor;
        this.tamanho++;
    }
    
    @Override
    public T pop(){
      if(estaVazia()){
          throw new PilhaVaziaExcpetion();
      }  
      
      T temp = (T)info[tamanho - 1];
      info[tamanho] = null;
      tamanho--;
      return temp;
    }
    
    @Override
    public T peek(){
        if(estaVazia()){
            throw new PilhaVaziaExcpetion();
        }
        
        return (T)info[tamanho - 1];
    }
    
    @Override
    public boolean estaVazia(){
        return tamanho == 0;
    }
    
    @Override
    public void liberar(){
        for(int i = 0; i < this.tamanho - 1; i++){
            info[i] = null;
        }
        this.tamanho = 0;
    }
    
    @Override
    public String toString(){
        String texto = "";
        int tamanhoTemp = this.tamanho;
        
        while(tamanhoTemp > 0){
            if(tamanhoTemp - 1 == 0){
                texto += info[tamanhoTemp - 1];
                tamanhoTemp--;
            }else{
                texto += info[tamanhoTemp - 1] + ",";
                tamanhoTemp--;
            }
        }
        
        return texto;
    }
    
    public void concatenar(PilhaVetor<T> p) throws IndexOutOfBoundsException{
        if(p.tamanho + this.tamanho > this.limite){
            throw new IndexOutOfBoundsException();
        }
        
        for(int i = 0; i < p.tamanho; i++){
            this.push((T)p.info[i]);
        }
    }
}
