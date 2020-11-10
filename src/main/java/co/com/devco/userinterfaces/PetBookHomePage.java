package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";
	public static final Target RESULTADO_FILTRO = Target.the("Primer resultado de la lista de resultados").located(By.xpath("//app-imagegallery//ul/li"));
	public static final Target RESULTADO = Target.the("Primer resultado de la lista de resultados").located(By.xpath("//app-imagegallery//ul/li/a"));
	public static Target RetornarBotonFiltro(String nombreBoton){
		return Target.the("Boton de filtro").located(By.xpath("//app-imagegallery//button[text()='"+nombreBoton+"']"));
	}
}
