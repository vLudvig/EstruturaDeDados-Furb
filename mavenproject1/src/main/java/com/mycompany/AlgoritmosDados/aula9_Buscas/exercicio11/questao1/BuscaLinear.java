/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao1;

/**
 *
 * @author vLudvig
 */
public class BuscaLinear<T> extends BuscaAbstract{
    public int buscar(T valor){
        T vetor[] = (T[])this.getInfo();
                
        for(int i = 0; i < vetor.length; i++){
            if(valor.equals(vetor[i])){
                return i;
            }
        }
        
        return -1;
    }
}
