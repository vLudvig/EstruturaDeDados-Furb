/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.AlgoritmosDados.Aula2_ListaEstatica;

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
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
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
     * Testar método de inclusão de dados na lista
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        assertEquals("5,10,15,20", instance.toString());
    }

    /**
     * Testar método de obtenção de tamanho da lista
     */
    @Test
    public void testGetTamanho() {
        System.out.println("Obtenção de tamanho da lista");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        assertEquals(4, instance.getTamanho());
    }

    /**
     * Testar método buscar() com elemento existente
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        assertEquals(2, instance.buscar(15));
    }

    /**
     * Testar método buscar() com elemento inexistente
     */
    @Test
    public void testBuscarInexist() {
        System.out.println("buscar inexistente");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        assertEquals(-1, instance.buscar(30));
    }

    /**
     * Testar método retirar()
     */
    @Test
    public void testRetirar() {
        System.out.println("Retirar");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        instance.retirar(10);
        
        assertEquals("5,15,20", instance.toString());
        assertEquals(3, instance.getTamanho());
    }

    /**
     * Testar inclusão que provoque redimensionamento
     */
    @Test
    public void testRedimensionamento() {
        System.out.println("Redimensionamento");
        ListaEstatica instance = new ListaEstatica();
        for(int i = 0; i < 15; i++){
            instance.inserir(i + 1);
        }
        
        String expResultString = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
        int expResultTamanho = 15;
        
        assertEquals(expResultString, instance.toString());
        assertEquals(expResultTamanho, instance.getTamanho());
    }

    /**
     * Obter Elemento.
     */
    @Test
    public void testObterElemento() {
        System.out.println("ObterElemento");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        assertEquals(20, instance.obterElemento(3));
    }

    /**
     * Liberar
     */
    @Test
    public void testLiberar() {
        System.out.println("toString");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        instance.liberar();
        
        assertEquals(true, instance.estaVazia());
    }
    
    /**
     * Inverter
     */
    @Test
    public void testInverter1() {
        System.out.println("Inverter");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        
        instance.inverter();
        
        assertEquals("20,15,10,5", instance.toString());
    }
    
    /**
     * Inverter2
     */
    @Test
    public void testInverter2() {
        System.out.println("Inverter");
        int novoNumero = 5;
        ListaEstatica instance = new ListaEstatica();
        instance.inserir(novoNumero);
        novoNumero = 10;
        instance.inserir(novoNumero);
        novoNumero = 15;
        instance.inserir(novoNumero);
        novoNumero = 20;
        instance.inserir(novoNumero);
        novoNumero = 25;
        instance.inserir(novoNumero);
        
        instance.inverter();
        
        assertEquals("25,20,15,10,5", instance.toString());
    }
}
