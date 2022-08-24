import java.util.Scanner;

class States_data
{
    String name_of_state;
    int active_cases;
    int cured_cases;
    int deaths;

    public States_data(String name_of_state, int active_cases, int cured_cases, int deaths) {
        this.name_of_state = name_of_state;
        this.active_cases = active_cases;
        this.cured_cases = cured_cases;
        this.deaths = deaths;
    }

    public States_data() {
        this("NA",0,0,0);
    }
    void  show_data(){
        System.out.println("Name od state:"+name_of_state+" active cases:"+active_cases+" cured cases:"+ cured_cases+ " deaths:"+ deaths);
    }
}

public class Ques3_2DArray {

    public static  void main(String args[]){

        States_data data[][] = new States_data[2][2];

        data[0][0]=new States_data("UP",1000,10000,500);
        data[0][1]=new States_data("BIHAR",2000,10000,500);
        data[1][0]=new States_data("West Bengal",4000,10000,500);
        data[1][1]=new States_data("Assam",100,1000,50);

        Scanner scr=new Scanner(System.in);

//        for (int i=0;i<2;i++)
//        {
//            for (int j=0;j<2;j++)
//            //data[i][j]=scr.next();
//                // System.out.println("Name of state:"+data[i][j].name_of_state+" active cases:"+data[i][j].active_cases+" Cured cases:"+data[i][j].cured_cases+" deaths:"+data[i][j].deaths);
//
//        }

        for (States_data [] arr: data) {
            for (States_data  data2: arr) {
                System.out.println("Name of state:"+data2.name_of_state+" active cases:"+data2.active_cases+" Cured cases:"+data2.cured_cases+" deaths:"+data2.deaths);
            }
        }


    }
}
