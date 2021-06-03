package pages;

import org.openqa.selenium.By;

public class FloresDeLujoPage {
	
	private static By txtBuscador = By.xpath("//input[@id=\"dgwt-wcas-search-input-2f60\"]");
	private static By btnBuscador = By.xpath("//div[@class='dgwt-wcas-sf-wrapp']//button[@class='dgwt-wcas-search-submit']");
	private static By btnProducto;
	private static By lblProducto;
	
	public static By getBtnProducto() {
		return btnProducto;
	}
	
	public static void setBtnProducto(String producto) {
		FloresDeLujoPage.btnProducto = By.xpath("//span[@class=\"et_shop_image\"]//ancestor::a");;
	}
	
	public static By getLblProducto() {
		return lblProducto;
	}
	
	public static void setLblProducto(String producto) {
		FloresDeLujoPage.lblProducto = By.xpath("//h2[@class=\"woocommerce-loop-product__title\"]");
	}
	
	public static By getTxtBuscador() {
		return txtBuscador;
	}
	
	public static By getBtnBuscador() {
		return btnBuscador;
	}	
}
