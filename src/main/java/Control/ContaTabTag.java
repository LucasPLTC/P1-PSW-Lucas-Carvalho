/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Entidades.ContaOrcamento;
import java.io.IOException;



import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Lucas Carvalho
 */
public class ContaTabTag extends SimpleTagSupport {

    private ContaOrcamento contaPR;

    public ContaOrcamento getContaPR() {
        return contaPR;
    }

    public void setContaPR(ContaOrcamento contaPR) {
        this.contaPR = contaPR;
    }
    

  

    
    /**Método doTag do Selects usado no JSP
     * 
     * @throws JspException
     * @throws IOException 
     */
    @Override
    public void doTag() throws JspException, IOException {
       Imprime(contaPR);
 
        
    }
    /**Método que testa quantos "." contém uma string
     * 
     * @param T String que terão seus espaços contados por "."
     * @return 
     */
    public int contaEspaco(String T){
        
        int total=0;
        for(int i = 0; i<T.length(); i++){
            char c = T.charAt(i);
            String t1 = String.valueOf(c);
            if(t1.equals(".")){
                total=total+1;
            }
        }
        return total;
    }
    
    /**Método que imprime dados de ContaOrcamento em uma tabela com recursividade para subcontas
     * 
     * @param ContaPR Objeto ContaOrcamento que terão seus valores impressos bem como de suas subcontas.
     * @throws IOException 
     */
   public void Imprime(ContaOrcamento ContaPR) throws IOException{
       int Esp = contaEspaco(ContaPR.getNumero());
       String esp = "&nbsp;&nbsp;";
       for(int i=0;i<Esp;i++){esp = esp+esp;}
       String selectHtml
                = "<tr>"
                + "    <td>"+esp+ContaPR.getNumero()+". "+ContaPR.getNome()+"</td>"
                + "    <td>"+ContaPR.getValorOrcado()+"</td>"
                + "    <td>"+ContaPR.getValorRealizado()+"</td>"
                + "    <td>"+ContaPR.getValorComprometido()+"</td>"
                + "    <td>"+ContaPR.getValorDisponivel()+"</td>"
                + "</tr>";
       getJspContext().getOut().print(selectHtml);
       
       if(!(ContaPR.getSubConta()).isEmpty()){
          for(ContaOrcamento ContaFor :ContaPR.getSubConta()){
            Imprime(ContaFor);
                      
          }
        }
   }

}
