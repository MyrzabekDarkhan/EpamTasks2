package model;

public class Car {
    public int id;
    public String brand;
    public String model;
    public String color;
    public int price;
    public int year;
    public String registerNumber;


    public Car(int id, String brand, String model, String color, int price, String registerNumber, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
        this.year = year;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }


    @Override
    public String toString() {
        return "{" +
                "brand = '" + brand + '\'' +
                ", model = " + model +
                ", color = " + color +
                ", register number = " + registerNumber +
                ", year = " + year +
                ", price = " + price +
                '}';
    }
}