/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao1;

import com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10.OrdenacaoMergeSort;
import com.mycompany.AlgoritmosDados.aula8_MapaDispersao.exercicio9.Aluno;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vludvig
 */
public class BuscaBinariaTest {
    
    public BuscaBinariaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of buscar method, of class BuscaBinaria.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        BuscaBinaria<Integer> instance = new BuscaBinaria();
        Integer vetor[] = new Integer[] {1,2,3,4,5,6,7,8,9}; 
        
        instance.setInfo(vetor);
        
        int posicao = instance.buscar(7);
        
        assertEquals(6, posicao);
        
    }
    
    @Test
    public void testBuscarAluno() {
        System.out.println("buscar");
        BuscaBinaria<Aluno> instance = new BuscaBinaria();
        OrdenacaoMergeSort<Aluno> ordenar = new OrdenacaoMergeSort<>();
        Aluno obj1 = criarAlunos()[0];
        Aluno obj2 = criarAlunos()[3];
        Aluno obj4 = criarAlunos()[2];
        Aluno obj5 = criarAlunos()[1];
        
        Aluno vetor[] = new Aluno[] {obj1, obj2, obj4, obj5}; 
        ordenar.setInfo(vetor);
        ordenar.ordenar();
        instance.setInfo(vetor);
        
        int posicao = instance.buscar(obj4);
        
        assertEquals(1, posicao);
        
    }
    
    private Aluno[] criarAlunos() {
        Aluno[] alunos = new Aluno[4];
        
        int[] matriculas = new int[] {
          12000, 14000, 12500, 13000
        };

        LocalDate[] datas = new LocalDate[] {
            LocalDate.parse("2000-01-01"),
            LocalDate.parse("1999-01-20"),
            LocalDate.parse("2001-02-18"),
            LocalDate.parse("1998-11-25"),
        };

        String[] nomes = new String[] {
            "Jean", "Pedro", "Marta", "Lucas"
        };

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            alunos[i].setMatricula(matriculas[i]);
            alunos[i].setDataNascimento(datas[i]);
            alunos[i].setNome(nomes[i]);
        }

        return alunos;
    }
    
}
