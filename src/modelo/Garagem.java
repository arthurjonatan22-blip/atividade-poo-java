package modelo;

//Desafio final
public class Garagem{
    private Carro carro1;
    private Carro carro2;
    private Carro carro3;
    public void estacionar(Carro carro){
        if(carro1 == null) {
            this.carro1 = carro;
        }else if(carro2 == null) {
            this.carro2 = carro;
        }else if(carro3 == null) {this.carro3 = carro;
        }else {
            System.out.println("GARAGEM CHEIA!");
        }
    }
    public void exibir(){
        System.out.println("=== GARAGEM === \n");
        if(carro1 != null){
            System.out.print("1. ");
            carro1.exibirGaragem();
        }
        if(carro2 != null){
            System.out.print("2. ");
            carro2.exibirGaragem();
        }
        if(carro3 != null){
            System.out.print("3. "); carro3.exibirGaragem();
        }
    }
}