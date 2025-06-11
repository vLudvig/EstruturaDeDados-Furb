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
    public void ordenar() {
        quickSort(0, this.getInfo().length - 1);
    }

    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = this.particionar(inicio, fim);

            this.quickSort(inicio, indicePivo - 1);
            this.quickSort(indicePivo + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {
        int a = inicio;
        int b = fim + 1;
        T[] info = this.getInfo();
        T pivo = info[inicio];

        while (true) {
            do {
                a++;
            } while (a <= fim && info[a].compareTo(pivo) < 0);

            do { 
                b--;
            } while (b >= inicio && info[b].compareTo(pivo) > 0);

            if (a >= b) {
                break;
            }

            trocar(a, b);// Coloca o pivô em sua posição final
        }

        trocar(b, inicio);
        return b;
    }
    
    //Métodos alterados com ituito de escolher um melhor pivô
    public void ordenarPivoMeio() {
        quickSortPivoMeio(0, this.getInfo().length - 1);
    }

    private void quickSortPivoMeio(int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = this.particionarPivoMeio(inicio, fim);
            this.quickSortPivoMeio(inicio, indicePivo - 1);
            this.quickSortPivoMeio(indicePivo + 1, fim);
        }
}

    private int particionarPivoMeio(int inicio, int fim) {
        T[] info = this.getInfo();

        // Escolha do pivô como elemento do meio
        int meio = (inicio + fim) / 2;
        trocar(inicio, meio); // Move o pivô para o início (mantém lógica original)

        T pivo = info[inicio];
        int a = inicio;
        int b = fim + 1;

        while (true) {
            do {
                a++;
            } while (a <= fim && info[a].compareTo(pivo) < 0);

            do {
                b--;
            } while (b >= inicio && info[b].compareTo(pivo) > 0);

            if (a >= b) {
                break;
            }

            trocar(a, b);
        }

        trocar(b, inicio); // Coloca o pivô em sua posição final
        return b;
    }
}

