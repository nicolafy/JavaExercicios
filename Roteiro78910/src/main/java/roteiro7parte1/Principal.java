/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7parte1;

/**
 *
 * @author ffnic
 */
/*Que tipo de programa ou limitação você percebe ao utilizar um vetor
estático de objetos: Um problema é o tamanho estático do arrey, n podendo
ser alterado dinamicamente*/

import java.util.Scanner;
 public class Principal{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
                                                                                                                                               
        System.out.println("Escreva o numero de matricula: ");
        int matricula = scan.nextInt();
        System.out.println("Escreva o nome do Aluno : ");
        String nome = scan.nextLine();
        
        
    Aluno[] listaAluno = new Aluno[3];
    
    Aluno aluno01 = new Aluno(111,"Jose","Sistema da informacao", 2019);
    Aluno aluno02 = new Aluno(123,"Lucas","Informatica", 2020);
    Aluno aluno03 = new Aluno(134,"Jose","ADM", 2023);
    
    listaAluno[0] = aluno01;
    listaAluno[1] = aluno02;
    listaAluno[2] = aluno03;
    
     System.out.println("Listando Alunos:");
     for(int i = 0; i<3; i++){
         System.out.println("Matricula:" + listaAluno[i].getMatricula());
          System.out.println("Nome:" + listaAluno[i].getNome());
           System.out.println("Curso:" + listaAluno[i].getCurso());
            System.out.println("Ano Ingresso:" + listaAluno[i].getAnoIngresso());
     }
    }
 }