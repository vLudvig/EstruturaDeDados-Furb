/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula5_Filas.exercicio06.questao2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class FilaListaTest {
    
    public FilaListaTest() {
    }

    /**
     * Test of inserir and retirar methods, of class FilaLista.
     */
    @Test
    public void testInserirEretirar() {
        System.out.println("inserir");
        FilaLista<Integer> instance = new FilaLista();
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        
        System.out.println("Saida: " + instance.toString());
        assertEquals(10, instance.retirar());
        assertEquals(20, instance.retirar());
        assertEquals(30, instance.retirar());
        assertEquals(true, instance.estaVazia());
    }

    /**
     * Test of estaVazia method, of class FilaLista.
     */
    @Test
    public void testEstaVazia() {
        System.out.println("estaVazia");
        FilaLista<Integer> instance = new FilaLista();
        boolean expResult = true;
        assertEquals(expResult, instance.estaVazia());
        
        expResult = false;
        instance.inserir(2);
        assertEquals(expResult, instance.estaVazia());
    }

    /**
     * Test of peek method, of class FilaLista.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        FilaLista<Integer> instance = new FilaLista();
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        
        System.out.println("Saida: " + instance.toString());
        assertEquals(10, instance.peek());
        assertEquals(10, instance.retirar());
    }

    /**
     * Test of liberar method, of class FilaLista.
     */
    @Test
    public void testLiberar() {
        System.out.println("liberar");
        FilaLista<Integer> instance = new FilaLista();
        instance.inserir(10);
        instance.inserir(20);
        instance.inserir(30);
        instance.liberar();
        
        System.out.println("Saida: " + instance.toString());
        assertEquals(true, instance.estaVazia());
    }
}
