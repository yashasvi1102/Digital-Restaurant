/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.dto;

/**
 *
 * @author nagar
 */
public class Menu {
    private int dishId;
    private String dishName;
    private String description;
    private String offer;
    private int price;

    public Menu(int dishId, String dishName, String description, String offer, int price) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.description = description;
        this.offer = offer;
        this.price = price;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
