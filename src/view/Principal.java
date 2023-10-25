package view;

import java.io.IOException;

import controller.FeiraControle;

public class Principal {

	public static void main(String[] args) {
		FeiraControle f = new FeiraControle();
		String path = "C:\\TEMP\\generic_food.csv";
		try {
			f.readFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
