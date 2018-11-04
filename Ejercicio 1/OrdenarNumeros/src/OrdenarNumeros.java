import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * 
 * @author Diego Castro Freijo
 *
 */

public class OrdenarNumeros {

	private static ArrayList<Integer> listaNumeros;

	public static void main(String[] args) {

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader fr = new BufferedReader(teclado);

		String entrada;
		boolean ordenar = false;
		listaNumeros = new ArrayList<>();

		System.out.println("Ponga numeros de forma aleatoria, una vez que deje un numero en blanco se procede a ordenar");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		//solicita los numeros a ordenar
		
		while (ordenar == false) {
			System.out.print("Ponga un numero:");
			try {
				entrada = fr.readLine();
				if (entrada.equals("")) {
					ordenar = true;
				} else {
					try {
						listaNumeros.add(Integer.parseInt(entrada));
					} catch (NumberFormatException e) {
						System.out.println("Por favor, ponga un numero entero");
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//ordena los numeros solicitados
		System.out.println("");
		System.out.println("Lista de numeros ordenados:");
		
		listaNumeros.sort(null);
		
		for (Integer num: listaNumeros) {
			System.out.println(num);
		}
		
		
	
		
		
		
		
		
		
		
		

	}

}
