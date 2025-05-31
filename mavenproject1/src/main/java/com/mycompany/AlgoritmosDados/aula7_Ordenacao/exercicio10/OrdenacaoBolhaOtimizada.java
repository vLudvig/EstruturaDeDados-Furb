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
    public void ordenar() {
        T[] info = this.getInfo();
        int tamanhoLista = info.length;

        for (int i = tamanhoLista - 1; i >= 1; i--) {
            boolean trocou = false;

            for (int j = 0; j <= i - 1; j++) {
                if (info[j].compareTo(info[j + 1]) > 0) {
                    trocar(j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }

            // if (trocou) {
            //     break;
            // }
        }
    }
    
    public void ordenarAntigo(){
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
