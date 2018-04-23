package gabrielnsdin.factoryMethod.logger;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLog extends Log{
	
	public void print(int[] mensagens){
		try {
	    	String path = "src/gabrielnsdin/factoryMethod/logger/log.txt";
	    	
	    	File file = new File(path);
	    	FileWriter fileWriter = new FileWriter(file);
	    			
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
	    	
	    	for(int m: mensagens) {
	    		writer.write(String.valueOf(m));
	    		writer.newLine();
	    	}
			writer.close();
			
			Desktop.getDesktop().edit(file);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
