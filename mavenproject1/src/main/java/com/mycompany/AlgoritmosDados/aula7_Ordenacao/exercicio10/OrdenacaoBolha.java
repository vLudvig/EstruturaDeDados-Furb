/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author User
 */
public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    @Override
    public void ordenar(){
        T[] vetor = this.getInfo();
        
        for(int i = vetor.length - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(vetor[j].compareTo(vetor[j +1]) > 0){
                    trocar(j, j+1);
                }
            }
        }
    }
    
}
