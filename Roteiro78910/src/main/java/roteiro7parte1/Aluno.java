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
estático de objetos*/

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;


    public Aluno(int Matricula, String Nome, String Curso, int AnoIngresso) {
        this.matricula = Matricula;
        this.nome = Nome;
        this.curso = Curso;
        this.anoIngresso = AnoIngresso;
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
    
