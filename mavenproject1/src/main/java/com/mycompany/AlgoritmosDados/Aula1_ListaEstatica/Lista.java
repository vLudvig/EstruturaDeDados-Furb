/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula1_ListaEstatica;

/**
 *
 * @author ludvig
 */
public class Lista {
    private int[] info;
    private int tamanho;
    
    public Lista(){
        info = new int[10];
        tamanho = 0;
    }
    
    /**
     * este método deverá aumentar a capacidade de armazenamento da lista, criando um novo
       vetor com capacidade de armazenamento expandida em 10 novas posições e copiar os dados do vetor original
       para o novo vetor criado. Por fim, o método redimensionar() deverá assumir que o novo vetor info é o vetor
       recentemente criado;
     */
    private void redimensionar(){
        int[] novo = new int[info.length + 10];
        for(int i = 0; i < tamanho; i++){
            novo[i] = info[i];
        }
        info = novo;
    }
    
    private void inserir(int novoNumero){
        info[tamanho] = novoNumero;
        tamanho++;
    }
    
    public void exibir(){
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posicao[" + i + "] valor = " + info[i]);
        }
    }
    
    public int buscar(int valor){
        for(int i = 0; i < tamanho; i++){
            
        }
        return -1;
    }
}
