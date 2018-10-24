/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.util.List;
  
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author NIFVC
 */
//Colocar em um banco mais claro tipo mysql
//Para enteder melhor: https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711
public class AlunoDAO {
  
  
         private static AlunoDAO instance;
         protected EntityManager entityManager;
          
         public static  AlunoDAO  getInstance(){
                   if (instance == null){
                            instance = new AlunoDAO ();
                   }
                    
                   return instance;
         }
  
         private AlunoDAO () {
                   entityManager = getEntityManager();
         }
  
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
  
                   return entityManager;
         }
  
         public Aluno getById(final int id) {
                   return entityManager.find(Aluno.class, id);
         }
  
         @SuppressWarnings("unchecked")
         public List<Aluno> findAll() {
                   return entityManager.createQuery("FROM " + Aluno.class.getName()).getResultList();
         }
  
         public void persist(Aluno aluno) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(aluno);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
  
         public void merge(Aluno aluno) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(aluno);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
  
         public void remove(Aluno aluno) {
                   try {
                            entityManager.getTransaction().begin();
                            aluno = entityManager.find(Aluno.class, aluno.getIdAluno());
                            entityManager.remove(aluno);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
  
         public void removeById(final int id) {
                   try {
                            Aluno aluno = getById(id);
                            remove(aluno);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
  
}
