/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao1;

/**
 *
 * @author vLudvig
 */
public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor){
        T[] info = (T[])this.getInfo();
        
        for(int i = 0; i < info.length; i++){
            if(info[i].compareTo(valor) > 0){
                return -1;//iterrompe busca caso valor do vetor for maior que o procurado
            }
            
            if(valor.equals(info[i])){
                return i;
            }
        }
        
        return -1;
    }
}
