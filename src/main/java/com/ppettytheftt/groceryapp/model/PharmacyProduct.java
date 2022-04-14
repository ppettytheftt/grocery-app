package com.ppettytheftt.groceryapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pharmacy_product")
public class PharmacyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private Long itemQuantity;
    private String productType;
    private Date dateCreated;

    public PharmacyProduct() {
    }

    public PharmacyProduct(Integer itemId, String itemName, Long itemQuantity, String productType, Date dateCreated) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.productType = productType;
        this.dateCreated = dateCreated;
    }

    public Integer getItemId() {
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
