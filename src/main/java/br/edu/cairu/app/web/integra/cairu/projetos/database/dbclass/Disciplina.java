/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author everton
 */
@ManagedBean
@ViewScoped

@Entity
@Table(name="disciplina")
public class Disciplina {
    @Id @GeneratedValue
    private int idDisciplina;
    @Column
    private String nome_disciplina;
    //Somente utilizado para saída de dados
    private String mensagem;
    
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
    
    //metodos customizados
    public void cadastro(){
        //Somente para entrar novos professores
        //provavelmente não necessário tipo de retorno
        //por ser parecido com o set
         mensagem = "Id do curso: " + getIdDisciplina()
                + "Nome do curso: " + getNome_disciplina();
    }
}
