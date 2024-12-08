//Escreva um programa que imprima na tela a soma dos números ímpares entre 1 e 30 e amultiplicação dos números pares entre 1 e 30.
public class questao05 {

    // Method to perform operations
    public void operations() {
        long a = 1; 
        int b = 0;  

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) { 
                a *= i;
                System.out.println("a: " + a);
            } else { 
                b += i;
                System.out.println("b: " + b);
            }
        }

       
        b -= 1;
    }

    public static void main(String[] args) {
        questao05 operation = new questao05();
        operation.operations();
    }
}
