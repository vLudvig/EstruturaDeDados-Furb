/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula8_MapaDispersao;

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
        MapaDispersao instance = new MapaDispersao(53);
        LocalDate dtNasc = LocalDate.of(1200, 1, 1);
        Aluno obj1 = new Aluno(12000, "Jean", dtNasc);
        
        instance.inserir(obj1.getMatricula(), obj1);
        assertEquals(instance.buscar(obj1.getMatricula()), obj1);
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
