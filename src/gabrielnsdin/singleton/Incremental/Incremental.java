package gabrielnsdin.singleton.Incremental;

public class Incremental {
	
	private static int count = 0;
	private static int numero;
	private static Incremental incremental;
	
	private Incremental() {
		
	}

	public String toString() {
		return "Incremental " + numero;
	}
	
	public static Incremental getInstance() {
		
		if(incremental == null) {
			incremental =  new Incremental();
		}
		numero = ++count;
		
		return incremental; 
	}
}
