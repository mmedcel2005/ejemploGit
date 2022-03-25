package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		Scanner teclado = new Scanner(System.in);
		int consumo;
		int calibre;
		String finalidad;
		double importeConsumo;
		double cuotaServicio = 0;
		double cuotaContratacion = 0;

		// Leemos por teclado el consumo del ultimo mes
		System.out.print("Introduce el consumo de agua del último mes: ");
		consumo = teclado.nextInt();

		// Leemos por teclado el calibre contratado
		System.out.print("Introduce el calibre contratado: ");
		calibre = teclado.nextInt();

		// Leemos por teclado el uso del agua
		System.out.print("Indica el uso del agua (doméstico, industrial, centros, bonificado): ");
		finalidad = teclado.next();

		switch (calibre) {
		case 20:
			// Si el calibre es 20 la cuota de servicio sera 6.9452
			cuotaServicio = 6.9452;
			// Si el uso es Industrial la cuota de contratacion sera 90.52
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 90.52;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 67.75
				cuotaContratacion = 67.75;
			}
			// Saldra del switch
			break;
		case 25:
			// Si el calibre es 25 la cuota de servicio sera 10.8536
			cuotaServicio = 10.8536;
			// Si la finalidad es Industrial la cuota de contratacion sera 108.62
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 108.62;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 85.86
				cuotaContratacion = 85.86;
			}
			// Saldra del switch
			break;
		case 30:
			// Si el calibre es 30 la cuota de servicio sera 15.6315
			cuotaServicio = 15.6315;
			// Si la finalidad es Industrial la cuota de contratacion sera 126.73
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 126.73;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 103.95
				cuotaContratacion = 103.95;
			}
			// Saldra del switch
			break;
		case 40:
			// Si el calibre es 40 la cuota de servicio sera 27.7970
			cuotaServicio = 27.7970;
			// Si la finalidad es Industrial la cuota de contratacion sera 162.93
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 162.93;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 140.16
				cuotaContratacion = 140.16;
			}
			// Saldra del switch
			break;
		case 50:
			// Si el calibre es 50 la cuota de servicio sera 43.4285
			cuotaServicio = 43.4285;
			// Si la finalidad es Industrial la cuota de contratacion sera 199.14
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 199.14;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 179.83
				cuotaContratacion = 179.83;
			}
			// Saldra del switch
			break;
		case 65:
			// Si el calibre es 65 la cuota de servicio sera 73.2434
			cuotaServicio = 73.2434;
			// Si la finalidad es Industrial la cuota de contratacion sera 253.45
			if (finalidad.toUpperCase().equals("INDUSTRIAL")) {
				cuotaContratacion = 253.45;
			} else {
				// Si el uso NO es Industrial la cuota de contratacion sera 233.92
				cuotaContratacion = 233.92;
			}
			// Saldra del switch
			break;
		// Si no se cumple ninguna de las condiciones anteriores el calibre introducido
		// no es valido
		default:
			System.out.println("Introduce un calibre válido.");
			// Saldra del switch
			break;
		}

		// Calculamos la factura ahora según el uso del agua:

		if (finalidad.toUpperCase().equals("DOMÉSTICO") == true) {
			// En caso de que la finalidad sea domestica se comprueba si el consumo es menor
			// o igual de 18
			if (consumo <= 18) {
				// Se realiza el calculo del importe por consumo del agua
				importeConsumo = consumo * 0.2902;
				// Se informa de a factura del agua siendo esta la suma del importe del consumo
				// + cuota de contratacion + cuota de servicio
				System.out.println("Factura del agua: " + (importeConsumo + cuotaContratacion + cuotaServicio) + "€");
			} else {
				// Si el consumo es mayor de 18
				// Se realiza el calculo del importe por consumo del agua
				importeConsumo = consumo * 0.5826;
				System.out.println("Factura del agua: " + (importeConsumo + cuotaContratacion + cuotaServicio) + "€");
			}

		}
		if (finalidad.toUpperCase().equals("CENTROS") == true || finalidad.toUpperCase().equals("BONIFICADO") == true
				|| finalidad.toUpperCase().equals("INDUSTRIAL")) {
			System.out.println("Factura del agua: " + (cuotaContratacion + cuotaServicio) + "€");
		}

		teclado.close();

	}

}
