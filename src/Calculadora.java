import java.util.Scanner;

public class Calculadora {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        public static int CalculaPotencia (int number, int power){
        System.out.println("Bem-Vindo a calculadora de Potências!\n");
        System.out.println("Digite primeiro a base do número que desejar saber a potência, e em seguida, o expoente.\n");    
        
        int N, p; //Neste caso, N se refere a base, e p o expoente.

        System.out.println("Digite a base"); 
        Scanner potencia = new Scanner(System.in);
        N = potencia.nextInt();


        System.out.println("Digite o expoente\n");
        p = potencia.nextInt();

        int resultado = Calculator(N, p);

    }

}
}