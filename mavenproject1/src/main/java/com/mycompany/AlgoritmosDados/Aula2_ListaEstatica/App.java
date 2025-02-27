/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula2_ListaEstatica;

/**
 *
 * @author vludvig
 */
public class App {
    public static void main(String[] args) {
        ListaObj<Aluno> alunos = new ListaObj();
        
        alunos.inserir(new Aluno("Vitor", 10));
        //alunos.inserir("Pedro"); passou a recusar quando a classe inclui um parametro
        
        System.out.println("Alunos");
        for( int i = 0; i < alunos.getTamanho(); i++){
            System.out.println(((Aluno)alunos.obterElemento(i)).getNome());
        }
    }
}
