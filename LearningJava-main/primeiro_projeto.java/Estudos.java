public class Estudos{
    public static void main(String[] args) {
        //1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 8.2;
        double nota2 = 7.5;
        double media = (nota1+nota2)/2;
        System.out.println(media);

        //2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double tipo = 10.55553;
        int tipo2 = 10;
        int tipo3 = (int) tipo;
        System.out.println(tipo3);

        //3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra ='o';
        String palavra = "desafi";
        System.out.println(palavra + letra);

        //4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 100;
        int quantidade = 10;
        System.out.println("Você comprou "+quantidade+" biscoitos. O valor total ficou R$"+precoProduto);

        //5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 100;
        double valorEmReal = valorEmDolares * 4.94;
        System.out.println(String.format("A conversao de US$%.2f dolares para real é R$%.2f",valorEmDolares,valorEmReal));

        //6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 150;
        double percentualDesconto = 0.2;
        double precoDescontado = precoOriginal * percentualDesconto;
        System.out.println(precoOriginal - precoDescontado);
    }
}
