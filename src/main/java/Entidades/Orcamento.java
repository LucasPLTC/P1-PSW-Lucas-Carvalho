/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;



/**
 *
 * @author Lucas Carvalho
 */
public class Orcamento extends PlanodeConta{
    private int ano;
    private ArrayList<ContaOrcamento> contaOrcamentoList;
    private Empresa empresaname;
    
    public Orcamento(){
        
    }
    public void addContas(ContaOrcamento e){
        if(e!= null){
        this.contaOrcamentoList.add(e);
        }
    }
    
    /**
     * 
     * @param ano Ano do orçamento
     * @param contaOrcamentoList Lista de ContaOrcamento do Orçamento
     */
    public Orcamento(int ano,ArrayList<ContaOrcamento> contaOrcamentoList ){
        this.ano = ano;
        this.contaOrcamentoList = contaOrcamentoList;
    }

    public Empresa getEmpresaname() {
        return empresaname;
    }

    public void setEmpresaname(Empresa empresaname) {
        this.empresaname = empresaname;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<ContaOrcamento> getContaOrcamento() {
        return contaOrcamentoList;
    }

    public void setContaOrcamento(ArrayList<ContaOrcamento> contaOrcamentoList) {
        this.contaOrcamentoList = contaOrcamentoList;
    }


    
    
}
