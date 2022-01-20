package desafios;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int H = leitor.nextInt();
		int L = leitor.nextInt();
		
		int[] cama = {A,B,C};
		int[] porta = {H,L};
		
		Arrays.sort(cama);
		Arrays.sort(porta);
		
		System.out.println(((cama[1] <= porta[1]) && (cama[0] <= porta[0])) ? "S":"N");
    }
	
	/*
	João está comprando móveis novos para sua casa. Agora é a vez de comprar um colchão novo, de molas, para substituir o colchão velho. 
	As portas de sua casa têm altura H e largura L e existe um colchão que está em promoção com dimensões A × B × C.

	O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo através de uma porta com uma de suas faces paralelas ao chão, 
	mas consegue virar e rotacionar o colchão antes de passar pela porta.
	
	Entretanto, de nada adianta ele comprar o colchão se ele não passar através das portas de sua casa. 
	Portanto ele quer saber se consegue passar o colchão pelas portas e para isso precisa de sua ajuda.
	
	Entrada
	A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300), as três dimensões do colchão, em centímetros. 
	A segunda linha contém dois inteiros H e L (1 ≤ H, L ≤ 250), respectivamente a altura e a largura das portas em centímetros.
	
	Saída
	Se programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão passa pelas portas e apenas a letra ‘N’ em caso contrário.
	 */
}
