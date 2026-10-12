package app;

import modelo.Carro;
import modelo.Motorista;
import modelo.Garagem;

public class Principal{
    public static void main(String[] args) {
        Carro carro1 = new Carro("ABC1234", "Fiat", "Uno");
        Carro carro2 = new Carro("FAR6769", "Volkswagen", "Fusca");
        Carro carro3 = new Carro("POL2213", "Chevrolet", "Camaro");

        //Parte 2 — Criando objetos
        //carro1.exibir();
        //carro2.exibir();
        //carro3.exibir();
        carro1.acelerar();
        carro1.acelerar();
        carro2.frear();
        carro3.acelerar();
        carro3.acelerar();
        carro3.acelerar();
        //carro1.exibir();
        //carro2.exibir();
        //carro3.exibir();

        //Parte 3 — Referências para objetos
        //Carro carro4 = carro1;
        //carro4.exibir();
        //carro4.acelerar();

        //Parte 4 — Utilizando null
        Carro carro5 = null;
        //carro5.acelerar();
        //if (carro5 != null) {
        //    carro5.acelerar();
        //}
        //carro5.exibir();

        //Parte 5 — Classes como tipos
        Motorista motorista1 = new Motorista("Ayton", carro1);
        Motorista motorista2 = new Motorista("Genoveva", carro2);
        Motorista motorista3 = new Motorista("Enéas", carro3);
        //motorista1.exibir();

        //Parte 6 — Objetos como parâmetros
        //motorista1.trocarCarro(carro3);
        //motorista1.exibir();

        //Parte 8 — static
        //System.out.println("Carros criados: " + Carro.getQuantidade());

        //Parte Desafio
        Garagem garagem = new Garagem();
        garagem.estacionar(carro1);
        garagem.estacionar(carro2);
        garagem.estacionar(carro3);

        System.out.println("=== VEÍCULOS === \n");
        carro1.exibir();
        carro2.exibir();
        carro3.exibir();

        System.out.println("\n === MOTORISTAS === \n");
        motorista1.exibir();
        motorista2.exibir();

        System.out.println();
        garagem.exibir();

        System.out.println("\nTotal de carros criados: " + Carro.getQuantidade());
    }
}