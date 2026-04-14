import java.util.Scanner;

public class TreinoLogica1 {
    public static void main(String[] args) {

        //codigo melhorado...

        int idade;
        int score;
        double salario;
        Scanner leia = new Scanner(System.in);

        System.out.println("Idade do usuario: ");
        idade = leia.nextInt();

        // validação de dado
        if (idade < 0) {
            System.out.println("Dado invalido...");
            return;
            }

        if (idade >= 18) {
            System.out.println("Idade aprovada: ");
            //Adicionando o score
            System.out.println("Digite o Score: ");
            score = leia.nextInt();

            //Adicionando salario
            System.out.println("Digite o salario do usuario: ");
            salario = leia.nextDouble();

            //validação de dados
            if (salario <= 0.0) {
                System.out.println("Dado invalido...");
                return;
            }

            if (score >= 700 && score <= 1000 && salario >= 1500.00) {
                System.out.println("Emprestimo aprovado!!!");
            } else if (score >= 500 && score <= 699 && salario >= 5000.00) {
                System.out.println("Emprestimo aprovado!!!");
            } else {
                System.out.println("Emprestimo não aprovado, score ou salario baixo!!!");
            }

        }
    }
}
