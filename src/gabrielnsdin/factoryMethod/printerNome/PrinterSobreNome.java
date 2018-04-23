package gabrielnsdin.factoryMethod.printerNome;

public class PrinterSobreNome extends Printer{

	@Override
	protected Nome getFormatador() {
		return new SobreNome();
	}

}
