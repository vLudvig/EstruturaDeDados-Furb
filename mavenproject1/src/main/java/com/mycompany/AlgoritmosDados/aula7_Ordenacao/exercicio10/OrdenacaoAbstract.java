/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author User
 */
public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    private T info[];
    
    public T[] getInfo(){
        return this.info;
    }
    
    public void setInfo(T[] info){
        this.info = info;
    }
    
    /**
     * Troca posicao a pela b(b pela a)
     * @param a valor da posicao a vai para posicao de b
     * @param b valor da posicao b vai para posicao de a
     */
    public void trocar(int a, int b){
        T temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }
    
    /**
     * Ordena o atributo vetor info
     */
    public abstract void ordenar();
}
