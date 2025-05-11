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
    
    public void trocar(int a, int b){
        T temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }
    
    public abstract void ordenar();
}
