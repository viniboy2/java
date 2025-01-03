import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double numero1;
        double numero2; //declaração dos dois numeros a serem utilizados
        // Solicita o número ao usuário
        System.out.println("Digite um número: ");
        numero1 = scanner.nextDouble(); // Lê o número e atribui a 'numero1'
        System.out.println("Digite um número: ");
        numero2 = scanner.nextDouble(); // Lê o número e atribui a 'numero2'
        System.out.println("selecione uma opreração que deseja fazer 1= soma , 2= diferença entre numero 1 e numero2");
        System.out.println("3= multiplicação, 4= divisão )");
        opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                System.out.println("a soma dos números é :"+ (numero1+numero2));
                break;
            case 2:
                System.out.println("a diferença dos números é :"+ (numero1-numero2));
                break;
                case 3:
                System.out.println("a multiplicação dos números é :"+ (numero1*numero2));
                break;
            case 4:
                System.out.println("a divição do primeiro pelo segundo número é :"+ (numero1/numero2));
                break;
        }
        scanner.close(); // Fecha o Scanner
    }
}
