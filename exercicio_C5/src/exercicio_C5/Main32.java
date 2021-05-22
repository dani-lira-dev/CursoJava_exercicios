/**
 * 
 */
package exercicio_C5;

import java.util.Scanner;

/**
 * Ler um n�mero inteiro N e calcular todos os seus divisores
 * 
 * @author Dani Lira
 *
 */
public class Main32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				
				System.out.println(i);
			}
		
		}

		sc.close();

	}

}
	