//Puxar o Scanner que é o mesmo do leia do portugol

public static void main(String[] args) {

    //Puxando o "leia"
    Scanner leitor = new Scanner(System.in);

    //Declaração
    int numero_1 = 0;
    long total;
    char operador;
    boolean i = true;

    System.out.println("Digite o primeiro numero: ");
    total = leitor.nextInt();//estrutura do leia

    while (i == true) {

        System.out.println("Resultado: " + total);

        //escolhendo os operadores
        System.out.println("Escolha um operador: \n+\n-\n/\n*\nC\n");
        operador = leitor.next().charAt(0); //Por conta de não haver "next" com char...Adicionamos o "charAt(0)"

        if (operador == 'C' || operador == 'c') {
            System.out.println("Resultado: " + total + "\nProcesso encerrado");
            i = false;
            break;// break = pare
        }

        System.out.println("Digite o segundo numero: ");
        numero_1 = leitor.nextInt();

        if (operador == '+') {
            total = total + numero_1;
        } else if (operador == '-') {
            total = total - numero_1;
        } else if (operador == '*') {
            total = total * numero_1;
        } else if (operador == '/') {
            total = total / numero_1;
        } else {
            System.out.print("Erro: operador não reconhecido");//aqui removi o "ln" para que fique tudo na mesma linha
        }
    }


    leitor.close();

}