package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploSocketCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos la variable socket
		Socket sock = null;
		DataOutputStream out = null;
		DataInputStream din = null;
		// dout
		DataOutputStream don = null;
		Logger logFichero = (Logger) LoggerFactory.getLogger("FicheroSocket");

		// Intentamos conectarnos con el servidor remoto
		try {
			sock = new Socket("localhost", 12345);

			out = new DataOutputStream(sock.getOutputStream());

			sock.getOutputStream();

			din = new DataInputStream(sock.getInputStream());

			don = new DataOutputStream(sock.getOutputStream());

			out.writeUTF("Solicitando plataforma de aterrizaje");

			String msg = din.readUTF();
			System.out.println("Señor hemos recibido el mensaje de bienvenida");

			System.out.println("Señor, la plataforma asignada es " + din.readInt());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logFichero.error("ERROR: No se ha podido conectar con el servidor");
		}

		// Nos desconectamos
		try {
			sock.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
