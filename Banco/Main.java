package p3.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Banco> contas = new ArrayList();

    public static void main(String[] args) {

        int op, conta;
        Banco aux;
        Scanner scan = new Scanner(System.in);

        do {
            menuOp();
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o número da conta: ");
                    conta = scan.nextInt();

                    criarConta(conta);

                    break;
                case 2:

                    System.out.println("Digite o número da conta: ");
                    conta = scan.nextInt();

                    if (existeConta(conta)) {

                        aux = buscarConta(conta);

                        System.out.println("Digite a quantia a ser depositada: ");
                        double dep = scan.nextDouble();
                        aux.depositar(dep);

                    } else {
                        System.out.println("Conta não existe!");
                    }
                    break;
                case 3:

                    System.out.println("Digite o número da conta: ");
                    conta = scan.nextInt();

                    if (existeConta(conta)) {

                        aux = buscarConta(conta);

                        System.out.println("Digite a quantia a ser depositada: ");
                        double sac = scan.nextDouble();
                        aux.sacar(sac);

                    } else {
                        System.out.println("Conta não existe!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    conta = scan.nextInt();

                    aux = buscarConta(conta);
                    if (aux != null) {
                        System.out.println("R$" + aux.getSaldo());
                    } else {
                        System.out.println("Conta incorreta ou não existe!");
                    }
                    break;
                case 0:
                    op = 0;
                    System.out.println("PROGRAMA FINALIZADO!");
                    break;
                default:
                    System.out.println("Opçãp inválida. digite novamente!");
            }

        } while (op != 0);

    }

    public static void menuOp() {
        System.out.println("BANCO");
        System.out.println(""
                + "\n[1] - Criar uma conta"
                + "\n[2] - Depositar"
                + "\n[3] - Sacar"
                + "\n[4] - Ver saldo"
                + "\n[0] - Sair");
    }

    public static void criarConta(int num) {

        if (!existeConta(num) && num >= 0) {
            contas.add(new Banco(num));
            System.out.println("CONTA CRIADA!");
        } else {
            System.out.println("CONTA JÁ EXISTE!");
        }

    }

    public static boolean existeConta(int num) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getConta() == num) {

                return true;
            }
        }

        return false;
    }

    public static Banco buscarConta(int num) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getConta() == num) {
                return contas.get(i);
            }
        }
        return null;

    }

}
