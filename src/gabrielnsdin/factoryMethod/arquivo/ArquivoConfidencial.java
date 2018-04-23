package gabrielnsdin.factoryMethod.arquivo;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoConfidencial extends Arquivo{
	
	public void escreverArquivo() {
		try {
	    	String message = "Estas informações são confidenciais, o que significa que provavelmente só você sabe a senha.";
	    	String path = "src/gabrielnsdin/factoryMethod/arquivo/confidencial.txt";
	    	
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
