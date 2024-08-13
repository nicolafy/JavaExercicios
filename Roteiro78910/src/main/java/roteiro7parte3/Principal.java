/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7parte3;

/**
 *
 * @author ffnic
 */
/*Que tipo de programa ou limitação você percebe ao utilizar um vetor
estático de objetos: Um problema é o tamanho estático do arrey, n podendo
ser alterado dinamicamente*/

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        
        ArrayList<String> disciplinasAluno01 = new ArrayList<>();
        disciplinasAluno01.add("Matematica");
        disciplinasAluno01.add("Programacao");

        ArrayList<String> disciplinasAluno02 = new ArrayList<>();
        disciplinasAluno02.add("Fisica");
        disciplinasAluno02.add("Quimica");

        ArrayList<String> disciplinasAluno03 = new ArrayList<>();
        disciplinasAluno03.add("Biologia");
        disciplinasAluno03.add("Historia");

        Aluno aluno01 = new Aluno(111, "Jose", "Sistema de Informacao", disciplinasAluno01);
        Aluno aluno02 = new Aluno(222, "Maria", "Engenharia", disciplinasAluno02);
        Aluno aluno03 = new Aluno(333, "Carlos", "Química", disciplinasAluno03);

        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);

    
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Quantidade de Disciplinas: " + aluno.getListaDisciplinas().size()); // Mostra a quantidade de disciplinas
            System.out.println("Disciplinas:");
            for (String disciplina : aluno.getListaDisciplinas()) {
                System.out.println("- " + disciplina);
            }
            System.out.println();
        }
    }
}