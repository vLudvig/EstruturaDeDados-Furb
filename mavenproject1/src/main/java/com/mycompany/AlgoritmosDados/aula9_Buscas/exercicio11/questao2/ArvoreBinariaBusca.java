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
        
    }
    
    @Override
    public NoArvoreBinaria<T> buscar(T info){
        return buscar(this.getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info){
        if(no == null){
            return null;
        }
        
        return null;
    }
}
