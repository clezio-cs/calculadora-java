import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int restoDivisao = numero1 % numero2;

        System.out.println("A soma do número 1 e número 2 é: " + soma);
        System.out.println("A subtração do número 1 e número 2 é: " + subtracao);
        System.out.println("A multiplicação do número 1 e número 2 é: " + multiplicacao);
        System.out.println("A divisao do número 1 e número 2 é: " + divisao );
        System.out.println("O resto da divisão do número 1 e número 2 é: " + restoDivisao);

        entrada.close();
      

    }
    
}

/**/