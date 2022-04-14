package com.ppettytheftt.groceryapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="food_item")
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer itemId;
    @Column(name = "name")
    private String itemName;
    @Column(name = "quantity")
    private Long itemQuantity;
    @Column(name = "food_type")
    private String foodType;
    @Column(name = "created", columnDefinition = "TIMESTAMP")
    private Date dateCreated;

    public FoodItem() {
    }

    public FoodItem(Integer itemId, String itemName, Long itemQuantity, String foodType, Date dateCreated) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.foodType = foodType;
        this.dateCreated = dateCreated;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
