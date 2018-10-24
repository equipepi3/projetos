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
@Table(name="componente")
public class Componente{
    @Id @GeneratedValue
    private int idEquipe;
    @Column
    private int aluno_id_aluno;
    private String mensagem;
    
    public int getIdEquipe() {
        return idEquipe;
    }
   
    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getAluno_id_aluno() {
        return aluno_id_aluno;
    }

    public void setAluno_id_aluno(int aluno_id_aluno) {
        this.aluno_id_aluno = aluno_id_aluno;
    }
    
    public void cadastro(){
        //Somente para entrar novos professores
        //provavelmente não necessário tipo de retorno
        //por ser parecido com o set
        
    }
}
