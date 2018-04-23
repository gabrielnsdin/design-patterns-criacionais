package gabrielnsdin.factoryMethod.printerNome;

public class PrinterNome extends Printer{

	@Override
	protected Nome getFormatador() {
		return new PrimeiroNome();
	}

}
