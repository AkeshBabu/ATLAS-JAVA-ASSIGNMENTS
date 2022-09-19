class Meal {
    int id;
    String name;
    int price;


    Meal(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class MealService extends Meal{
    String frequency;

    MealService(int id, String name, int price,String frequency){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.frequency = frequency;
    }

    int calculateCost(String frequency, int price){
        int calculatedCost = 0;
        switch (frequency) {
            case monthly:
                calculatedCost = 30 * price;
                break;
            case quarterly:
                calculatedCost = 90 * price;
                break;
            case Yearly:
                calculatedCost = 365 * price;
                break;
        }
        return calculatedCost;
    }
}

class ItalianMealService extends MealService{
    String dessertName;

    ItalianMealService(int id, String name, int price,String fre


public class SingleRespPrin_Ques1_Assingment19 {

    public static  void main(String [] args){

    }

}
