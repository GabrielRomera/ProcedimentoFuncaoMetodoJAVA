package FuncaoProcedimentoMetodo;
	import java.util.Scanner;
		public class exercicio3{
				public static void main(String[]Args) {

	
		boolean resultado = cal(0, 0, 0, 0);
		System.out.println(resultado);


        if(resultado == true) {
            System.out.println("Aluno Aprovado");
}
        else if( resultado == false) {
        System.out.println("Aluno Reprovado");
}
}
		public static boolean cal(int a, int b, int c, int d) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        a = leitor.nextInt();
        System.out.println("Digite a segunda nota: ");
        b = leitor.nextInt();
        System.out.println("Digite a terceira nota: ");
        c = leitor.nextInt();
        System.out.println("Digite a quarta nota: ");
        d = leitor.nextInt();


        if((a+b+c+d) / 4 >= 7) {
        return true;
    }
    	else 
        return false;
}
}