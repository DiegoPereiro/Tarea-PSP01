import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Random;

public class Lenguaje {

	public static void main(String[] args) {	
		
//		Integer cantidadGrupos =40;
//		String rutaFichero =  "F:\\Documentos\\Ciclo DAM\\Segundo curso\\Programacion de Servicios e Procesos\\UD01\\Tarea 1\\Ejercicio 2\\prueva.txt";
//		
		Integer cantidadGrupos =Integer.parseInt(args[0]);
		String rutaFichero =  args[1];
				
		
		

		Random Letras = new Random();
		FileLock bloqueo;

		try {
			File fichero = new File(rutaFichero);
			RandomAccessFile randomAccessFile = new RandomAccessFile(fichero, "rwd"); // crear el acceso al fichero
			bloqueo = randomAccessFile.getChannel().lock();//bloquamos el acceso al fichero		

			String grupo = "";
			for (int i = 0; i <cantidadGrupos; i++) {//este bucle se repetira tantas veces como venga especificado por el usuario
				
				for (int j = 0; j <Letras.nextInt(20)+5; j++) { //repetimos entre 5 y 25 para generar el grupo de letras				
					grupo=grupo+(char)(Letras.nextInt(26)+97);//generamos numeros aleatorios entre 97 y 122 para cuando las pasemos a char sean las letras minusculas
				}	
				randomAccessFile.seek(randomAccessFile.length());//Nos situa al final del fichero	
				randomAccessFile.writeBytes(grupo+"\n");	//escribimos los grupos en el fichero						
				grupo="";				
			}			
//			randomAccessFile.seek(0); //Nos situa al principio del fichero
			bloqueo.release();//Libera el bloqueo


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}

}
