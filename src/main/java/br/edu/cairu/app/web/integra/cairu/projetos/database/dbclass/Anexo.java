/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.io.IOException;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.Part;

/**
 *
 * @author everton
 */
@ManagedBean
@ViewScoped

@Entity
@Table(name="anexo")
public class Anexo {
    @Id @GeneratedValue
    private int idArquivo;
    @Column
    private Part end_arq;
    //Otipo Part aceita arquivos.
    public String mensagem;
    
    public int getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Part getEnd_arq() {
        return end_arq;
    }

    public void setEnd_arq(Part end_arq) {
        this.end_arq = end_arq;
    }


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public void  anexar(){
        /**
         * Não sabemos como vamos anexar o arquivo
         * -Pesquisar
         * -Testar
         * -Alterar
         **/
        //Somente para conseguir alterar os dados de mensagem e mostrar
        mensagem = "Id do arquivo: " + idArquivo;
        //O código bean dessa classe utilizará esse código:
        /**
         * Para entender melhor essa parte do código:
         * http://blog.triadworks.com.br/upload-de-arquivos-com-jsf-2-2
        */
        try{
            String arquivoEnd = new Scanner(end_arq.getInputStream()).useDelimiter("\\A").next();
        }catch(IOException e){
        }
     
        
    }
}
