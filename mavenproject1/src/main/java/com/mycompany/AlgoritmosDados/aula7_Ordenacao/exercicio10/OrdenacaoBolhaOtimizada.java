/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author User
 */
public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T>{
    
    @Override
    public void ordenar(){
        /**
         * variavel local que referencia a mesma variavel da superClasse 
         * (ao alterar "vetor", info da super classe tbm altera)
        */
        T[] vetor = this.getInfo(); 
        
        boolean trocou;
        
        for(int i = vetor.length - 1; i >= 1; i--){
            trocou = false;
            for(int j = 0; j < i; j++){
                if(vetor[j].compareTo(vetor[j +1]) > 0){
                    trocar(j, j+1);
                    trocou = true;
                }
            }
            if(trocou == false){
                return;
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
