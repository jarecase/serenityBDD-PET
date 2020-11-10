package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookDetallePage {
	public static final Target FOTO_DETALLE = Target.the("Foto del detalle del animal").located(By.xpath("//ng-component//div[@class='img-container']"));
}
