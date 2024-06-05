public class Filme {
    public static void main(String[] args) {
        /*System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 90";
        System.out.println(sinopse);*/

        //Somando strings

//        String nome = "alura";
//        String saudacao = "Olá, ";
//        String msg = saudacao + nome + "!";
//        System.out.println(msg);

        //comparando strings

        /*String senha = "12345";
        if(senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        }else{
            System.out.println("Senha incorreta.");
        }*/

        //formatando texto

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


    }
}
