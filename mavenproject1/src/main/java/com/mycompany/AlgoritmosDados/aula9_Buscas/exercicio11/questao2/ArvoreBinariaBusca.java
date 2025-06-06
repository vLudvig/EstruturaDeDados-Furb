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
    
    public void retirar(T valor){
        NoArvoreBinaria<T> p = this.getRaiz();
        NoArvoreBinaria<T> pai = null;
        boolean filhoEsquerda = false;
        
        //Localizar no a ser removido
        while(p != null && !p.getInfo().equals(valor)){
            pai = p;
            if(valor.compareTo(p.getInfo()) < 0){
                filhoEsquerda = true;
                p = p.getEsquerda();
            }else{
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }
        
        if(p != null){
            //se verdadeiro, o no a ser removido é uma folha!
            if(p.getEsquerda() == null && p.getDireita() == null){
                if(p.equals(this.getRaiz())){
                    this.setRaiz(null);
                }else{
                    if(filhoEsquerda){
                        pai.setEsquerda(null);
                    }else{
                        pai.setDireita(null);
                    }
                }
            }else{
                //Se verdadeiro(caso 2) no com um filho a esquerda
                if(p.getDireita() == null){
                    if(p.equals(this.getRaiz())){
                        this.setRaiz(p.getEsquerda());
                    }else{
                        if(filhoEsquerda){
                            pai.setEsquerda(p.getEsquerda());
                        }else{
                            pai.setDireita(p.getEsquerda());
                        }
                    }
                }else{//caso 2 mas o no a ser removido possui o filho a direita
                    if(p.getEsquerda() == null){
                        if(p.equals(this.getRaiz())){
                            this.setRaiz(p.getDireita());
                        }else{
                            if(filhoEsquerda){
                                pai.setEsquerda(p.getDireita());
                            }else{
                                pai.setDireita(p.getDireita());
                            }
                        }
                    }else{//Nó com DOIS filhos
                        NoArvoreBinaria<T> sucessor = extrairSucessor(p);
                        
                        if(p.equals(this.getRaiz())){
                            this.setRaiz(sucessor);
                        }else{
                            if(filhoEsquerda){
                                pai.setEsquerda(sucessor);
                            }else{
                                pai.setDireita(sucessor);
                            }
                        }
                        
                        sucessor.setEsquerda(p.getEsquerda());
                    }
                }
            }
        }
    }
    
    public NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> p){
        NoArvoreBinaria<T> atual = p.getDireita();
        NoArvoreBinaria<T> paiSucessor = p;
        NoArvoreBinaria<T> sucessor = p;
        
        while(atual != null){
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }
        
        if(sucessor.equals(p.getDireita())){
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }
        
        return sucessor;
    }
    
}
