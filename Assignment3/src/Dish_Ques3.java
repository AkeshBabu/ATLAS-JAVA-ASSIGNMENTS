public class Dish_Ques3 {


    String name;
    double rating;

    int price;

    int quantity;


    public Dish_Ques3() {
        this("NA", 0.0, 0, 0);
    }

    public Dish_Ques3(String name, double rating, int price, int quantity) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.quantity = quantity;

    }
    void increment()
    {
        this.quantity++;
    }

    void decrement()
    {
        this.quantity--;
    }

    public static void main(String[] args) {
        Dish_Ques3 dish = new Dish_Ques3();
        Dish_Ques3 dish1 = new Dish_Ques3("PIZZA", 4.5,99, 10);
        Dish_Ques3 dish2 = new Dish_Ques3("BURGER",4.8,49,15);
        Dish_Ques3 dish3 = new Dish_Ques3("NUGGETS", 4.5,149,20);

        System.out.println("~~~~~~~~~~~~~~~~~DISH Details are as follows before increment/decrement~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dish Name:"+dish.name+" Dish rating:"+dish.rating+" Dish Price:"+dish.price+" Dish quantity:"+dish.quantity);
        System.out.println(dish1.name + " " + dish1.rating + " " + dish1.price + " " + dish1.quantity );
        System.out.println(dish2.name + " " + dish2.rating + " " + dish2.price + " " + dish2.quantity );
        System.out.println(dish3.name + " " + dish3.rating + " " + dish3.price + " " + dish3.quantity );

        dish1.increment();
        System.out.println("~~~~~~~~~~~~~~~~~DISH Details are as follows after increment~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(dish1.name + " " + dish1.rating + " " + dish1.price + " " + dish1.quantity );

        dish2.decrement();
        System.out.println("~~~~~~~~~~~~~~~~~DISH Details are as follows after decrement~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(dish2.name + " " + dish2.rating + " " + dish2.price + " " + dish2.quantity );

    }
}
