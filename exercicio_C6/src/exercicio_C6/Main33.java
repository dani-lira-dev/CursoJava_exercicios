/**
 * 
 */
package exercicio_C6;

import java.util.Scanner;

/**
 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, 
 *come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme 
 *exemplo
 *
 * @author Dani Lira
 *
 */

public class Main33 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
					
						
			for (int i=1; i<=n; i++) {
					
				int primeiro = i;
				
				int segundo = i;
				
				int terceiro = i;
				
				System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
				
			}			
			
			sc.close();
		
		}

	}

