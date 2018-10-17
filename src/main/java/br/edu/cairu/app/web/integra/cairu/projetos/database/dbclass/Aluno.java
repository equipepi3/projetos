/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.Id;

/**
 *
 * @author NIFVC
 */
@ManagedBean
@ViewScoped

public class Aluno {
    @Id
    private int idAluno;
    private int idAlunoAutenticacaoTeste = 123;
    private String mat_aluno;
    private String nome_Aluno;
    private String nome_social;
    private String senha;
    private String senhaAutenticacaoTeste = "123";
    private String mensagem;
    //Métodos especiais
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getMat_aluno() {
        return mat_aluno;
    }

    public void setMat_aluno(String mat_aluno) {
        this.mat_aluno = mat_aluno;
    }

    public String getNome_Aluno() {
        return nome_Aluno;
    }

    public void setNome_Aluno(String nome_Aluno) {
        this.nome_Aluno = nome_Aluno;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
     //Metódos personalizados
    public String cadastro(){
        mensagem = "id:" + getIdAluno() + 
                "senha:" + getSenha()
                + "Nome:" + getNome_Aluno()
                + "Nome Social:" + getNome_social()
                + "Cadastrado com sucesso";
        return mensagem;
        //guardar as informações no banco
        //Somente string no momento
        //Aqui com o banco vamos enviar ao banco
    }
    public boolean autenticacao(){
        //Fazer um teste try catch
        //Sendo que aqui entraria as noções de busca em banco
        if(idAluno == idAlunoAutenticacaoTeste && senha.equals(senhaAutenticacaoTeste)){
            mensagem = "Conectado!";
        }else{
            mensagem = "Falha ao conectar";
        }
        return true;
    }
}
