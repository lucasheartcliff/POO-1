package veiculos;

import java.util.Scanner;

public class VeiculoAquatico {
    String marca;
    String modelo;
    String cor;
    String identificacao;
    int numeroPassageiros;
    int velocidadeMaxima;
    double preco;
    double alturaCalado;
    double desconto;

    final Scanner sc = new Scanner(System.in);

    public VeiculoAquatico(){}
    public VeiculoAquatico(double dsc){
        this.setDesconto(dsc);
    }
    public VeiculoAquatico(int dsc){

        this.setDesconto(dsc);
    }
    public VeiculoAquatico(float dsc){
        this.setDesconto(dsc);
    }
    public VeiculoAquatico(short dsc){
        this.setDesconto(dsc);
    }
    public VeiculoAquatico(long dsc){
        this.setDesconto(dsc);
    }
    public VeiculoAquatico(char dsc){
        double cds = Character.getNumericValue(dsc);
        this.setDesconto(cds);
    }
    public VeiculoAquatico(byte dsc){
        this.setDesconto(dsc);
    }
    public VeiculoAquatico(String dsc) {
        double cds = Double.parseDouble(dsc);
        this.setDesconto(cds);
    }
    public VeiculoAquatico(boolean dsc){
        this.setDesconto (dsc ? 1 : 0);
    }


    public void cadastrar(String mrc, String mod, String cor, String idt, int npa, int vel, double prc, double alt){
        this.setMarca(mrc);
        this.setAlturaCalado(alt);
        this.setCor(cor);
        this.setModelo(mod);
        this.setIdentificacao(idt);
        this.setVelocidadeMaxima(vel);
        this.setPreco(prc);
        this.setNumeroPassageiros(npa);
    }

    public void imprimir(){
        System.out.println("Marca: "+ this.getMarca());
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Identificação: "+ this.getIdentificacao());
        System.out.println("Velocidade Máxima: "+ this.getVelocidadeMaxima());
        System.out.println("Número de Passageiros: "+ this.getNumeroPassageiros());
        System.out.println("Preço: R$ "+ this.getPreco());
        System.out.println("Preço com Desconto: R$ "+ valorDesconto());
        System.out.println("Altura do Calado: " + this.getAlturaCalado());
    }

    public void entradaDados(){
        System.out.println("Digite a Marca:");
        this.setMarca(
            this.sc.nextLine()
        );

        System.out.println("Digite o Modelo:");
        this.setModelo(
            this.sc.nextLine()
        );

        System.out.println("Digite a Cor:");
        this.setCor(
            this.sc.nextLine()
        );

        System.out.println("Digite a Identificação:");
        this.setIdentificacao(
            this.sc.nextLine()
        );

        System.out.println("Digite a Velocidade Máxima");
        this.setVelocidadeMaxima(
                Integer.parseInt(
                        this.sc.nextLine()
                )
        );

        System.out.println("Digite o Número de Passageiros:");
        this.setNumeroPassageiros(
            Integer.parseInt(
                this.sc.nextLine()
            )
        );

        System.out.println("Digite o Preço:");
        this.setPreco(
            Double.parseDouble(
                this.sc.nextLine()
            )
        );

        System.out.println("Digite a Altura do Calado:");
        this.setAlturaCalado(
            Double.parseDouble(
                this.sc.nextLine()
            )
        );
    }

    public double valorDesconto(){
        final double preco = getPreco();
        final double desconto = preco * getDesconto();

        return (preco - desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAlturaCalado() {
        return alturaCalado;
    }

    public void setAlturaCalado(double alturaCalado) {
        this.alturaCalado = alturaCalado;
    }
}
