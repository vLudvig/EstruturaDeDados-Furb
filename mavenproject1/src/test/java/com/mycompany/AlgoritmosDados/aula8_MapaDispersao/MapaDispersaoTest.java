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
        LocalDate dtNasc = LocalDate.parse("1200-01-01");
        Aluno obj1 = new Aluno(12000, "Jean", dtNasc);
        
        instance.inserir(obj1.getMatricula(), obj1);
        assertEquals(instance.buscar(obj1.getMatricula()), obj1);
    }
    
    @Test
    public void testInserir1() {
        MapaDispersao<Aluno> mapa = this.criarMapaPadrao();
        LocalDate idade = LocalDate.parse("2000-01-01");

        Aluno obj1 = new Aluno(
            12000,
            "Jean",
            idade
        );

        mapa.inserir(12000, obj1);
        assertEquals(mapa.buscar(12000), obj1);
    }
    
    private MapaDispersao<Aluno> criarMapaPadrao()
    {
        return new MapaDispersao<>(53);
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

    /**
     * Test of remover method, of class MapaDispersao.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        int chave = 0;
        MapaDispersao instance = null;
        instance.remover(chave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class MapaDispersao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int chave = 0;
        MapaDispersao instance = null;
        Object expResult = null;
        Object result = instance.buscar(chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    
}
