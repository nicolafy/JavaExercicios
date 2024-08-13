/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7parte3;

import java.util.ArrayList;




    
class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private ArrayList<String> listaDisciplinas;


    public Aluno(int matricula, String nome, String curso, ArrayList<String> listaDisciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.listaDisciplinas = listaDisciplinas;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<String> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<String> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
}