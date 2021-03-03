package model;

public class Test {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(1, "Toyota", "Camry", "Green", 20000, "A102VDZ", 1999);
        cars[1] = new Car(2, "Lexus", "LX470", "Black", 30000, "A555YXA", 2001);
        cars[2] = new Car(3, "BMW", "750i", "Red", 50000, "A777XAN", 2010);
        cars[3] = new Car(4, "Audi", "TT", "Yellow", 40000, "A025VDD", 2005);
        cars[4] = new Car(5, "Audi", "Q70", "Black", 40000, "A888ZZZ", 2020);

        String givenBrand = "Audi";

        System.out.println("Cars that have same brand:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(givenBrand)) {
                System.out.println(cars[i].toString());
            }
        }

        System.out.println();

        int CurrentYear = 2020;
        int yearsUsed = 10;
        System.out.println("Cars which used more than " + yearsUsed + " year:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() < (CurrentYear - yearsUsed)) {
                System.out.println(cars[i].toString());
            }
        }

        System.out.println();


        int priceGiven = 30000;
        System.out.println("Cars which price more than " + priceGiven + "$");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > priceGiven) {
                System.out.println(cars[i].toString());
            }
        }
    }
}