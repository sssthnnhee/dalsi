package com.example.project2;

public class DataClass {
    private String dataCafe;
    private String dataName;
    private String dataPrice;
    private String dataImage;

    public String getDataCafe() {
        return dataCafe;
    }

    public String getDataName() {
        return dataName;
    }

    public String getDataPrice() {
        return dataPrice;
    }

    public String getDataImage() {
        return dataImage;
    }

    public DataClass(String dataCafe, String dataName, String dataPrice, String dataImage) {
        this.dataCafe = dataCafe;
        this.dataName = dataName;
        this.dataPrice = dataPrice;
        this.dataImage = dataImage;
    }
}
