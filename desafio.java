package FuncaoProcedimentoMetodo;
	import java.util.Scanner;
		public class desafio{
			public static void main(String[]Args) {
			
	int repeticao = 0;
    int linha, coluna;
    Scanner leitor = new Scanner (System.in);

    System.out.print("Movimentacao de uma torre no xadrez\n");
    System.out.print("Digite o numero da linha: ");
    linha = leitor.nextInt();
    System.out.print("Digite o numero da coluna: ");
    coluna = leitor.nextInt();

    if (linha==1 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}

    if (linha== 1 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 1 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha==1 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha==1 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha==1 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha==1 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha==1 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   x   x   x   x   x   x   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 2 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}
    
    if (linha== 2 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 2 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 2 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 2 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 2 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha== 2 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha== 2 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|x   x   x   x   x   x   x   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 3 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}
    
    if (linha== 3 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |------------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   x   x   x   x   x   x");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 3 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 3 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 3 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 3 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}

    if (linha== 3 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}		
    
    if (linha== 3 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|x   x   x   x   x   x   x   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
				
    if (linha== 4 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}	
    
    if (linha== 4 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 4 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 4 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 4 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 4 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha== 4 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha== 4 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|x   x   x   x   x   x   x   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 5 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}
    
    if (linha== 5 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 5 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 5 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 5 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 5 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha== 5 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha== 5 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|x   x   x   x   x   x   x   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 6 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   -   -   -   -   -   -   -");}
    
    if (linha== 6 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 6 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 6 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 6 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 6 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha== 6 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha== 6 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|x   x   x   x   x   x   x   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 7 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|x   -   -   -   -   -   -   -");}
    
    if (linha== 7 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   x   -   -   -   -   -   -");}
    
    if (linha== 7 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   x   -   -   -   -   -");}
    
    if (linha== 7 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   -   x   -   -   -   -");}
    
    if (linha== 7 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   -   -   x   -   -   -");}
    
    if (linha== 7 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   -   -   -   x   -   -");}
    
    if (linha== 7 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   -   -   -   -   x   -");}
    
    if (linha== 7 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|x   x   x   x   x   x   x   x");
        System.out.println("  8|-   -   -   -   -   -   -   x");}
    
    if (linha== 8 && coluna==1) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|x   -   -   -   -   -   -   -");
        System.out.println("  2|x   -   -   -   -   -   -   -");
        System.out.println("  3|x   -   -   -   -   -   -   -");
        System.out.println("  4|x   -   -   -   -   -   -   -");
        System.out.println("  5|x   -   -   -   -   -   -   -");
        System.out.println("  6|x   -   -   -   -   -   -   -");
        System.out.println("  7|x   -   -   -   -   -   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==2) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   x   -   -   -   -   -   -");
        System.out.println("  2|-   x   -   -   -   -   -   -");
        System.out.println("  3|-   x   -   -   -   -   -   -");
        System.out.println("  4|-   x   -   -   -   -   -   -");
        System.out.println("  5|-   x   -   -   -   -   -   -");
        System.out.println("  6|-   x   -   -   -   -   -   -");
        System.out.println("  7|-   x   -   -   -   -   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==3) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   x   -   -   -   -   -");
        System.out.println("  2|-   -   x   -   -   -   -   -");
        System.out.println("  3|-   -   x   -   -   -   -   -");
        System.out.println("  4|-   -   x   -   -   -   -   -");
        System.out.println("  5|-   -   x   -   -   -   -   -");
        System.out.println("  6|-   -   x   -   -   -   -   -");
        System.out.println("  7|-   -   x   -   -   -   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}

    if (linha== 8 && coluna==4) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   x   -   -   -   -");
        System.out.println("  2|-   -   -   x   -   -   -   -");
        System.out.println("  3|-   -   -   x   -   -   -   -");
        System.out.println("  4|-   -   -   x   -   -   -   -");
        System.out.println("  5|-   -   -   x   -   -   -   -");
        System.out.println("  6|-   -   -   x   -   -   -   -");
        System.out.println("  7|-   -   -   x   -   -   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==5) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   x   -   -   -");
        System.out.println("  2|-   -   -   -   x   -   -   -");
        System.out.println("  3|-   -   -   -   x   -   -   -");
        System.out.println("  4|-   -   -   -   x   -   -   -");
        System.out.println("  5|-   -   -   -   x   -   -   -");
        System.out.println("  6|-   -   -   -   x   -   -   -");
        System.out.println("  7|-   -   -   -   x   -   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==6) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   x   -   -");
        System.out.println("  2|-   -   -   -   -   x   -   -");
        System.out.println("  3|-   -   -   -   -   x   -   -");
        System.out.println("  4|-   -   -   -   -   x   -   -");
        System.out.println("  5|-   -   -   -   -   x   -   -");
        System.out.println("  6|-   -   -   -   -   x   -   -");
        System.out.println("  7|-   -   -   -   -   x   -   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==7) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   x   -");
        System.out.println("  2|-   -   -   -   -   -   x   -");
        System.out.println("  3|-   -   -   -   -   -   x   -");
        System.out.println("  4|-   -   -   -   -   -   x   -");
        System.out.println("  5|-   -   -   -   -   -   x   -");
        System.out.println("  6|-   -   -   -   -   -   x   -");
        System.out.println("  7|-   -   -   -   -   -   x   -");
        System.out.println("  8|x   x   x   x   x   x   x   x");}
    
    if (linha== 8 && coluna==8) {
        System.out.println("    1   2   3   4   5   6   7   8    ");
        System.out.println("   |-----------------------------");
        System.out.println("  1|-   -   -   -   -   -   -   x");
        System.out.println("  2|-   -   -   -   -   -   -   x");
        System.out.println("  3|-   -   -   -   -   -   -   x");
        System.out.println("  4|-   -   -   -   -   -   -   x");
        System.out.println("  5|-   -   -   -   -   -   -   x");
        System.out.println("  6|-   -   -   -   -   -   -   x");
        System.out.println("  7|-   -   -   -   -   -   -   x");
        System.out.println("  8|x   x   x   x   x   x   x   x");}

    
}
}

