import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int numero1 = 0;
        int numero2 = 0;        
        double resultado;

        do {

            System.out.println("===== CALCULADORA JAVA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 4) {                
                System.out.print("Digite o primeiro número: ");
                numero1 = entrada.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = entrada.nextInt();
                
            }

            switch (opcao) {
                case 1:         
                    resultado = numero1 + numero2;
                    System.out.println("O resultado é: " + resultado);
                  
                    break;

                case 2:
                   
                    resultado = numero1 - numero2;
                    System.out.println("O resultado é: " + resultado);
                    
                    break;

                case 3:                    
                    
                    resultado = numero1 * numero2;
                    System.out.println("O resultado é: " + resultado);
                    break;

                case 4:                    
                                       
                    if (numero2 != 0) {
                       resultado = (double) numero1 / numero2;
                       System.out.println("O resultado é: " + resultado);                      
                    } else {
                        System.out.println("Não é possivel dividir por zero");
                    }
                    
                    break;

                case 0:
                    
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opcao != 0);
        System.out.println("Calculadora encerrada!");

        entrada.close();
    }
    
}
