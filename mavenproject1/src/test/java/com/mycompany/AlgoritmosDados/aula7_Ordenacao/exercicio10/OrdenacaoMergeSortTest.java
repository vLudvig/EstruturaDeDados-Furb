/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula7_Ordenacao.exercicio10;

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
public class OrdenacaoMergeSortTest {
    
    public OrdenacaoMergeSortTest() {
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
     * Test of ordenar method, of class OrdenacaoMergeSort.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        OrdenacaoMergeSort instance = new OrdenacaoMergeSort();
        Integer info2[] = new Integer[] {70,2,88,15,90,30};
        
        for(Integer i : info2){
            System.out.print("["+ i +"], ");
        }
        
        System.out.println("");//Quebra de linha
        instance.setInfo(info2);
        instance.ordenar();
        
        for(Integer i : info2){
            System.out.print("["+ i +"], ");
        }
    }

    /**
     * Test of ordenarAntigo method, of class OrdenacaoMergeSort.
     */
    @Test
    public void testOrdenarAntigo() {
        System.out.println("ordenarAntigo");
        OrdenacaoMergeSort instance = new OrdenacaoMergeSort();
        instance.ordenar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
