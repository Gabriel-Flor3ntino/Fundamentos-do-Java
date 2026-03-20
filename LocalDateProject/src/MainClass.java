import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainClass {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		
		IO.println(dataAtual);
		IO.println(horaAtual);
		IO.println(dataHoraAtual);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		IO.println(dataAtual.format(format));
		
		String dataUsuario = "01/05/2025";
		LocalDate data = LocalDate.parse(dataUsuario, format);
		
		IO.println(data);
		DateTimeFormatter outroFormato = DateTimeFormatter.ofPattern("dd/mm/yy");
		IO.println(data.format(outroFormato));
	}
}
