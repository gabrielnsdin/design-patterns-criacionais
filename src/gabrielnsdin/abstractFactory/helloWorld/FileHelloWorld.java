package gabrielnsdin.abstractFactory.helloWorld;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelloWorld implements HelloWorld{

	@Override
	public void print() {
	    try {
	    	String message = "Hello World";
	    	String path = "src/gabrielnsdin/abstractFactory/helloWorld/output.txt";
	    	
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
