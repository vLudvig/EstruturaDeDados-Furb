/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula8_MapaDispersao.exercicio9;

import com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada.ListaEncadeada;
import com.mycompany.AlgoritmosDados.Aula3_ListaEncadeada.ListaEncadeada.NoLista;

/**
 *
 * @author vludvig
 */
public class MapaDispersao<T> {
    private ListaEncadeada<T>[] info;
    
    public MapaDispersao(int tamanho){
        this.info = (ListaEncadeada<T>[]) new ListaEncadeada[tamanho];
    }
    
    private int calcularHash(int chave){
        return chave % info.length;
    }
    
    public void inserir(int chave, T dado){
        int indice = this.calcularHash(chave);
        
        if(info[indice] == null){
            info[indice] = new ListaEncadeada<>();
        }
        
        NoMapa noMapa = new NoMapa();
        noMapa.setChave(chave);
        noMapa.setValor(dado);
        
        info[indice].inserir((T) noMapa);
    }
    
    public void remover(int chave){
        int indice = this.calcularHash(chave);
        
        info[indice] = null;
    }
    
    public T buscar(int chave){
        int indice = this.calcularHash(chave);
        
        if(this.info[indice] != null){
            NoMapa no = new NoMapa();
            no.setChave(chave);
            NoLista<T> noLista = info[indice].buscar((T) no);
            
            if(noLista != null){
                NoMapa encontrado = (NoMapa)noLista.getInfo();
                return (T)encontrado.getValor();
            }
        }
        return null;
    }
    
    public double calcularFatorCarga(){
        int numElementos = 0;
        
        for(int i = 0; i < info.length; i++){
            if(info[i] != null){
                numElementos += info[i].obterComprimento();
            }
        }
        
        return (double) numElementos / info.length;
    }
    
}
