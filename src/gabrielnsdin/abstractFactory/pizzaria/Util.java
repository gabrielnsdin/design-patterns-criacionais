package gabrielnsdin.abstractFactory.pizzaria;

import java.time.LocalDate;

public class Util {
	
	public static String getDay(String data) {
		String[] datas = data.split("/");
		int dia = Integer.parseInt(datas[0]);
		int mes = Integer.parseInt(datas[1]);
		int ano = Integer.parseInt(datas[2]);
		
	    return LocalDate.of(ano, mes, dia).getDayOfWeek().toString();
	}
}
