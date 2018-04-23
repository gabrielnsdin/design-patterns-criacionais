package gabrielnsdin.factoryMethod.arquivo;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Arquivo {
	
	void escreverArquivo() {
		try {
	    	String message = "Arquivo";
	    	String path = "src/gabrielnsdin/abstractFactory/arquivo/arquivo.txt";
	    	
	    	File file = new File(path);
	    	FileWriter fileWriter = new FileWriter(file);
	    			
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write(message);
			writer.close();
			
			Desktop.getDesktop().edit(file);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
