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
                System.out.println("digite a idade do " + cachorro.getNome());
                 float idade1 = scanner.nextFloat();
                scanner.nextLine();
                cachorro.setIdade(idade1);
                System.out.println("digite o porte do " + cachorro.getNome() + "PEQUENO MEDIO OU GRANDE");
                String tamanhodog = scanner.nextLine();
                cachorro.setTamanho(tamanhodog);
                System.out.println("digite a cor do pelo do" + cachorro.getNome());
                String Cordopelo = scanner.nextLine();
                cachorro.setCorDoPelo(Cordopelo);
                System.out.println("\nInformações do cachorro:");
                System.out.println("Nome: " + cachorro.getNome());
                System.out.println("Idade: " + cachorro.getIdade() + " anos");
                System.out.println("Porte: " + cachorro.getTamanho());
                System.out.println("Cor do pelo: " + cachorro.getCorDoPelo());

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



