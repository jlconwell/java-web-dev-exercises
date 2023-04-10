package technology;

public class Laptop extends Computer {

    private String systemDesignedFor;
    public Laptop(String brandName, String productName,  String deviceType, String companyFoundedDate, String systemDesignedFor) {
        super(brandName, productName, deviceType, companyFoundedDate);
        this.systemDesignedFor = systemDesignedFor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


