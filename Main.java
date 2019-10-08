package veiculos;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void showOptions() {
        System.out.println("Digite o Número respectivo à operação que deseja executar:");
        System.out.println("1 -> Criar um JetSki");
        System.out.println("2 -> Criar um Iate");
        System.out.println("3 -> Criar uma Lancha");
        System.out.println("\nSe deseja encerrar o programa, basta digitar qualquer outro número que não seja os de cima");
    }

    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void createJetSki() {
        int lim;

        System.out.println("Digite o Número de JetSkis que deseja criar:");
        lim = Integer.parseInt(sc.nextLine());

        JetSki[] jt = new JetSki[10];

        for (int i = 0; i < lim; i++) {
            clearConsole();
            System.out.println("Digite os Dados do JetSki " + (i + 1));
            jt[i] = new JetSki();
            jt[i].entradaDados();
        }

        clearConsole();

        for (int i = 0; i < lim; i++) {
            System.out.println("Dados do JetSki " + (i + 1));
            jt[i].imprimir();
            System.out.println("\n");
            sc.nextLine();
        }
    }

    public static void createIate() {
        int lim;

        System.out.println("Digite o Número de Iates que deseja criar:");
        lim = Integer.parseInt(sc.nextLine());

        Iate[] it = new Iate[10];

        for (int i = 0; i < lim; i++) {
            clearConsole();
            System.out.println("Digite os Dados do Iate " + (i + 1));
            it[i] = new Iate();
            it[i].entradaDados();
        }

        clearConsole();

        for (int i = 0; i < lim; i++) {
            System.out.println("Dados do Iate " + (i + 1));
            it[i].imprimir();
            System.out.println("\n");
            sc.nextLine();
        }
    }

    public static void createLancha() {
        int lim;

        System.out.println("Digite o Número de Lanchas que deseja criar:");
        lim = Integer.parseInt(sc.nextLine());

        Lancha[] lc = new Lancha[10];

        for (int i = 0; i < lim; i++) {
            clearConsole();
            System.out.println("Digite os Dados da Lancha " + (i + 1));
            lc[i] = new Lancha();
            lc[i].entradaDados();
        }

        clearConsole();

        for (int i = 0; i < lim; i++) {
            System.out.println("Dados da Lancha " + (i + 1));
            lc[i].imprimir();
            System.out.println("\n");
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        int opt = 2;
        String str;
        while (opt >= 1 && opt <= 3) {
            clearConsole();
            showOptions();
            opt = Integer.parseInt(sc.nextLine());
            clearConsole();
            switch (opt) {
                case 1:
                    createJetSki();
                    break;
                case 2:
                    createIate();
                    break;
                case 3:
                    createLancha();
                    break;
            }
        }
    }
}
