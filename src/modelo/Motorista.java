package modelo;

public class Motorista {
    private String nome;
    private Carro carro;

    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public void exibir() {
        System.out.print("Motorista: " + this.nome + " -> ");
        if (carro == null) {
            System.out.println("Carro: nenhum");
        } else {
            System.out.println(carro.getPlaca());
        }
    }

    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }
}