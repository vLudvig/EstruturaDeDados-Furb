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
            if(valor.compareTo(info[meio]) < 0){
                fim = meio - 1;//Se valor do meio for maior ent o fim se torna o meio
            }else if(valor.compareTo(info[meio]) > 0){
                inicio = meio + 1;//Se valor do meio for menor q o valor procurado ent o inicio se torna o meio
            }else{
                return meio;
            }
        }
        
        return -1;
    }
}
