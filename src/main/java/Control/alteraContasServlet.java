/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.ContaOrcamento;
import Entidades.Orcamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas Carvalho
 */


@WebServlet(name = "alteraContasServlet", urlPatterns = {"/alteraContasServlet"})
public class alteraContasServlet extends HttpServlet {
     boolean sucesso = false;
     String msg = "";

    /**Método que recebe o código da conta a ser alterado e retorna as alterações para a tabela.
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
           req.setAttribute("msgAltera", "");
           ArrayList<ContaOrcamento> contas = (ArrayList<ContaOrcamento>) req.getServletContext().getAttribute("ContaImp");
           sucesso = false;
            
           
           float newreal = Integer.parseInt((String) req.getParameter("valoralt"));
           String codID = (String) req.getParameter("codconta");
           
           sucesso = alteraValor(contas,newreal,codID,sucesso);
           System.out.println(sucesso);
           
           if(sucesso){
           //req.getServletContext().setAttribute("ContaImp",contas);
           req.setAttribute("msgAltera", msg);
           req.getRequestDispatcher("tabelaBusc.jsp").forward(req, resp);
           }else{
           //req.getServletContext().setAttribute("ContaImp",contas);
           msg = "Código de Conta informado é inválido";
           req.setAttribute("msgAltera",msg );
           req.getRequestDispatcher("tabelaBusc.jsp").forward(req, resp); 
           }
      
       }
    
    /**Método que Altera o valor da conta buscada pelo código
     * 
     * @param contas Lista de Contaorcamento
     * @param valorR Valor a ser substituido na conta
     * @param cod Código a ser buscado
     * @param sucesso varivável de controle do processo
     * @return 
     */
    public boolean alteraValor(ArrayList<ContaOrcamento> contas, float valorR, String cod,boolean sucesso){
        sucesso = false;
        for(ContaOrcamento con: contas){
            
            if(con.getNumero().equals(cod)){
                sucesso = true;
                if(con.getSubConta().isEmpty()){
                System.out.println("entrou if");
                con.setValorRealizado(valorR);
                msg = "O Valor da conta foi alterado com sucesso.";
                }else{
                    msg = "Conta informada tem Subcontas. Apenas os valores de suas subcontas pode ser alterado.";
                }        
                return sucesso;
            }else if(!con.getSubConta().isEmpty())
                sucesso = alteraValor(con.getSubConta(),valorR,cod,sucesso);
            }
        return sucesso;
        }
    }
 


