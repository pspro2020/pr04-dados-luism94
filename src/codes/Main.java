package codes;

public class Main {

	public static void main(String[] args) {
		//Creo el dado y los tres hilos con el mismo dado
		Die die = new Die();
		Thread t1 = new Thread(new Task(die));
		Thread t2 = new Thread(new Task(die));
		Thread t3 = new Thread(new Task(die));
		//Inicio los hilos
		t1.start();
		t2.start();
		t3.start();
		//Espero a que cada hilo secundario termine y muestro el resultado
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			//En caso de error se muestra un mensaje
			System.out.println("Error - Uno de los hilos ya estaba interrumpido");
		}
		//Muestro los resultados de los contadores
		System.out.println("Numero 1: " + die.getCounter1() + " veces");
		System.out.println("Numero 2: " + die.getCounter2() + " veces");
		System.out.println("Numero 3: " + die.getCounter3() + " veces");
		System.out.println("Numero 4: " + die.getCounter4() + " veces");
		System.out.println("Numero 5: " + die.getCounter5() + " veces");
		System.out.println("Numero 6: " + die.getCounter6() + " veces");
		System.out.printf("Total: %d + %d + %d + %d + %d + %d = %d veces", die.getCounter1(), die.getCounter2(), die.getCounter3(), die.getCounter4(), die.getCounter5(), die.getCounter6(), die.getCounter1() + die.getCounter2() + die.getCounter3() + die.getCounter4() + die.getCounter5() + die.getCounter6());
	}

}
