/*package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table(name="PRODUCTS")
public class Product {
    private int id;
    private String name;
    private Item itemList;

    public Product(){
    }

    public Product(String name){
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column (name = "ID", unique = true)
    public int getId(){
        return id;
    }
    @Column(name = "NAME")
    public String getName(){
        return name;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column(name = "ITEMLIST")
    public Item getItemList(){
        return itemList;
    }
    private void setId(int id){
        this.id = id;
    }
    private void setName(String name){
        this.name = name;
    }
    private void setItemList(Item itemList){
        this.itemList = itemList;
    }
}
*/