package com.company;

import com.company.br.com.dio.desafio.dominio.Conteudo;
import com.company.br.com.dio.desafio.dominio.Curso;
import com.company.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Curso curso1 = new Curso();
         curso1.setTitulo("Curso Java.");
         curso1.setDescricao("Campo de descrição curso java.");
         curso1.setCargaHoraria(8);

     Curso curso2 = new Curso();
         curso2.setTitulo("Curso Javascript.");
         curso2.setDescricao("Campo de descrição curso javascript.");
         curso2.setCargaHoraria(8);

     Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Campo de descrição da mentoria.");
        mentoria.setData(LocalDate.now());

        System.out.println();

    }
}
