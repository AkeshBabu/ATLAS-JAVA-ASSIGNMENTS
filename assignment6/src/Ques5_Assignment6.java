class New_Dish {
    String name;
    int rating;
    int price;

    New_Dish nextDish;


    public New_Dish(String name, int rating, int price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public New_Dish() {
    }

    New_Dish head=null;

    New_Dish sortedMerge(New_Dish a, New_Dish b){

        New_Dish result=null;

        if (a==null)
            return b;
        if (b == null)
            return  a;

        if (a.price <= b.price){
            result=a;
            result.nextDish=sortedMerge(a.nextDish,b);
        }
        else {
            result =b;
            result.nextDish=sortedMerge(a,b.nextDish);
        }

        return  result;
    }



    New_Dish mergeSort(New_Dish h){
        if (h==null || h.nextDish == null){
            return  h;
        }
        New_Dish middle=getMiddle(h);
        New_Dish nextofmiddle= middle.nextDish;

        middle.nextDish=null;

        New_Dish left=mergeSort(h);
        New_Dish right=mergeSort(nextofmiddle);

        New_Dish sortedList=sortedMerge(left,right);
        return sortedList;
    }

    public static New_Dish getMiddle(New_Dish head){
        if (head==null){
            return head;
        }
        New_Dish slow=head, fast=head;

        while (fast.nextDish != null && fast.nextDish.nextDish != null){
            slow=slow.nextDish;
            fast=fast.nextDish.nextDish;
        }
        return slow;
    }

    void push(String name, int rating ,int price){
        New_Dish new_dish=new New_Dish(name, rating,price);

        new_dish.nextDish=head;

        head=new_dish;
    }

    void printList(New_Dish headref){
        while (headref != null){
            System.out.println("Dish Name:"+headref.name+" Dish rating is:"+headref.rating+" Dish Price is:"+ headref.price);
            headref=headref.nextDish;
        }
    }
}

public class Ques5_Assignment6  {

    public static void main(String [] args){

        New_Dish newDish=new New_Dish();

        newDish.push("Dal",4,100);
        newDish.push("Rice",5,80);
        newDish.push("Dosa",5,30);
        newDish.push("Tea",5,25);
        newDish.push("Coffee",4,120);

        newDish.head=newDish.mergeSort(newDish.head);
        System.out.println("Sorted List based on price is:");
        newDish.printList(newDish.head);



    }
}
//}
