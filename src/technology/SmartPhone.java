package technology;

public class SmartPhone extends Computer {
    private String typeOfService;


    public SmartPhone(String brandName, String companyFoundedDate, String deviceType, String productName, String typeOfService) {
        super(brandName, companyFoundedDate, deviceType, productName);
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType of Cell Service: " + this.typeOfService;
    }
}

