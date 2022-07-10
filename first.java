import java.util.Scanner;

public class first{    
    public static Scanner in = new Scanner(System.in);

    public static String text;
    public static void main(String[] args) {
        System.out.print("C:> ");
        text = in.nextLine();

        while(text!= "stop"){
            System.out.print("C:> ");
            text = in.nextLine();

            if (text.substring(0, 3) == "make"
                    && text.indexOf(" ") == 4){
                System.out.println(text.substring(5, text.length()-1));

            }else
                System.out.println("Not Understood");;
        }
        System.out.println("!Program Stopped!");
    }
}