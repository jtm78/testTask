package pages;

import org.openqa.selenium.WebElement;
import selenium.SeleniumMethods;

public class MainPage {
    private String invoiceNumber;
    private String baseLocator = "//td[text()='%s']";
    private String companyNameLocator = ".//preceding::tbody[1]/tr/td[5]";
    private String invoiceAddressLocator = ".//preceding::tbody[1]/tr/td[6]";
    private String graceLocator = ".//ancestor::tbody//following-sibling::tbody[1]//td[@colspan='7']";
    private String weigthLocator = ".//ancestor::tbody//following-sibling::tbody[1]//td[@class='car']";
    private String flatChargeTotalLocator = ".//ancestor::tbody//following-sibling::tbody[2]//td[8]";
    private String perToneTotalLocator = ".//ancestor::tbody//following-sibling::tbody[3]//td[8]";
    private String itemLineTotalLocator = ".//ancestor::tbody//following-sibling::tbody[5]//td[8]";

    public MainPage(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public WebElement getCompanyNameElement() {
        return SeleniumMethods.findElement(baseLocator, companyNameLocator, invoiceNumber);
    }

    public WebElement getInvoiceAddressElement() {
        return SeleniumMethods.findElement(baseLocator, invoiceAddressLocator, invoiceNumber);
    }

    public WebElement getGraceElement() {
        return SeleniumMethods.findElement(baseLocator, graceLocator, invoiceNumber);
    }

    public WebElement getWeightElement() {
        return SeleniumMethods.findElement(baseLocator, weigthLocator, invoiceNumber);
    }

    public WebElement getFlatChargeTotalElement() {
        return SeleniumMethods.findElement(baseLocator, flatChargeTotalLocator, invoiceNumber);
    }

    public WebElement getPerToneTotalElement() {
        return SeleniumMethods.findElement(baseLocator, perToneTotalLocator, invoiceNumber);
    }

    public WebElement getItemLineTotalElement() {
        return SeleniumMethods.findElement(baseLocator, itemLineTotalLocator, invoiceNumber);
    }


}
