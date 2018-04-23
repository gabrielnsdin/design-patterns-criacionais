package gabrielnsdin.factoryMethod.printerNome;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new PrinterNome();
		printer.print("McNealy, Scott");
		
		printer = new PrinterSobreNome();
		printer.print("Scott McNealy");
	}
}
