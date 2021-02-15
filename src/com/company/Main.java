package com.company;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(4);



        carro.setCor(Carro.AZUL);
        carro.setMarcas(Carro.FERRARI);
        carro.setAno(2020);

        carro.infos();

    }
}
