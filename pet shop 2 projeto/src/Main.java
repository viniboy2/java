import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Usar apenas um Scanner

        System.out.println("Digite uma das opções abaixo:");
        System.out.println("Seu animal é:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.println("3. Ave\n");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        switch (opcao) {
            case 1: // aqui é um cachorro
                cachorroOUgato cachorro = new cachorroOUgato(); // Criar instância do animal
                System.out.println("Digite o nome do seu cachorro:");
                String nome1 = scanner.nextLine();
                cachorro.setNome(nome1); // Atribuir o nome
                System.out.println("O nome do cachorro é: " + cachorro.getNome()); // Exibir o nome

                break;
            case 2 : // aqui é um gato
                cachorroOUgato gato = new cachorroOUgato();
                System.out.println("digite o nome do seu gato");
                String nome2 = scanner.nextLine();
                gato.setNome(nome2);
                System.out.println("o nome do gato é :" + gato.getNome());
              break;
            default:

                System.out.println("Opção inválida.");
                break;

        }

        scanner.close(); // Fechar o Scanner
    }
}



