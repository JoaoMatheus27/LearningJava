//usando printf com float

public class Multiplicacao {
    int num1 = 10;
    float num2 = (float)2.50; //ou double num2 = 2.5; ou float num2 = 2.50f;
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();
            System.out.printf("O resultado da multiplicaçao entre %d e %f é igual a %f\n", multiplicacao.num1,multiplicacao.num2,multiplicacao.num1*multiplicacao.num2);
    }
}

//usando o println

//public class Multiplicacao {
//    public static void main(String[] args){
//        System.out.println(10*20);
//    }
//}


