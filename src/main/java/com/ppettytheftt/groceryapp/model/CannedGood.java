package com.ppettytheftt.groceryapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="canned_good")
public class CannedGood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private Long itemQuantity;
    private String contents;
    private Date dateCreated;

    public CannedGood() {

    }

    public CannedGood(Integer itemId, String itemName, Long itemQuantity, String contents, Date dateCreated) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.contents = contents;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
