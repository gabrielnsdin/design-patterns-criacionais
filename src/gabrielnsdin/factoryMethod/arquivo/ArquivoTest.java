package gabrielnsdin.factoryMethod.arquivo;

public class ArquivoTest {
	
	public static void main(String[] args) {
		Writer writer = new Writer();
		writer.escreverArquivo("publico");
		writer.escreverArquivo("confidencial");
	}
}
