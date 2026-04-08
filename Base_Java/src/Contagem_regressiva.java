void main(String[] args) {

    Scanner leia = new Scanner(System.in); // testando novos nomes para o scanner
    int i;
    int contagem;

    System.out.println("Digite o número da contagem");
    contagem = leia.nextInt();
    for (i = 0; i < contagem; ) {
        contagem = contagem - 1;
        System.out.println(contagem);
    }

}