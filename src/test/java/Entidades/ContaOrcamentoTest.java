/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Carvalho
 */
public class ContaOrcamentoTest {
    
    public ContaOrcamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorOrcado() {
        
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instance = new ContaOrcamento("test","case",10,0,0,o);
        o.addContas(instance);
        System.out.println("getValorOrcado");
        float expResult = 10F;
        float result = instance.getValorOrcado();
        assertEquals(expResult, result, 0.0);
        
        
    }
    
     /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorOrcadoSubConta() {
        System.out.println("getValorOrcadoSub");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instancePai = new ContaOrcamento("testp","casep",0,0,0,o);
        ConjuContas.add(instancePai);
        ContaOrcamento instance = new ContaOrcamento("test","case",10,0,0,o);
        ArrayList<ContaOrcamento> ConjuContas2 = new ArrayList<ContaOrcamento>();
        ConjuContas2.add(instance);
        instancePai.setSubConta(ConjuContas2);
        float expResult = 10F;
        float result = instancePai.getValorOrcado();
        assertEquals(expResult, result, 0.0);
        
        
    }

    

    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorRealizado() {
        System.out.println("getValorRealizado");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instance = new ContaOrcamento("test","case",0,10,0,o);
        o.addContas(instance);
        float expResult = 10F;
        float result = instance.getValorRealizado();
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorRealizadoSubConta() {
        System.out.println("getValorRealizadoSub");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instancePai = new ContaOrcamento("testp","casep",0,0,0,o);
        ConjuContas.add(instancePai);
        ContaOrcamento instance = new ContaOrcamento("test","case",0,10,0,o);
        ArrayList<ContaOrcamento> ConjuContas2 = new ArrayList<ContaOrcamento>();
        ConjuContas2.add(instance);
        instancePai.setSubConta(ConjuContas2);
        float expResult = 10F;
        float result = instancePai.getValorRealizado();
        assertEquals(expResult, result, 0.0);
        
    }

    

    /**
     * Test of getValorComprometido method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorComprometido() {
        System.out.println("getValorComprometido");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instance = new ContaOrcamento("test","case",0,0,10,o);
        o.addContas(instance);
        float expResult = 10F;
        float result = instance.getValorComprometido();
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of getValorComprometido method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorComprometidoSubConta() {
        System.out.println("getValorComprometidoSub");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instancePai = new ContaOrcamento("testp","casep",0,0,0,o);
        ConjuContas.add(instancePai);
        ContaOrcamento instance = new ContaOrcamento("test","case",0,0,10,o);
        ArrayList<ContaOrcamento> ConjuContas2 = new ArrayList<ContaOrcamento>();
        ConjuContas2.add(instance);
        instancePai.setSubConta(ConjuContas2);
        float expResult = 10F;
        float result = instancePai.getValorComprometido();
        assertEquals(expResult, result, 0.0);
        
    }

    

    /**
     * Test of getValorDisponivel method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorDisponivel() {
        System.out.println("getValorDisponivel");  
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        ContaOrcamento instance = new ContaOrcamento("test","case",20,10,5,o);
        o.addContas(instance);
        float expResult = 5F;
        float result = instance.getValorDisponivel();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
