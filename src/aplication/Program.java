package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Digite um numero de funcionarios: ");
			int n = sc.nextInt();
			int[] listaFuncionarios = new int [n];
			
			for (int i=0;i<n;i++) {
				System.out.println("Entre com os dados do funcionario #" + (i+1));
			}
		}
		catch(Exception e) {
			
		}
		
	}

}
