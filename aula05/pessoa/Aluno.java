package org.example.pessoa;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String curso;
    private LocalDate dataMatricula;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
