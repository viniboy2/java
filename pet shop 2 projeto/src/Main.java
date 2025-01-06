import javax.management.AttributeValueExp;
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
            case 2: // aqui é um gato
                cachorroOUgato gato = new cachorroOUgato(); // Criar instância do animal
                System.out.println("Digite o nome do seu gato:");
                String nome2 = scanner.nextLine();
                gato.setNome(nome2); // Atribuir o nome
                System.out.println("digite a idade do " + gato.getNome());
                float idade2 = scanner.nextFloat();
                scanner.nextLine();
                gato.setIdade(idade2);
                System.out.println("digite o porte do " + gato.getNome() + "PEQUENO MEDIO OU GRANDE");
                String tamanhocat = scanner.nextLine();
                gato.setTamanho(tamanhocat);
                System.out.println("digite a cor do pelo do" + gato.getNome());
                String Cordopelo2 = scanner.nextLine();
                gato.setCorDoPelo(Cordopelo2);
                System.out.println("\nInformações do cachorro:");
                System.out.println("Nome: " + gato.getNome());
                System.out.println("Idade: " + gato.getIdade() + " anos");
                System.out.println("Porte: " + gato.getTamanho());
                System.out.println("Cor do pelo: " + gato.getCorDoPelo());
                break;


            case 3: // aqui é uma ave
                ave ave = new ave(); // Criar instância do animal
                System.out.println("Digite o nome da sua ave:");
                String nome3 = scanner.nextLine();
                ave.setNome(nome3); // Atribuir o nome
                System.out.println("digite a idade do " + ave.getNome());
                float idade3 = scanner.nextFloat();
                scanner.nextLine();
                ave.setIdade(idade3);
                System.out.println("digite o porte do " + ave.getNome() + "PEQUENO MEDIO OU GRANDE");
                String tamanhocat1 = scanner.nextLine();
                ave.setTamanho(tamanhocat1);
                System.out.println("digite a cor do pelo do" + ave.getNome());
                String Cordapena = scanner.nextLine();
                ave.setCorDasPenas(Cordapena);
                System.out.println("\nInformações do cachorro:");
                System.out.println("Nome: " + ave.getNome());
                System.out.println("Idade: " + ave.getIdade() + " anos");
                System.out.println("Porte: " + ave.getTamanho());
                System.out.println("Cor do pelo: " + ave.getCorDasPenas());
                break;
            default:

                System.out.println("Opção inválida.");
                break;

        }
        scanner.close(); // Fechar o Scanner
    }

}