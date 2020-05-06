package logic;

import pages.MainPage;

public class MainPageOperations {
    private String invoiceNumber;

    public MainPageOperations(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }

    public String getCompanyName() {
        return new MainPage(invoiceNumber).getCompanyNameElement().getText().trim();
    }

    public String getInvoiceAddress() {
        return new MainPage(invoiceNumber).getInvoiceAddressElement().getText().trim();
    }

    public String getGradeName() {
        return new MainPage(invoiceNumber).getGraceElement().getText().trim();
    }

    public String getWeight() {
        return new MainPage(invoiceNumber).getWeightElement().getText().trim();
    }

    public String getFlatChargeTotalAmount() {
        return new MainPage(invoiceNumber).getFlatChargeTotalElement().getText().trim();
    }

    public String getPerToneTotalAmount() {
        return new MainPage(invoiceNumber).getPerToneTotalElement().getText().trim();
    }

    public String getItemLineTotalAmount() {
        return new MainPage(invoiceNumber).getItemLineTotalElement().getText().trim();
    }
}
