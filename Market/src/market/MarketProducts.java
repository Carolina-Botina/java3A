/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

/**
 *
 * @author carolina
 */
public class MarketProducts {
    String Product_Name;
    int Code, Quantity;
    float Price;

    public MarketProducts(String Product_Name, int Code, int Quantity, float Price) {
        this.Product_Name = Product_Name;
        this.Code = Code;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    //Getter
    public String getProduct_Name() {
        return Product_Name;
    }
    //Setter
    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }
    //Getter
    public int getCode() {
        return Code;
    }
    //Setter
    public void setCode(int Code) {
        this.Code = Code;
    }
    //Getter
    public int getQuantity() {
        return Quantity;
    }
    //Setter
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    //Getter
    public float getPrice() {
        return Price;
    }
    //Setter
    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
}
