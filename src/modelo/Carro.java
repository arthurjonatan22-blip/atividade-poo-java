package modelo;

//Parte 1 — Criando a classe Carro

public class Carro{
    private String placa;
    private String marca;
    private String modelo;
    private int velocidade;
    private static int quantidade;{
        quantidade++;
    }

    public String getPlaca(){
        return placa;
    }

    public static int getQuantidade(){
        return quantidade;
    }

    public Carro(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 40;
    }

        public void acelerar(){
            this.velocidade += 10;
        }
        public void frear(){
            this.velocidade -= 10;
        }
        public void exibir() {
            System.out.println(
                    this.placa + " - " + this.marca + " " + this.modelo + " - velocidade: " + this.velocidade + " km/h");
            }

        public void exibirGaragem() {
            System.out.println(this.placa + " - " + this.marca + " " + this.modelo);
        }
}
