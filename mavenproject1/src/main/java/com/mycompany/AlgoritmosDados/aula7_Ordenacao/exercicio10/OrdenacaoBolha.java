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
    
    //@Override
    public void ordenarByVitor(){
        T[] vetor = this.getInfo();
        
        for(int i = vetor.length - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(vetor[j].compareTo(vetor[j +1]) > 0){
                    trocar(j, j+1);
                }
            }
        }
    }
    
    @Override
    public void ordenar(){
        T[] vetor = this.getInfo();
        int i;
        int j;
        int n = getInfo().length;
        
        for(i = n - 1; i >= 1; i--){
            for(j = 0; j < i; j++){
                if(vetor[j].compareTo(vetor[j +1]) > 0){
                    trocar(j, j+1);
                }
            }
        }
    }
    
    @Override
    public String toString(){
        String texto = "";
        for(int i = 0; i < this.getInfo().length; i++){
            texto += this.getInfo()[i] + ", ";
        }
        return texto;
    }
    
}
