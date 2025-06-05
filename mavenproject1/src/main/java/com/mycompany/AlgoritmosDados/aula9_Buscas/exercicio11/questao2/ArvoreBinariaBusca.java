/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao2;

/**
 *
 * @author ludvig
 */
public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {
    public void inserir(T valor){
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(valor);
        
        if(this.getRaiz() == null){
            this.setRaiz(novo); //Caso ainda nao possuir uma raiz
        }else{
          NoArvoreBinaria<T> p = this.getRaiz();
          NoArvoreBinaria<T> pai;
          
          while(true){
              pai = p;
              
              if(valor.compareTo(p.getInfo()) < 0){ //caso valor for menor fica a esquerda 
                  p = p.getEsquerda();
                  
                  if(p == null){
                      pai.setEsquerda(novo);
                      return;
                  }
                  
              }else{ //caso valor for maior ou igual ele fica a direita 
                  p = p.getDireita();
                  
                  if(p == null){
                      pai.setDireita(novo);
                      return;
                  }
              }
          }
        }
    }
    
    @Override
    public NoArvoreBinaria<T> buscar(T info){
        return buscar(this.getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T valor){
        if(no == null){
            return null;
        }
        
        if(valor.equals(no.getInfo())){
            return no;
        }
        
        if(valor.compareTo(no.getInfo()) < 0){
            return buscar(no.getEsquerda(), valor);
        }else{
            return buscar(no.getDireita(), valor);
        }
    }
}
