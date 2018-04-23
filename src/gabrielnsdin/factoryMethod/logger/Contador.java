package gabrielnsdin.factoryMethod.logger;

public class Contador {
	
	public void contar(String tipo) {
		Log log = getLogger(tipo);
		int[] n = new int[11];
		
		for(int i=0; i < 11; i++) {
			n[i] = i;
		}
		
		log.print(n);
	}
	
	public Log getLogger(String tipo) {
		if(tipo.equals("console")) {
			return new ConsoleLog();
		}else if(tipo.equals("arquivo")) {
			return new FileLog();
		}
		return null;
	}
}
