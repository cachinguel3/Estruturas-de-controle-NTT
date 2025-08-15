import java.util.Scanner;

public class Estrutura_if_else {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equals("s");

        if (age >= 18) {
            System.out.println("Bem vindo");
            System.out.printf("%s, você tem %s anos e pode dirigir. \n", name, age);
        } else if (age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir \n", name, age);
        } else {
            System.out.printf("%s, você não pode dirigir. \n", name);
        }

        System.out.println("Fim de execusão");
    }
}
