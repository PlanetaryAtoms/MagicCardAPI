package com.example.Magic_Cards_API.entity;


import javax.persistence.*;

@Entity //Create a bean/pojo for the database table
@Table(name = "magic_card") //Table name in database
public class MagicCard {

    //Define fields
    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    @Column(name = "id") //Map the primary key with the id column in the table
    private int id;

    @Column(name = "magic_card_name")
    private String magicCardName;
    @Column(name = "magic_card_type")
    private String magicCardType;
    @Column(name = "magic_card_description")
    private String magicCardDescription;
    @Column(name = "magic_card_color")
    private String magicCardColor;
    @Column(name = "magic_card_rarity")
    private String rarity;
    @Column(name = "magic_card_price")
    private double magicCardPrice;
    @Column(name = "magic_card_level")
    private int magicCardLevel;


    //Default Constructor
    public MagicCard(){
    }

    //Parameterized Constructor
    public MagicCard(String magicCardName, String magicCardType, String magicCardDescription, String magicCardColor, String rarity, double magicCardPrice, int magicCardLevel){
        this.setMagicCardName(magicCardName);
        this.setMagicCardType(magicCardType);
        this.setMagicCardDescription(magicCardDescription);
        this.setMagicCardColor(magicCardColor);
        this.setRarity(rarity);
        this.setMagicCardPrice(magicCardPrice);
        this.setMagicCardLevel(magicCardLevel);
    }

    //Accessors and Mutators
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMagicCardName() {
        return magicCardName;
    }

    public void setMagicCardName(String magicCardName) {
        this.magicCardName = magicCardName;
    }

    public String getMagicCardType() {
        return magicCardType;
    }

    public void setMagicCardType(String magicCardType) {
        this.magicCardType = magicCardType;
    }

    public String getMagicCardDescription() {
        return magicCardDescription;
    }

    public void setMagicCardDescription(String magicCardDescription) {
        this.magicCardDescription = magicCardDescription;
    }

    public String getMagicCardColor() {
        return magicCardColor;
    }

    public void setMagicCardColor(String magicCardColor) {
        this.magicCardColor = magicCardColor;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public double getMagicCardPrice() {
        return magicCardPrice;
    }

    public void setMagicCardPrice(double magicCardPrice) {
        this.magicCardPrice = magicCardPrice;
    }

    public int getMagicCardLevel() {
        return magicCardLevel;
    }

    public void setMagicCardLevel(int magicCardLevel) {
        this.magicCardLevel = magicCardLevel;
    }

    //Override the toString method
    @Override
    public String toString(){
        return "Part{" +
                "id = " + id +
                ", cardName = '" + magicCardName + '\'' +
                ", cardType = '" + magicCardType + '\'' +
                ", cardDescription = '" + magicCardDescription + '\'' +
                ", cardColor = '" + magicCardColor + '\'' +
                ", cardRarity = '" + rarity + '\'' +
                ", cardPrice = '" + magicCardPrice + '\'' +
                ", cardLevel = '" + magicCardLevel + '\'' +
                '}';
    }

}
