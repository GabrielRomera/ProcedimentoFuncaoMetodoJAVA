package FuncaoProcedimentoMetodo;
	import java.util.Scanner;
		public class exercicio2{
				public static void main(String[]Args) {
				
					
	Scanner leitor = new Scanner(System.in);
	int exib; 
	exib = cal();
	}
	
				public static int cal() {
				int num1, num2;
				
				
	Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o primeiro numero: ");
    	num1 = entrada.nextInt();
    System.out.print("Digite o segundo numero: ");
    	num2 = entrada.nextInt();

    		for(int x=1; x <=num2; x++) {
    		System.out.println("\n"+num1+ " + "+x+ " = "+ (num1+x));}

    		return num1 + num2;
   
	
	
	}
}				
		



