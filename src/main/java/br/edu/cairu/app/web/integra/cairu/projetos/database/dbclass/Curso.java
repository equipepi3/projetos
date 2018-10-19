/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author everton
 */
@ManagedBean
@ViewScoped

@Table(name="curso")
public class Curso {
    @Id
    private int idCurso;
    @Column
    private String nome;
    @Column
    private String mensagem;
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastro(){
        //Somente para entrar novos professores
        //provavelmente não necessário tipo de retorno
        //por ser parecido com o set
         //Fazer um teste try catch
        //Sendo que aqui entraria as noções de busca em banco
        mensagem = "Id do curso: " + getIdCurso()
                + "Nome do curso: " + getNome();
    }
}
