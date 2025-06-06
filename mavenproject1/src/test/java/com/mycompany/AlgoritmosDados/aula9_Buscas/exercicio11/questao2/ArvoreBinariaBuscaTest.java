/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula9_Buscas.exercicio11.questao2;

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
public class ArvoreBinariaBuscaTest {
    
    public ArvoreBinariaBuscaTest() {
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
     * Test of inserir method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        ArvoreBinariaBusca<Integer> instance = new ArvoreBinariaBusca();
        instance.inserir(50);
        instance.inserir(30);
        instance.inserir(70);
        instance.inserir(40);
        instance.inserir(25);
        instance.inserir(75);
        instance.inserir(65);
        instance.inserir(35);
        instance.inserir(60);
        
        System.out.println("String: " + instance.toString());
        
        assertEquals(instance.toString(), "<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>");
    }

    /**
     * Test of buscar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Object info = null;
        ArvoreBinariaBusca instance = new ArvoreBinariaBusca();
        NoArvoreBinaria expResult = null;
        NoArvoreBinaria result = instance.buscar(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of retirar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testRetirarNoFolha() {
        System.out.println("buscar");
        ArvoreBinariaBusca<Integer> instance = new ArvoreBinariaBusca();
        instance.inserir(50);
        instance.inserir(30);
        instance.inserir(25);
        instance.inserir(40);
        
        instance.retirar(40);
        
        assertEquals(instance.toString(), "<50<30<25<><>><>><>>");
    }
    
    /**
     * Test of retirar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testRetirarNoUmFilho() {
        System.out.println("buscar");
        ArvoreBinariaBusca<Integer> instance = new ArvoreBinariaBusca();
        instance.inserir(80);
        instance.inserir(52);
        instance.inserir(90);
        instance.inserir(48);
        instance.inserir(71);
        instance.inserir(63);
        instance.inserir(67);
        
        instance.retirar(71);
        
        assertEquals(instance.toString(), "<80<52<48<><>><63<><67<><>>>><90<><>>>");
    }
}
