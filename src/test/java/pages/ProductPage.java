package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    public String product_page_title = "Swag Labs";
    public String product_page_url = "https://www.saucedemo.com/inventory.html";
    public By back_pack_add_to_cart_btn = By.id("add-to-cart-sauce-labs-backpack");
    public By bike_light_add_to_cart_btn = By.id("add-to-cart-sauce-labs-bike-light");
    public By cart_icon = By.className("shopping_cart_link");


}
