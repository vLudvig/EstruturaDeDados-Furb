/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula8_MapaDispersao.exercicio9;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Aluno implements Comparable<Aluno> {
    private int matricula;
    private String nome;
    private LocalDate dataNascimento;
    
    public Aluno(){
    
    }
    
    public Aluno(int matricula, String nome, LocalDate dataNasc){
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNasc;
    }

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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public int compareTo(Aluno n){
        if(n.getMatricula() > this.matricula){
            return -1;
        }else if(n.getMatricula() < this.matricula){
            return 1;
        }else{
            return 0;
        }
    }
        
}
