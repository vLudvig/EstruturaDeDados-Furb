/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.aula6_Arvores.exercicio08.questao01;

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
public class ArvoreTest {
    
    public ArvoreTest() {
    }
    
    private Arvore createArvoreDefault(){
        var arvore = new Arvore<Integer>();
        var no4 = new NoArvore<Integer>(10);
        var no3 = new NoArvore<Integer>(20);
        var no2 = new NoArvore<Integer>(40);
        var no1 = new NoArvore<Integer>(90);
       
       no4.inserirFilho(no3);
       no4.inserirFilho(no2);
       no2.inserirFilho(no1);
       
       arvore.setRaiz(no4);
       
       return arvore;
    }

    /**
     * Test of setRaiz method, of class Arvore.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        NoArvore raiz = null;
        Arvore instance = new Arvore();
        instance.setRaiz(raiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class Arvore.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        Arvore instance = new Arvore();
        NoArvore expResult = null;
        NoArvore result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arvore.
     */
    @Test
    public void testPrincipal() {
        System.out.println("toString");
        Arvore instance = this.createArvoreDefault();
        String expResult = "<10<40<90>><20>>";
        String result = instance.toString();
        System.out.println("Resultado textual: " + result);
        assertEquals(expResult, result);
        assertEquals(true, instance.pertence(20));
        assertEquals(false, instance.pertence(1000));
        assertEquals(4, instance.contarNos());
    }
    
    /**
     * Test of obterRepresentacaoTextual method, of class Arvore.
     */
    @Test
    public void testObterRepresentacaoTextual() {
        System.out.println("obterRepresentacaoTextual");
        Arvore instance = new Arvore();
        String expResult = "";
        String result = instance.obterRepresentacaoTextual(null);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence_GenericType() {
        System.out.println("pertence");
        Object info = null;
        Arvore instance = new Arvore();
        boolean expResult = false;
        boolean result = instance.pertence(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence_NoArvore_GenericType() {
        System.out.println("pertence");
        Arvore instance = new Arvore();
        boolean expResult = false;
        boolean result = instance.pertence(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contaNos method, of class Arvore.
     */
    @Test
    public void testContarNos() {
        System.out.println("contaNos");
        Arvore instance = new Arvore();
        int expResult = 0;
        int result = instance.contarNos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
