/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Id;

/**
 *
 * @author everton
 */
@ManagedBean
@ViewScoped
public class Anexo {
    @Id
    private int idArquivo;
    private Long end_arq;
    private String mensagem;
    
    public int getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Long getEnd_arq() {
        return end_arq;
    }

    public void setEnd_arq(Long end_arq) {
        this.end_arq = end_arq;
    }
    
    public /*void na true*/ String anexar(){
        /**
         * Não sabemos como vamos anexar o arquivo
         * -Pesquisar
         * -Testar
         * -Alterar
         **/
        mensagem = "Id do arquivo: " + idArquivo;
        return mensagem;
    }
}
