package veiculos;

public class JetSki extends VeiculoAquatico{
    boolean reboque;
    String tipoCasco;

    public JetSki(){
        super(0.15);
    }
    public JetSki(double dsc){
        super(dsc);
    }
    public JetSki(int dsc){
        super(dsc);
    }
    public JetSki(float dsc){
        super(dsc);
    }
    public JetSki(short dsc){
        super(dsc);
    }
    public JetSki(long dsc){
        super(dsc);
    }
    public JetSki(char dsc){
        super(dsc);
    }
    public JetSki(byte dsc){
        super(dsc);
    }
    public JetSki(String dsc) {
        super(dsc);
    }
    public JetSki(boolean dsc){
        super (dsc);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(
            "Reboque: "+ isReboque()
        );

        System.out.println(
            "Tipo de Casco: "+ getTipoCasco()
        );
    }

    public void cadastrar(String mrc, String mod, String cor, String idt, int npa, int vel, double prc, double alt, String tcs, boolean rbq) {
        super.cadastrar(mrc, mod, cor, idt, npa, vel, prc, alt);
        this.setReboque(rbq);
        this.setTipoCasco(tcs);
    }

    public void entradaDados() {
        super.entradaDados();

        System.out.println("Digite 1 se possui Reboque ou 0 se não possui:");
        this.setReboque(
                Integer.parseInt(
                        this.sc.nextLine()
                ) == 1
        );

        System.out.println("Digite o Tipo de Casco:");
        this.setTipoCasco(
            super.sc.nextLine()
        );
    }

    public boolean isReboque() {
        return reboque;
    }

    public void setReboque(boolean reboque) {
        this.reboque = reboque;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }
}
