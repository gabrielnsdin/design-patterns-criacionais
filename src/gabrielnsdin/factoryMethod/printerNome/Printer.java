package gabrielnsdin.factoryMethod.printerNome;

public abstract class Printer {
	
	public void print(String name){
		Nome nome = getFormatador();
		String mensagem = nome.formatar(name);
		System.out.println(mensagem);
	}
	
	protected abstract Nome getFormatador();
}
