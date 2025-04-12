/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio07.questao01;

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
public class ArvoreBinariaTest {
    
    public ArvoreBinariaTest() {
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
     * Test of setRaiz method, of class ArvoreBinaria.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        ArvoreBinaria instance = new ArvoreBinaria();
        instance.setRaiz(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVazia method, of class ArvoreBinaria.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(5);
        assertEquals(true, instance.estaVazia());
        instance.setRaiz(no1);
        System.out.println("Saida: " + instance.toString());
        assertEquals(false, instance.estaVazia());
        
    }

    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertence() {
        System.out.println("pertence");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no1, no2, no3, no4, no5, no6;
        no6 = new NoArvoreBinaria(6);
        no5 = new NoArvoreBinaria(5);
        no4 = new NoArvoreBinaria(4);
        no3 = new NoArvoreBinaria(3,no5,no6);
        no2 = new NoArvoreBinaria(2,null,no4);
        no1 = new NoArvoreBinaria(1,no2,no3);
        instance.setRaiz(no1);
        
        assertEquals(true, instance.pertence(1));
        assertEquals(true, instance.pertence(3));
        assertEquals(true, instance.pertence(6));
        assertEquals(false, instance.pertence(10));
    }

    /**
     * Test of toString method, of class ArvoreBinaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no1, no2, no3, no4, no5, no6;
        no6 = new NoArvoreBinaria(6);
        no5 = new NoArvoreBinaria(5);
        no4 = new NoArvoreBinaria(4);
        no3 = new NoArvoreBinaria(3,no5,no6);
        no2 = new NoArvoreBinaria(2,null,no4);
        no1 = new NoArvoreBinaria(1,no2,no3);
        
        instance.setRaiz(no1);
        System.out.println("saida: " + instance.toString());
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", instance.toString());
    }

    /**
     * Test of contarNos method, of class ArvoreBinaria.
     */
    @Test
    public void testContarNos() {
        System.out.println("contarNos");
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no1, no2, no3, no4, no5, no6;
        no6 = new NoArvoreBinaria(6);
        no5 = new NoArvoreBinaria(5);
        no4 = new NoArvoreBinaria(4);
        no3 = new NoArvoreBinaria(3,no5,no6);
        no2 = new NoArvoreBinaria(2,null,no4);
        no1 = new NoArvoreBinaria(1,no2,no3);
        
        instance.setRaiz(no1);
        assertEquals(6, instance.contarNos());
        
    }
    
}
