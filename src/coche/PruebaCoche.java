package coche;

public class PruebaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Coche
		Coche FerrariF1_75 = new Coche(350, "Ferrari F1-75", "F1-75", "Ferrari", 150, "rojo", 220);
		Coche FerrariSF1000 = new Coche(229, "Ferrari SF1000", "SF1000", "Ferrari", 173, "azul", 300);
		Coche MercedesW13 = new Coche(350, "Mercedes W13", "W13", "Mercedes", 184, "verde", 320);

		// Campeonato
		Campeonato Capeonato2018 = new Campeonato("Mundial 2018", "F-1");
		Campeonato Capeonato2019 = new Campeonato("Mundial 2019", "F-1");
		Campeonato Capeonato2020 = new Campeonato("Mundial 2020", "F-1");

		// Circuito
		Circuito Jarama = new Circuito("Jarama", "España", "Madrid", 3850, 116, "Marc Gene");
		Circuito Montjuic = new Circuito("Montjuïc", "España ", "Barcelona", 3790, 113, "Pedro");
		Circuito Jerez = new Circuito("Jerez", "España ", "Jerez", 4423, 137, " Michael Schumacher");

		Capeonato2018.listaCircuitos[0] = Jarama;
		Capeonato2018.listaCircuitos[1] = Montjuic;
		Capeonato2018.listaCircuitos[2] = Jerez;

		// Piloto

		Piloto FernandoAlonso = new Piloto("Fernando Alonso", 40, 2, FerrariF1_75, 14, "Alpine", 40000);
		Piloto CarlosSainz = new Piloto("Carlos Sainz", 28, 0, FerrariSF1000, 55, "Ferrari", 35000);
		Piloto LewisHamilton = new Piloto("Lewis Hamilton", 37, 7, MercedesW13, 14, "Mercedes", 45000);

		Capeonato2018.pilotos[0] = FernandoAlonso;
		Capeonato2018.pilotos[1] = CarlosSainz;
		Capeonato2018.pilotos[2] = LewisHamilton;

		// Rueda
		Rueda Pirelli23H = new Rueda("Pirelli", 30, 25, "Duro", 89, 2.3f, 2300, 3);
		Rueda ContinentalZX4 = new Rueda("Continental", 28, 23, "Blando", 95, 2.34f, 2500, 1);
		Rueda PirelliF1XR = new Rueda("Pirelli", 32, 27, "Lluvia", 78, 2.234f, 2800, 2);

		// Ruedas de FerrariF1_75
		FerrariF1_75.listaRueda[Coche.DELANTERA_DERECHA] = Pirelli23H;
		FerrariF1_75.listaRueda[Coche.DELANTERA_IZQUIERDA] = Pirelli23H;
		FerrariF1_75.listaRueda[Coche.TRASERA_DERECHA] = Pirelli23H;
		FerrariF1_75.listaRueda[Coche.TRASERA_IZQUIERDA] = Pirelli23H;

		// Ruedas de FerrariSF1000
		FerrariSF1000.listaRueda[Coche.DELANTERA_DERECHA] = ContinentalZX4;
		FerrariSF1000.listaRueda[Coche.DELANTERA_IZQUIERDA] = ContinentalZX4;
		FerrariSF1000.listaRueda[Coche.TRASERA_DERECHA] = ContinentalZX4;
		FerrariSF1000.listaRueda[Coche.TRASERA_IZQUIERDA] = ContinentalZX4;

		// Ruedas de MercedesW13
		MercedesW13.listaRueda[Coche.DELANTERA_DERECHA] = PirelliF1XR;
		MercedesW13.listaRueda[Coche.DELANTERA_IZQUIERDA] = PirelliF1XR;
		MercedesW13.listaRueda[Coche.TRASERA_DERECHA] = PirelliF1XR;
		MercedesW13.listaRueda[Coche.TRASERA_IZQUIERDA] = PirelliF1XR;

		// Suspension
		Suspension Mikasa = new Suspension("Mikasa", 78.96f, 130, 65);
		Suspension Levi = new Suspension("Ackerman", 84.34f, 154, 73);
		Suspension Rengoku = new Suspension("Rengoku", 93.12f, 136, 67);

		// Ruedas de FerrariF1_75
		FerrariF1_75.listaSuspension[Coche.DELANTERA_DERECHA] = Mikasa;
		FerrariF1_75.listaSuspension[Coche.DELANTERA_IZQUIERDA] = Mikasa;
		FerrariF1_75.listaSuspension[Coche.TRASERA_DERECHA] = Mikasa;
		FerrariF1_75.listaSuspension[Coche.TRASERA_IZQUIERDA] = Mikasa;
		// Ruedas de FerrariSF1000
		FerrariSF1000.listaSuspension[Coche.DELANTERA_DERECHA] = Rengoku;
		FerrariSF1000.listaSuspension[Coche.DELANTERA_IZQUIERDA] = Rengoku;
		FerrariSF1000.listaSuspension[Coche.TRASERA_DERECHA] = Rengoku;
		FerrariSF1000.listaSuspension[Coche.TRASERA_IZQUIERDA] = Rengoku;

		// Ruedas de MercedesW13
		MercedesW13.listaSuspension[Coche.DELANTERA_DERECHA] = Levi;
		MercedesW13.listaSuspension[Coche.DELANTERA_IZQUIERDA] = Levi;
		MercedesW13.listaSuspension[Coche.TRASERA_DERECHA] = Levi;
		MercedesW13.listaSuspension[Coche.TRASERA_IZQUIERDA] = Levi;

		/******************** FUNCIONES DE CLASE COCHE ********************/

		// Funcion acelerar
		System.out.println(FerrariF1_75.acelerar(60, 120));

		// Funcion Pintar
		System.out.println(FerrariF1_75.pintar(Coche.NEGRO));
		;

		// Funcion cambiarRueda
		System.out.println((FerrariF1_75.cambiarRueda(1, PirelliF1XR)));

		// Funcion cambiarSuspension
		System.out.println(FerrariF1_75.cambiarSuspension(3, Rengoku));

		// Funcion ajustarPresion
		System.out.println(FerrariF1_75.ajustarPresion(1, 150));

		/******************** FUNCIONES DE CLASE CAMPEONATO ********************/

		// Funcion circuito mas largo
		System.out.println(Capeonato2018.circuitoMasLargo().getNombre());

		// Funcion de mostrar escuderia
		Capeonato2018.mostrarEscuderia("Ferrari");

		// Funcion de comprobar coches
		Capeonato2018.coprobarCoches();

		/******************** FUNCIONES DE CLASE CIRCUITO ********************/

		System.out.println(Jerez.vueltaRapida("Fernando Alonso", 136));
	}
}
