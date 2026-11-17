import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        int opcao;

        do {

            System.out.println("===== CALCULADORA JAVA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
        } while (opcao != 0);
        System.out.println("Calculadora encerrada!");

        entrada.close();
    }
    
}
