package tema4;

public class PruebasFicheroCoches {

	public static void main(String[] args) {
		String destino = "c:\\logs\\guardarCoches.txt";
		Coche2 arrayCoches[] = new Coche2[100];

		// Creamos un array de 100 coches aleatorios

		for (int i = 0; i < 100; i++) {
			int velocidad = 300 + (int) (Math.random() * 150);
			int peso = 730 + (int) (Math.random() * 100);
			int potencia = 800 + (int) (Math.random() * 300);
			int colorAzar = (int) (Math.random() * 5);
			String color = "";
			switch (colorAzar) {
			case 1: {
				color = Coche2.ROJO;
				break;
			}
			case 2: {
				color = Coche2.AMARILLO;
				break;
			}
			case 3: {
				color = Coche2.AZUL;
				break;
			}
			case 4: {
				color = Coche2.VERDE;
				break;
			}
			case 5: {
				color = Coche2.NEGRO;
				break;
			}
			default:
				color = Coche2.NEGRO;
			}

			arrayCoches[i] = new Coche2(potencia, "Juan", "F1-75", "Ferrari", peso, color, velocidad);
		}
		System.out.println(Coche2.guardarCoches(arrayCoches, destino));
		System.out.println("El archivo " + destino + " tiene " + Coche2.contarLineas(destino) + " lineas");
		System.out.println((Coche2.cargarCoches(destino)));

	}

}
