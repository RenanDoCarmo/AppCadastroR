/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private String matricula;
    private Date ano;
    
public Aluno() {
    this.nome = "";
    this.sexo = "f";
    this.idade = 0;
    this.matricula = "";
    this.ano = new Date();    
}
}
