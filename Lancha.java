package veiculos;

public class Lancha extends VeiculoAquatico {
    String tipoCasco;
    boolean banheiro;

    public Lancha(){
        super(0.10);
    }
    public Lancha(double dsc){
        super(dsc);
    }
    public Lancha(int dsc){
        super(dsc);
    }
    public Lancha(float dsc){
        super(dsc);
    }
    public Lancha(short dsc){
        super(dsc);
    }
    public Lancha(long dsc){
        super(dsc);
    }
    public Lancha(char dsc){
        super(dsc);
    }
    public Lancha(byte dsc){
        super(dsc);
    }
    public Lancha(String dsc) {
        super(dsc);
    }
    public Lancha(boolean dsc){
        super (dsc);
    }

    public void cadastrar(String mrc, String mod, String cor, String idt, int npa, int vel, double prc, double alt, String tcs, boolean ban) {
        super.cadastrar(mrc, mod, cor, idt, npa, vel, prc, alt);
        this.setBanheiro(ban);
        this.setTipoCasco(tcs);
    }

    public void entradaDados() {
        super.entradaDados();

        System.out.println("Digite o Tipo de Casco:");
        this.setTipoCasco(
            super.sc.nextLine()
        );

        System.out.println("Digite 1 se possui Banheiro, caso não, digite 0:");
        this.setBanheiro(
                Integer.parseInt(
                        this.sc.nextLine()
                ) == 1
        );
    }

    public void imprimir() {
        super.imprimir();

        System.out.println(
            "Tipo de Casco: " + this.getTipoCasco()
        );

        System.out.println(
            "Banheiro: " + this.isBanheiro()
        );
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
}
