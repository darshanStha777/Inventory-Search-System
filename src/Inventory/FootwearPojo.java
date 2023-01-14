package Inventory;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alish
 */
public class FootwearPojo {
    private String model_Num;
    private String mName;
    private int price;
    private String category;
    private String brand;
    private String size;
    private String quantity;

    public FootwearPojo(String model_Num, String mName, int price, String category, 
            String brand, String size, String quantity) {
        this.model_Num = model_Num;
        this.mName = mName;
        this.price = price;
        this.category = category;
        this.brand = brand;
        this.size = size;
        this.quantity = quantity;
    }

    public String getModel_Num() {
        return model_Num;
    }

    public String getmName() {
        return mName;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getQuantity() {
        return quantity;
    }

    void add(ArrayList<FootwearPojo> footwear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
