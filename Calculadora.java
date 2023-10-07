import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário.
        Scanner scann = new Scanner(System.in);

        // Cria um loop infinito para que o programa continue até que o usuário escolha sair.
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite o número da operação desejada: ");

            // Le a escolha do usuário.
            int escolha = scann.nextInt();
            System.out.println("-----------------------------------------");

            // Verifica se o usuário deseja sair.
            if (escolha == 5) {
                System.out.println("Calculadora encerrada volte sempre :)");
                break; // Sai do loop.
            }
            
            // Solicita ao usuário para digitar dois números.
            System.out.print("Digite o primeiro número: ");
            double numero1 = scann.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scann.nextDouble();

            double resultado = 0;

            // Executa a operação selecionada pelo usuário.
            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                     // Certifica de que o divisor não e zero para evitar a divisão por zero.
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                        continue; // Continua o loop para que o usuário possa tentar novamente.
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue; // Continua o loop para que o usuário possa tentar novamente.
            }

             // Exibe o resultado da operação.
            System.out.println("Resultado: " + resultado);
        }

        // Fecha o Scanner quando não e necessário.
        scann.close();
    }
}
