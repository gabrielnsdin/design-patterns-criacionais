package gabrielnsdin.factoryMethod.logger;

public class ContadorTest {
	
	public static void main(String[] args) {
		Contador contador = new Contador();
		contador.contar("arquivo");
		contador.contar("console");
	}

}
