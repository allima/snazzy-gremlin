package org.example;

import org.example.repository.ImdbRepository;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ImdbRepository imdbRepository = new ImdbRepository();
        System.out.println("Consulta filmes" + imdbRepository.consultTop250Filmes());


    }
}
