/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7parte2;

/**
 *
 * @author ffnic
 */
/*Que tipo de programa ou limitação você percebe ao utilizar um vetor
estático de objetos: Um problema é o tamanho estático do arrey, n podendo
ser alterado dinamicamente*/


import java.util.ArrayList;
import java.util.Scanner; 
 public class Principal{ 
      public static void main(String[] args) {
      
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
               
        
         
        Aluno aluno01 = new Aluno(111,"jose" , "Sistema de informação");
        Aluno aluno02 = new Aluno(222, "Maria","Engenharia");
        Aluno aluno03 = new Aluno(333, " Carlos" , "Quimica");
        
        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);
        
        }
    }