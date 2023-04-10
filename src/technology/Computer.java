package technology;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Computer {

    private String brandName;

    private String productName;
    private String companyFoundedDate;
    private String deviceType;

    public Computer(String brandName, String productName, String companyFoundedDate, String deviceType) {
        this.brandName = brandName;
        this.productName = productName;
        this.companyFoundedDate = companyFoundedDate;
        this.deviceType = deviceType;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyFoundedDate() {
        return companyFoundedDate;
    }

    public void setCompanyFoundedDate(String companyFoundedDate) {
        this.companyFoundedDate = companyFoundedDate;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String toString() {
        return "Brand: " + this.brandName + "\nDate Company was Founded: " + this.companyFoundedDate + "\nProduct Name: " + this.productName + "\nDevice Type: " + this.deviceType;
    }



}
