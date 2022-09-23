//package com.amazon.atlas22.structural;

import java.util.Scanner;

interface AppleItem{
    String getDescription();
    int getPrice();
}

class Macbook implements AppleItem{

    @Override
    public String getDescription() {
        return "13 inch Macbook pro grey color";
    }

    @Override
    public int getPrice() {
        return 129900;
    }

}

class Iphone implements AppleItem{

    @Override
    public String getDescription() {
        return "Veggie Wrap with Paneer and Capsicums";
    }

    @Override
    public int getPrice() {
        return 180;
    }

}

// Decorator Design Pattern
abstract class AppleDecorator implements AppleItem{

    AppleItem item; // Has-A Relationship with FoodItem :)

    // Which FoodItem to be Decorated:)
    public AppleDecorator(AppleItem item) {
        this.item = item;
    }

    @Override
    public String getDescription() { // Returns the Description of Decorated FoodItem
        return item.getDescription();
    }

    @Override
    public int getPrice() {			// Returns the Price of Decorated FoodItem
        return item.getPrice();
    }

}

class MacbookMemory extends AppleDecorator{

    MacbookMemory(AppleItem item){
        super(item);
    }

    @Override
    public String getDescription() {
        // Perform Decoration Here
        return item.getDescription()+"!! Your Macbook Upgraded to a 16GB unified memory";
    }

    @Override
    public int getPrice() {
        // Perform Decoration Here
        return item.getPrice()+20000;
    }
}

class IphoneStorage extends AppleDecorator{

    IphoneStorage(AppleItem item){
        super(item);
    }

    @Override
    public String getDescription() {
        // Perform Decoration Here
        return item.getDescription()+"!! Your Iphone Storage upgraded to 256 gb";
    }

    @Override
    public int getPrice() {
        // Perform Decoration Here
        return item.getPrice()+10000;
    }
}


public class Ques3_Assignment21 {

    public static void main(String[] args) {

        Macbook macbook = new Macbook();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to upgrade your burger to a Item ? (yes/no)");
        String choice = scanner.nextLine();
        scanner.close();

        if(choice.equalsIgnoreCase("yes")) {
            AppleDecorator upgraded = new MacbookMemory(macbook);
            System.out.println("Here is Your Macbook");
            System.out.println("Macbook: "+upgraded.getDescription());
            System.out.println("Price: "+upgraded.getPrice());
            System.out.println("Please Pay to Proceed....");
        }else {
            System.out.println("Here is Your Macbook");
            System.out.println("Macbook: "+macbook.getDescription());
            System.out.println("Price: "+macbook.getPrice());
            System.out.println("Please Pay to Proceed....");
        }

    }

}

