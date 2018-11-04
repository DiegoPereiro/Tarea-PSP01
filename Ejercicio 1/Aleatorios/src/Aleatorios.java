import java.util.Random;

public class Aleatorios {
	
	public static void main(String[] args) {
		
		
		Random aleatorio=new Random();		
		for (int i = 0; i < 40; i++) {		//40 numeros aleatorios con la clase Random
			System.out.println(aleatorio.nextInt(100));		
		}
		System.out.println("");		
		
	}

}
