//3) Escreva um método que receba dois números inteiros e imprima o maior entre eles.

class questao3 {
    public static void maior(int n1, int n2){
        if (n1 >n2){
            System.out.println(n1 + " É maior");
        }
        else if (n2 > n1){
            System.out.println(n2 + " É maior");
        }
        else{
            System.out.println("Eles são iguais");
        }
    }
}

