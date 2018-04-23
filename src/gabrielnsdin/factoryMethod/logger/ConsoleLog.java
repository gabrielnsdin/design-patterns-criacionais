package gabrielnsdin.factoryMethod.logger;

public class ConsoleLog extends Log{
	
	public void print(int[] mensagens){
		for(int m: mensagens) {
			System.out.println(m);
		}
	}
}
