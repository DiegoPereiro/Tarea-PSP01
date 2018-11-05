import java.io.IOException;

public class Colaborar {

	public static void main(String[] args) {

		String nombreFichero = args[1];
		int numInstancias = Integer.parseInt(args[0]);


		for (int i = 1; i <= numInstancias; i++) { //lanza tantas instancias como quiera el usuario
			try {
				int lineas = i  * 10; //Vamos aumentando el numero de lineas de 10 en 10
				Runtime.getRuntime().exec("java -jar lenguaje.jar " + lineas + " " + nombreFichero); //ejecutamos la instancia
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
