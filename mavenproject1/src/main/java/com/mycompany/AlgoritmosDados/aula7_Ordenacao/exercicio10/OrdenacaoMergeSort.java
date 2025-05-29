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
     public void ordenar() {
        int tamanhoVetor = this.getInfo().length - 1;

        this.mergeSort(0, tamanhoVetor);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            this.mergeSort(inicio, meio);
            this.mergeSort(meio + 1, fim);
            this.merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        T[] info = this.getInfo();

        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;

        T[] esquerda = (T[]) new Comparable[tamanhoEsquerda];
        T[] direita = (T[]) new Comparable[tamanhoDireita];

        for (int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = info[inicio + i];
        }

        for (int i = 0; i < tamanhoDireita; i++) {
            direita[i] = info[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;
        int k = inicio;

        while (cEsq < tamanhoEsquerda && cDir < tamanhoDireita) {
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                info[k] = esquerda[cEsq];
                cEsq++;
            } else {
                info[k] = direita[cDir];
                cDir++;
            }

            k++;
        }

        while (cEsq < tamanhoEsquerda) {
            info[k] = esquerda[cEsq];
            cEsq++;
            k++;
        }

        while (cDir < tamanhoDireita) {
            info[k] = direita[cDir];
            cDir++;
            k++;
        }
    }
    
    //Nao funcionou como esperado/nao testado
    public void ordenarAntigo(){
        mergeSort(0, getInfo().length - 1);
    }
    
    private void mergeSortAntigo(int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }
    
    private void mergeAntigo(int inicio, int meio, int fim) {
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
