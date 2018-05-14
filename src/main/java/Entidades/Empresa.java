/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Lucas Carvalho
 */
public class Empresa {
    private String empresa;
    private ArrayList<Orcamento> Orcamentos = new ArrayList<Orcamento>();
    private ArrayList<Despesa> despesa;
    public static ArrayList<Empresa>todas = new ArrayList<Empresa>();
    
    public Empresa(String empresa){
        this.empresa = empresa;   
    }
    
    public void addEmpresa(Empresa e){
        if(e!= null){
        todas.add(e);
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return Orcamentos;
    }

    public void setOrcamentos(ArrayList<Orcamento> Orcamentos) {
        this.Orcamentos = Orcamentos;
    }
    

    public ArrayList<Empresa> getTodas() {
        return todas;
    }

    public void setTodas(ArrayList<Empresa> todas) {
        this.todas = todas;
    }
    
    
    
    
	
    
    public Empresa(){
        
    }
    
   

}