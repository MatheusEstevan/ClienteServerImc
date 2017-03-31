package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Socket cliente = new Socket("10.96.26.60",3333);
		
			DataInputStream in = new DataInputStream(cliente.getInputStream());
			DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
			out.writeDouble(85);
			out.writeDouble(1.75);
			
			double imc = in.readDouble();
			System.out.println(imc);
			
		
		
		
	}

}
