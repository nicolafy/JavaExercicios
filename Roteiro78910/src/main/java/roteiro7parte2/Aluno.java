/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7parte2;

import roteiro7parte1.*;

/**
 *
 * @author ffnic
 */
/*Que tipo de programa ou limitação você percebe ao utilizar um vetor
estático de objetos*/

    import java.util.ArrayList;




    
class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    
    public Aluno(int pmatricula, String pnome, String pcurso, int panoIngresso) {
        this.matricula = pmatricula;
        this.nome = pnome;
        this.curso = pcurso;
        this.anoIngresso = panoIngresso;
    }

    Aluno(int i, String jose, String sistema_de_informação) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}