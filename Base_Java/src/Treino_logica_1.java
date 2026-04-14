import java.util.Scanner;

public class Treino_logica_1 {
    public static void main(String[] args) {

        int idade;
        double salario;
        int score;
        double valor_parcelas;
        double valor_emprestimo;
        double parcelas;
        double parcelas2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Idade do cliente: ");
        idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Idade autorizada");
            System.out.println("Salario do cliente: ");
            salario = leitor.nextDouble();

            System.out.println("Score do cliente: ");
            score = leitor.nextInt();

            if (score >= 700 && salario >= 1500.00) {
                System.out.print("Emprestimo aprovado");
            } else if ((score >= 500) && (score <= 699) && (salario >= 5000.00)) {
                System.out.println("Emprestimo aprovado");
            } else {
                System.out.println("Emprestimo não aprovado...score ou salario baixo");
                return; // outro "pare" , mas esse é para condições
            }

            valor_parcelas = salario * 0.30;
            System.out.println("Digite o valor do emprestimo");
            valor_emprestimo = leitor.nextDouble();
            parcelas = (int) (valor_emprestimo / valor_parcelas);
            parcelas2 = (valor_emprestimo % valor_parcelas);
            System.out.println(parcelas + " de " + valor_parcelas + "R$");
            System.out.println("E +1 parcela de " + parcelas2 + "R$");
            System.out.println("Agradecemos a preferência...");
        } else {
            System.out.print("Idade não autorizada...");
        }

    }
}
