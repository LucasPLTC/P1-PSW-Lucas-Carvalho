/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.ArrayList;


/**
 *
 * @author Lucas Carvalho
 */
public class Conta {
    

    protected String numero;
    protected String nome;
   // private ArrayList<Despesa> Despesa;
    //private PlanodeConta PlanodeConta;
    
    
    /**
     * 
     * @param nome Nome da Conta
     * @param numero Código da COnta
     */
    public Conta(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

   

    

    
   
    
    
    
    
    
}
