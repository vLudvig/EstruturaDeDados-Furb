/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author User
 */
public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    @Override
    public void ordenar(){
        quickSort(0, getInfo().length);
    }
    
    private void quickSort(int inicio, int fim){
        if(inicio < fim){
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }
    
    private int particionar(int inicio, int fim){
        T[] info = getInfo();
        T pivo = info[inicio];
        int a = inicio;
        int b = fim + 1;
        
        while(true){
            do {
                a++;
            }while(a <= fim && info[a].compareTo(pivo) > 0);//ino[a] < pivo
            do {
                b--;
            }while(b >= inicio && info[b].compareTo(pivo) > 0 );
                
            if(a >= b){
                break;
            }
                
            trocar(a, b);
        }
        
        trocar(b, inicio);  
        return b;
    }
}

