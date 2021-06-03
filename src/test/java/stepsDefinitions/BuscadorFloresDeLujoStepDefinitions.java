package stepsDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.FloresDeLujoSteps;

public class BuscadorFloresDeLujoStepDefinitions {
	
	@Steps
	FloresDeLujoSteps floresSteps = new FloresDeLujoSteps();


	@Given("^que me encuentro en la pagina de Flores de Lujo con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeFloresDeLujoConLaUrlHttpsFloresdelujoComCo(String url) {
		SeleniumWebDriver.ChromeWebDriver(url);
	}
	
	@When("^busco el proudcto en el buscador$")
	public void buscoElProudctoEnElBuscador() {
		floresSteps.buscarProducto();
	}
	
	@Then("^podre ver el producto en pantalla$")
	public void podreVerElProductoEnPantalla() {
		SeleniumWebDriver.driver.quit();
	}
}
