class Theme{

    public static void selectTheme(){
        System.out.println("[ThemeClass] Select your favorite theme");
    }
}

class MyTheme extends Theme{

    public static void selectTheme(){
        System.out.println("[MyThemeClass] Select theme from your collection");
    }
}

public class Ques5_Assignment7 {

    public static void main(String [] args){
        Theme theme=new MyTheme();
        theme.selectTheme();
        

    }
}
