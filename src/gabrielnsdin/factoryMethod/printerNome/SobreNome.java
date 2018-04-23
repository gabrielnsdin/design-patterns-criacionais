package gabrielnsdin.factoryMethod.printerNome;

public class SobreNome implements Nome{

	@Override
	public String formatar(String nome) {
		String[] nomes = nome.split(" ");
		String msg = "";
		
		for(int i = 0; i < nomes.length; i++) {
			msg += nomes[i];
			
			if(i != nomes.length - 1) {
				msg += ", ";
			}else {
				msg += ".";
			}
			
		}
		
		return msg;
	}

}
