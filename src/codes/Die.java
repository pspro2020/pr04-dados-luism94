package codes;

import java.util.Random;

public class Die {
	//Contador de cada numero del dado para cada tirada
	private int oneCounter = 0, twoCounter = 0, threeCounter = 0, fourCounter = 0, fiveCounter = 0, sixCounter = 0;
	
	public void getDieNumber() {
		//Se obtiene un numero aleatorio entre 1 y 6 ambos incluidos
		//El numero que se obtenga se suma al contador respectivo
		Random rnd = new Random();
		int n = rnd.nextInt(6) + 1;
		/* Con un bloque switch se incrementa el contador dependiendo del numero que se obtenga.
		** Se introduce en un bloque synchronized para que se pueda incrementar el valor de cada variable
		** sin temor a que otro hilo pueda acceder al mismo bloque mientras otro intenta modificar los contadores.
		** Recive el mismo objeto Dado porque es la propia clase la que se encarga de incrementar
		** los contadores en cada tirada.
		*/
		synchronized (this) {
			switch (n) {
			case 1:
				oneCounter++;
				break;
			case 2:
				twoCounter++;
				break;
			case 3:
				threeCounter++;
				break;
			case 4:
				fourCounter++;
				break;
			case 5:
				fiveCounter++;
				break;
			case 6:
				sixCounter++;
				break;
			default:
				throw new IllegalArgumentException("No puede ser carajo");
			}
		}
	}

	//Metodos get para obtener el valor de cada contador
	public int getCounter1() {
		return oneCounter;
	}

	public int getCounter2() {
		return twoCounter;
	}
	
	public int getCounter3() {
		return threeCounter;
	}
	
	public int getCounter4() {
		return fourCounter;
	}
	
	public int getCounter5() {
		return fiveCounter;
	}
	
	public int getCounter6() {
		return sixCounter;
	}
}
