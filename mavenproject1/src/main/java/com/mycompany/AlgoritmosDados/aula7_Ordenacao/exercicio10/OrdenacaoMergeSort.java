/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author User
 */
public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T>  {
    @Override
    public void ordenar(){
        mergeSort(0, getInfo().length - 1);
    }
    
    private void mergeSort(int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }
    
    private void merge(int inicio, int meio, int fim) {
        T[] info = getInfo();

        int tamEsquerda = meio - inicio + 1;
        int tamDireita = fim - meio;

        T[] esquerda = (T[]) new Comparable[tamEsquerda];
        T[] direita = (T[]) new Comparable[tamDireita];

        for (int i = 0; i < tamEsquerda; i++) {
            esquerda[i] = info[inicio + i];
        }

        for (int j = 0; j < tamDireita; j++) {
            direita[j] = info[meio + 1 + j];
        }

        int cEsq = 0, cDir = 0;
        int k = inicio;

        while (cEsq < tamEsquerda && cDir < tamDireita) {
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                info[k] = esquerda[cEsq];
                cEsq++;
            } else {
                info[k] = direita[cDir];
                cDir++;
            }
            k++;
        }

        while (cEsq < tamEsquerda) {
            info[k] = esquerda[cEsq];
            cEsq++;
            k++;
        }

        while (cDir < tamDireita) {
            info[k] = direita[cDir];
            cDir++;
            k++;
        }
    }
}
