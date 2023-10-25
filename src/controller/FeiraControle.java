package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeiraControle {

	public FeiraControle() {
		super();
	}
	
	public void readFile(String path) throws IOException {
		File arq = new File(path);
		if (arq.exists()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while (linha!=null) {
				String[] frutas = linha.split(",");
				if (frutas[2].equals("Fruits")) {
					System.out.printf("%-30s %-50s %s %n", frutas[0], frutas[1], frutas[3]);
				}
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		}
		else {
			throw new IOException("Arquivo inválido");
		}
	}

}
