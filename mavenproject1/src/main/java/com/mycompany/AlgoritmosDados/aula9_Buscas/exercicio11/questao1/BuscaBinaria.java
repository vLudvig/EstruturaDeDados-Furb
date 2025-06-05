/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao1;

/**
 *
 * @author vLudvig
 */
public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor){
        T[] info = (T[]) this.getInfo();
        int n = info.length;
        int inicio = 0;
        int fim = n - 1;
        
        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(valor.compareTo(info[meio]) < 0){ //Valor procurado é menor que o valor contido no meio?
                fim = meio - 1;
            }else if(valor.compareTo(info[meio]) > 0){//Valor procurado é maior que o valor contido no meio?
                inicio = meio + 1;
            }else{
                return meio;
            }
        }
        
        return -1;
    }
}
