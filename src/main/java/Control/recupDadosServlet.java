/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Conta;
import Entidades.ContaOrcamento;
import Entidades.Empresa;
import Entidades.Orcamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static Entidades.Empresa.todas;

/**
 *
 * @author Lucas Carvalho
 */
@WebServlet(name = "recupDadosServlet", urlPatterns = {"/recupDadosServlet"})
public class recupDadosServlet extends HttpServlet {
    
   

    
  

    /**Método que recebe As Strings nome da empresa e ano do orcamento e busca o conjunto de Contas no orcamento encontrado para listar todos.
     * 
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
       
          
        Empresa e = new Empresa("teste");
        ArrayList<ContaOrcamento> ConjuContas = new ArrayList<ContaOrcamento>();
        Orcamento o = new Orcamento(2018,ConjuContas);
        
        
        ContaOrcamento x = new ContaOrcamento("1","casa",20,12,8,o);
        o.addContas(x);
        ContaOrcamento x1 = new ContaOrcamento("2","casa1",20,12,8,o);
        o.addContas(x1);
        ContaOrcamento x2 = new ContaOrcamento("3","casa2",20,12,8,o);
        o.addContas(x2);
        ContaOrcamento x3 = new ContaOrcamento("4","casa3",50,10,40,o);
        o.addContas(x3);
        ContaOrcamento x4 = new ContaOrcamento("5","casa4",20,12,8,o);
        o.addContas(x4);
        ContaOrcamento x5 = new ContaOrcamento("6","casa5",20,12,8,o);
        o.addContas(x5);
        ArrayList<ContaOrcamento> ConjuConta2 = new ArrayList<ContaOrcamento>();
        ContaOrcamento x7 = new ContaOrcamento("4.1","casa6",5,2,0,o);
        ContaOrcamento x8 = new ContaOrcamento("4.2","casa7",35,6,0,o);
        ContaOrcamento x9 = new ContaOrcamento("4.3","casa8",5,1,0,o);
        ContaOrcamento x10 = new ContaOrcamento("4.3.1","casa9",6,1,0,o);
        ContaOrcamento x11 = new ContaOrcamento("4.3.2","casa9",4,1,0,o);
        ArrayList<ContaOrcamento> ConjuConta3 = new ArrayList<ContaOrcamento>();
        ConjuConta3.add(x10);
        ConjuConta3.add(x11);
        x9.setSubConta(ConjuConta3);
        ConjuConta2.add(x7);
        ConjuConta2.add(x8);
        ConjuConta2.add(x9);
        x3.setSubConta(ConjuConta2);
        
        ArrayList<Orcamento> Orcamentoss = new ArrayList<Orcamento>();
        Orcamentoss.add(o);
        e.setOrcamentos(Orcamentoss);
        e.addEmpresa(e);
       
       
        
        
        
       req.setCharacterEncoding("UTF-8");
       resp.setCharacterEncoding("UTF-8");
       String empresaname = (String) req.getParameter("empresa");
       String anoOrcamento = (String) req.getParameter("anoOrcamento");
        
       
       
       
       if(e.getEmpresa().equals(empresaname)){
           if(o.getAno() == (Integer.parseInt(anoOrcamento))){
                System.out.println(e.getEmpresa());
                System.out.println(o.getAno());
                ArrayList<ContaOrcamento> ContaImp;
                ContaImp = o.getContaOrcamento();
                req.getServletContext().setAttribute("ContaImp",ContaImp);
                req.getServletContext().setAttribute("Orca",o);
       
       if(ContaImp.isEmpty()){
           req.setAttribute("msgSemResu", "o Orçamento deste ano está vazio.");
       }else{
           req.setAttribute("ContaImp",ContaImp);
           req.getRequestDispatcher("tabelaBusc.jsp").forward(req, resp);

       }
               
           }else{
               req.setAttribute("msgErroAno", "Não foi encontrado nenhum Orcamento neste ano para esta empresa.");
               req.getRequestDispatcher("index.jsp").forward(req, resp);
           }
           
       }else{         
          req.setAttribute("msgErroEmp", "Não foi encontrado nenhuma empresa com esse nome.");
           req.getRequestDispatcher("index.jsp").forward(req, resp);
       }
    }
}    
       
       
       
       
       
          
       
       
           
       
       
       
     

       
        
    

    


