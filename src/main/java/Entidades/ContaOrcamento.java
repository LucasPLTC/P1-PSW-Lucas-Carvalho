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
public class ContaOrcamento extends Conta {
    private float valorOrcado;
    private float valorRealizado;
    private float valorComprometido;
    private Orcamento Orcamento;
    private ArrayList<ContaOrcamento> subConta  = new ArrayList<ContaOrcamento>();

    public Orcamento getOrcamento() {
        return Orcamento;
    }

    public void setOrcamento(Orcamento Orcamento) {
        this.Orcamento = Orcamento;
    }

    public ArrayList<ContaOrcamento> getSubConta() {
        return subConta;
    }

    public void setSubConta(ArrayList<ContaOrcamento> subConta) {
        this.subConta = subConta;
    }
    
    /**
     * 
     * @param numero numero da ContaOrcamento
     * @param nome nome da ContaOrcamento
     * @param valorOrcado valor orçado da ContaOrcamento
     * @param valorRealizado valor realizado da ContaOrcamento
     * @param valorComprometido valor comprometido da ContaOrcamento
     * @param Orcamento orçamento a qual a conta pertence
     */
    public ContaOrcamento(String numero,String nome,float valorOrcado, float valorRealizado, float valorComprometido, Orcamento Orcamento ){
        super(nome, numero);
        this.valorOrcado = valorOrcado;
        this.valorRealizado = valorRealizado;
        this.valorComprometido = valorComprometido;
        this.Orcamento = Orcamento;
    }
    
    

    public float getValorOrcado() {
        if(!this.subConta.isEmpty()){
            float v=0;
            valorOrcado = 0;
            for (ContaOrcamento a : this.subConta) {
                
                v+=a.getValorOrcado();
            }
            if(v>valorOrcado)
            this.valorOrcado=v;
        }
        return valorOrcado;
    }
    
    
    

    public void setValorOrcado(float valorOrcado) {
        this.valorOrcado = valorOrcado;
    }
    
    
    

    public float getValorRealizado() {
        if(!this.subConta.isEmpty()){
            float v=0;
            valorRealizado=0;
            for (ContaOrcamento a : this.subConta) {
                v+=a.getValorRealizado();
            }
            if(v>valorRealizado)
            this.valorRealizado=v;
        }
        return valorRealizado;
    }

    public void setValorRealizado(float valorRealizado) {
        this.valorRealizado = valorRealizado;
    }

    public float getValorComprometido() {
        if(!this.subConta.isEmpty()){
            float v=0;
            valorComprometido=0;
            for (ContaOrcamento a : this.subConta) {
                v+=a.getValorComprometido();
            }
            if(v>valorComprometido)
            this.valorComprometido=v;
        }
        return valorComprometido;
    }

    public void setValorComprometido(float valorComprometido) {
        this.valorComprometido = valorComprometido;
    }

    public float getValorDisponivel() {
        return valorOrcado-valorComprometido-valorRealizado;
    }
    
   
}
