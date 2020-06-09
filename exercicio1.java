package FuncaoProcedimentoMetodo;
	import java.util.Scanner;
		public class exercicio1{
			public static void main(String[]Args) {
					

				Scanner leitor = new Scanner(System.in);
				int x,y; 
				
				System.out.print( "Digite o primeiro numero: " );
		        x = leitor.nextInt();
		        
		        System.out.print( "Digite o segundo numero: " );
		        y = leitor.nextInt();
		        
		        System.out.print("Multiplicacao de " + x + " x " + y+ ": " + (multi(x,y)));
		       
		        
}
		        public static int multi(int x  , int y){
		        	int multi = x * y;
		        	return multi;
		        
		        
				
				
	}
}

