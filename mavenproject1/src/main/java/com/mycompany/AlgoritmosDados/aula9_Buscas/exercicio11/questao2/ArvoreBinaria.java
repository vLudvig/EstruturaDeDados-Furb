/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao2;

/**
 *
 * @author ludvig
 */
public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T>{
    @Override 
    public NoArvoreBinaria<T> buscar(T info){
        return buscar(this.getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info){
        if(no == null){
           return null; 
        }
        
        if(no.getInfo().equals(info)){
           return no; 
        }
        
        NoArvoreBinaria<T> resultado = buscar(no.getEsquerda(),info);
        
        if(resultado != null){
           return resultado;
        }
        
        return buscar(no.getDireita(), info);
    }
}
