package codes;

public class Task implements Runnable{
	//La clase Tarea incorpora el objeto dado para generar un numero aleatorio y contar el valor recibido en cada tirada
	private Die die;
	//Metodo generador de la clase Tarea
	public Task(Die die) {
		this.die = die;
	}
	//Metodo run que se obtiene de implementar la interfaz Runnable que contiene el codigo a ejecutar cuando se inicia cada hilo
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			die.getDieNumber();
		}
	}
}
