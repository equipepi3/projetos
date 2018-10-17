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
public class Projeto {
    @Id
    private int idProj;
    private String nome;
    //Pesquisar tipo date
    private String ano;
    private String desc_proj;
    //Vai ser alterada por professor
    private int validacao_prof;
    //Perguntar por que não int
    private String validacao_coord;
    private int periodo;
    //No lugar das FK's
    Disciplina disciplina = new Disciplina();
    Componente componente = new Componente();
    Curso curso = new Curso();
    Professor professor = new Professor();

    public int getIdProj() {
        return idProj;
    }

    public void setIdProj(int idProj) {
        this.idProj = idProj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDesc_proj() {
        return desc_proj;
    }

    public void setDesc_proj(String desc_proj) {
        this.desc_proj = desc_proj;
    }

    public int getValidacao_prof() {
        return validacao_prof;
    }

    public void setValidacao_prof(int validacao_prof) {
        this.validacao_prof = validacao_prof;
    }

    public String getValidacao_coord() {
        return validacao_coord;
    }

    public void setValidacao_coord(String validacao_coord) {
        this.validacao_coord = validacao_coord;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    /**
     * Falta:
     * Disciplina_idDisciplina
     * Equipe_idEquipe
     * Curso_idCurso
     * professor_idProf
     * professor_idCoordenador
     **/
}
