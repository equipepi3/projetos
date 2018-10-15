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
public class Professor {
    private int idProf;
    private String mat_professor;
    private int Coordenador;
    private String nome_professor;
    //Teste usando long
    private Long senha;
    private String nome_social;
    //Metodos especiais
    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getMat_professor() {
        return mat_professor;
    }

    public void setMat_professor(String mat_professor) {
        this.mat_professor = mat_professor;
    }

    public int getCoordenador() {
        return Coordenador;
    }

    public void setCoordenador(int Coordenador) {
        this.Coordenador = Coordenador;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }
    
    //Metodos esqueci
    public int validar(){
        //retorna validação para coordenador e professor
        //-ainda não bem especificado
        return 1;
    }
    
    public boolean autenticacao(){
        //bolean para sinalizar que a autenticação foi bem sucedida
        return true;
    }
    
    public void cadastro(){
        //Somente para entrar novos professores
        //provavelmente não necessário tipo de retorno
        //por ser parecido com o set
    }
    
}
