import java.awt.image.ImageProducer;
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

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		Integer numero;
		ArrayList<Integer> arrayList = new ArrayList<>();

		String entrada = null;

		try {
			while (!(entrada = bufferedReader.readLine()).equals("")) {//cuando la entrada es igual a "" entonces pasamos de while y ordenamos la lista
				try {
					numero = Integer.parseInt(entrada);//Pasamos un Strin a entero y si da error por que no es un numero lanzamos un mensaje
					arrayList.add(numero);
				} catch (NumberFormatException e) {
					System.out.println("El numero a de ser entero");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		arrayList.sort(null);//ordenamos el arraylist
		for (Integer num : arrayList) {
			System.out.println(num);//Listamos el arraylist
		}
		

		
	}

}
