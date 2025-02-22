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
    
    /**
     * Insere o numero do parametro no final do vetor,
     * caso o vetor esteja totalmente preenchido, chama a func. redimensionar() 
     * @param novoNumero 
     */
    public void inserir(int novoNumero){
        info[tamanho] = novoNumero;
        tamanho++;
        if(tamanho == 10){
            redimensionar();
        }
    }
    
   /**
    * Exibe todas as posições e valores respectivos do Vetor 
    */
    public void exibir(){
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posicao[" + i + "] valor = " + info[i]);
        }
    }
    
    /**
     * Busca o valor fornecido no parametro, caso o valor passado estiver
     * no vetor, a func. retorna a posição que esta o valor, se não retorna -1 
     * @param valor
     * @return 
     */
    public int buscar(int valor){
        for(int i = 0; i < tamanho; i++){
            if(info[i] == valor){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca o valor passado no parametro e exclui o mesmo do vetor, apos a
     * exclusão, traz todos os outros valores para frente, de modo
     * que o próximo valor inserido esteja no final e não fique buracos no Vetor
     * @param valor 
     */
    public void retirar(int valor){
        boolean controler = false;
        for(int i = 0; i < tamanho; i++){
            if(info[i] == valor || controler == true){
               info[i] = info[i + 1];
               controler = true;
            }
        }
        
        if(controler == true){
            tamanho--;
        }
    }
    
    /**
     * Limpa todos os valores do array e volta ao seu tamanho com 10 posições 
     */
    public void liberar(){
        int[] novo = new int[10];
        info = novo;
        tamanho = 0;
    }
    
    /**
     * Recebe como parametro uma posicao e assim retorna o valor respectivo desta
     * @param posicao
     * @return 
     */
    public int obterElemento(int posicao){
        return info[posicao];
    }
    
    /**
     * Restorna um valor lógico se esta ou não vazio o vetor
     * @return 
     */
    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método getter do atributo tamanho
     * @return 
     */
    public int getTamanho(){
        return tamanho;
    }

    @Override
    public String toString() {
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            if(i + 1 >= tamanho){
                texto += info[i];
            }else{
               texto += info[i] + ","; 
            }
        }
        return texto;
    }
}
