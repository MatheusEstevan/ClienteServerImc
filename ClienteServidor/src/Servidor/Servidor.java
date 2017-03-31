package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int porta = 9999;
		ServerSocket servidor = new ServerSocket(porta);
		while(true){
			
			Socket socket = servidor.accept();
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			double peso = in.readDouble();
			double altura = in.readDouble();
		
			out.writeDouble(retornarImc(altura, peso));
			
			
		}
		
		
	}
	
	public static double retornarImc(double altura, double peso){
		return peso/(altura*altura);
		
	}
}
