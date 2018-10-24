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
@Table(name="professor")
public class Professor {
    @Id @GeneratedValue
    private int idProf;
    @Column
    private int idProfAutenticacaoTeste = 321;
    @Column
    private String mat_professor;
    @Column
    private int Coordenador;
    @Column
    private String nome_professor;
    //Teste usando long
    @Column
    private String senha;
    @Column
    private String senhaAutenticacaoTeste = "321";
    @Column
    private String nome_social;
    
    private String mensagem;
    
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    //Metodos esqueci
    public int validar(){
        //retorna validação para coordenador e professor
        //-ainda não bem especificado
        //não faço ideia como fazer isso agr
        return 1;
    }
    
    public /*boolean quando for fazer da forma correta*/ String autenticacao(){
    
       if (idProf == idProfAutenticacaoTeste && senha.equals(senhaAutenticacaoTeste) ){
           
          mensagem = "Autenticação Realizada com sucesso";
       
       }else{
           
           mensagem = "Falha na Autenticação"; 
       }
           
           return mensagem;
           
           
    }
       
    
    public String cadastro(){
        
        mensagem = "Id do Professor" + getIdProf()+
                    "Matricula do Professor" + getMat_professor()+
                    "Senha" + getSenha() +
                    "Nome do Professor" + getNome_professor()+
                    "Coordenador" + getCoordenador()+
                    "Nome Social" + getNome_social();
                
                    
        
        
        
        return mensagem;
    }
}
