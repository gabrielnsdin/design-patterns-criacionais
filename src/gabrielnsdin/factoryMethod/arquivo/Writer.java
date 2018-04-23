package gabrielnsdin.factoryMethod.arquivo;

public class Writer {
	
	public void escreverArquivo(String tipo) {
		Arquivo arquivo = getArquivo(tipo);
		arquivo.escreverArquivo();
	}
	
	public Arquivo getArquivo(String tipo) {
		if(tipo.equals("publico")) {
			return new ArquivoPublico();
		}else if(tipo.equals("confidencial")) {
			return new ArquivoConfidencial();
		}
		return null;
	}
}
