
class questao06 {
    public int a, b;
    public String x, y;

    // Método para trocar inteiros usando uma variável temporária
    public void trocaTempInt() {
        int temp = a;
        a = b;
        b = temp;
    }

    // Método para trocar inteiros sem uma variável temporária
    public void trocaSTempInt() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    // Método para trocar Strings usando uma variável temporária
    public void trocaTempStr() {
        String temp = x;
        x = y;
        y = temp;
    }
 
}

