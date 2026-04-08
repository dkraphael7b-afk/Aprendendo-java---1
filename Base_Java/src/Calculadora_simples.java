//Puxar o Scanner que é o mesmo do leia do portugol

public static void main(String[] args) {

    //Puxando o "leia"
    Scanner leitor = new Scanner(System.in);

    //Declaração
    int numero_1;
    int numero_2;
    long total;
    char operador;

    System.out.println("Digite o primeiro numero: ");
    numero_1 = leitor.nextInt();//estrutura do leia

    System.out.println("Digite o segundo numero: ");
    numero_2 = leitor.nextInt();

    //escolhendo os operadores
    System.out.println("Escolha um operador: \n+\n-\n/\n*\n");
    operador = leitor.next().charAt(0); //Por conta de não haver "next" com char...Adicionamos o "charAt(0)"

    if (operador == '+') {
        total = numero_1 + numero_2;
        System.out.println("O resultado é " + total);
    } else if (operador == '-') {
        total = numero_1 - numero_2;
        System.out.println("O resultado é " + total);
    } else if (operador == '*') {
        total = numero_1 * numero_2;
        System.out.println("O resultado é " + total);
    } else if (operador == '/') {
        total = numero_1 / numero_2;
        System.out.println("O resultado é " + total);
    } else {
        System.out.println("Erro: operador não reconhecido");
    }

    leitor.close();

}