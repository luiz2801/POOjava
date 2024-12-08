
class questao03 {
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
public class maiorInteiro {
    public static void main(String[] args) {
        questao03 x = new questao03(); // Parênteses adicionados na instância
        x.maior(3, 5);        
    }
}