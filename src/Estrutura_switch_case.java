import java.util.Scanner;

public class Estrutura_switch_case {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7.");
        int option = scanner.nextInt();
        switch (option) {
//            primeiro formato de switch case
//            case 1:
//                System.out.println("Domingo.");
//                break;
//            case 2:
//                System.out.println("Segunda.");
//                break;
//            case 3:
//                System.out.println("Terça.");
//                break;
//            case 4:
//                System.out.println("Quarta.");
//                break;
//            case 5:
//                System.out.println("Quinta.");
//                break;
//            case 6:
//                System.out.println("Sexta.");
//                break;
//            case 7:
//                System.out.println("Sábado.");
//                break;
//            default:
//                System.out.println("Opção inválida.");
            case 1, 7 -> System.out.println("Fim de semana.");
//            case 1 -> System.out.println("Domingo.");
            case 2 -> System.out.println("Segunda.");
            case 3 -> System.out.println("Terça.");
            case 4 -> System.out.println("Quarta.");
            case 5 -> System.out.println("Quinta.");
            case 6 -> System.out.println("Sexta.");
//            case 7 -> System.out.println("Sábado.");
            default -> System.out.println("Opção inválida.");

        }

    }
}
