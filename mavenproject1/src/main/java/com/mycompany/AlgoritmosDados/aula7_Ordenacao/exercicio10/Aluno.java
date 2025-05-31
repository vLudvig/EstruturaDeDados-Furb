/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

/**
 *
 * @author vludvig
 */
public class Aluno implements Comparable<Aluno>{
    private int matricula;
    private String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int compareTo(Aluno o){
        int comparacao = this.getNome().compareTo(o.getNome());
        
        if (comparacao != 0){
            return comparacao;
        }
        
        if(o.matricula > this.matricula){
            return -1;
        }
        else if(o.matricula < this.matricula){
            return +1;
        }
        else{
            return 0;
        }
    }
}
