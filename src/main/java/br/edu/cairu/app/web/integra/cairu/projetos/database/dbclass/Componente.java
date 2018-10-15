/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author everton
 */
@ManagedBean
@ViewScoped
public class Componente{
    private int idEquipe;
    private int aluno_id_aluno;

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
