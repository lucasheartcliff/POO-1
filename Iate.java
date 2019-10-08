package veiculos;

import java.lang.Math;

public class Iate extends VeiculoAquatico {
    int numeroCabines;
    int numeroTripulantes;
    boolean piscina;

    public Iate(){
        super(0.08);
    }
    public Iate(double dsc){
        super(dsc);
    }
    public Iate(int dsc){
        super(dsc);
    }
    public Iate(float dsc){
        super(dsc);
    }
    public Iate(short dsc){
        super(dsc);
    }
    public Iate(long dsc){
        super(dsc);
    }
    public Iate(char dsc){
        super(dsc);
    }
    public Iate(byte dsc){
        super(dsc);
    }
    public Iate(String dsc) {
        super(dsc);
    }
    public Iate(boolean dsc){
        super (dsc);
    }

    public int pessoasPorCabine() {
        int pessoas = this.numeroPassageiros;
        int cabines = this.numeroCabines;

        if (cabines != 0) {
            return Math.round(pessoas / cabines);
        } else {
            return 0;
        }
    }

    public void cadastrar(String mrc, String mod, String cor, String idt, int npa, int vel, double prc, double alt, int ncb, int ntp, boolean pis) {
        super.cadastrar(mrc, mod, cor, idt, npa, vel, prc, alt);

        this.setNumeroCabines(ncb);
        this.setNumeroTripulantes(ntp);
        this.setPiscina(pis);
    }

    public void entradaDados() {
        super.entradaDados();

        System.out.println("Digite 1 se possui Piscina ou caso não tenha, 0 :");

        this.setPiscina(
                Integer.parseInt(
                        this.sc.nextLine()
                ) == 1
        );

        System.out.println("Digite o Número de Tripulantes:");
        this.setNumeroTripulantes(
                Integer.parseInt(
                        this.sc.nextLine()
                )
        );

        System.out.println("Digite o Número de Cabines:");
        this.setNumeroCabines(
                Integer.parseInt(
                        this.sc.nextLine()
                )
        );
    }

    public void imprimir(){
        super.imprimir();

        System.out.println(
            "Número de Tripulantes: "+ getNumeroTripulantes()
        );

        System.out.println(
            "Número de Passageiros: "+ getNumeroPassageiros()
        );

        System.out.println(
            "Número de Cabines: "+ getNumeroCabines()
        );

        System.out.println(
            "Número de Passageiros por Cabine: "+ pessoasPorCabine()
        );

        System.out.println(
            "Piscina: "+ isPiscina()
        );
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public int getNumeroCabines() {
        return numeroCabines;
    }

    public void setNumeroCabines(int numeroCabines) {
        this.numeroCabines = numeroCabines;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
}
