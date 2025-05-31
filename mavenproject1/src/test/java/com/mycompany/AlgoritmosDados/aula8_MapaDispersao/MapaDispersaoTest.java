/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula8_MapaDispersao;

import com.mycompany.AlgoritmosDados.aula8_MapaDispersao.exercicio9.MapaDispersao;
import com.mycompany.AlgoritmosDados.aula8_MapaDispersao.exercicio9.Aluno;
import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class MapaDispersaoTest {
    
    public MapaDispersaoTest() {
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
     * Test of inserir method, of class MapaDispersao.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        MapaDispersao<Aluno> instance = new MapaDispersao<>(53);
        Aluno obj1 = criarAlunos()[0];
        instance.inserir(obj1.getMatricula(), obj1);
        Aluno abj2 = instance.buscar(obj1.getMatricula());
        
        assertEquals(abj2, obj1);
    }
    
    @Test
    public void testInserirVarios() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        Aluno obj1 = criarAlunos()[0];
        Aluno obj2 = criarAlunos()[1];
        Aluno obj3 = criarAlunos()[2];
        Aluno obj4 = criarAlunos()[3];

        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);
        assertEquals(mapa.buscar(obj4.getMatricula()), obj4);
    }
    
    /**
     * TESTE COM COLISÃO DE DADOS
     */
    @Test
    public void testBuscar() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        Aluno obj1 = criarAlunos()[0];
        Aluno obj2 = criarAlunos()[1];
        Aluno obj3 = criarAlunos()[2];
        Aluno obj4 = criarAlunos()[3];
        
        obj3.setMatricula(14226);
        obj4.setMatricula(17180);
        
        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);
                
        assertEquals(mapa.buscar(obj4.getMatricula()), obj4);
        assertEquals(mapa.buscar(obj3.getMatricula()), obj3);
        assertEquals(mapa.buscar(obj2.getMatricula()), obj2);
        assertEquals(mapa.buscar(obj1.getMatricula()), obj1);
    }

    /**
     * Test of calcularFatorCarga method, of class MapaDispersao.
     */
    @Test
    public void testCalcularFatorCarga() {
        System.out.println("calcularFatorCarga");
        MapaDispersao instance = null;
        double expResult = 0.0;
        double result = instance.calcularFatorCarga();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
