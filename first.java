import java.util.*;

public class first{    
    public static Scanner in = new Scanner(System.in);

<<<<<<< HEAD
    public static String text;
=======
    private static String text = "";
    
>>>>>>> 4807702f16239c432213db47e5c45be9e99a9e83
    public static void main(String[] args) {
        System.out.print("C:> ");
        text = in.nextLine();

        while(text!= "stop"){
            System.out.print("C:> ");
            text = in.nextLine();

<<<<<<< HEAD
            if (text.substring(0, 3) == "make"
                    && text.indexOf(" ") == 4){
                System.out.println(text.substring(5, text.length()-1));

            }else
                System.out.println("Not Understood");;
=======
            if (text.substring(text.charAt(0), text.charAt(3)) == "make"
                    && text.substring(text.charAt(4), text.charAt(4)) == " ")
                
                System.out.println(text.substring(text.charAt(5), text.charAt(text.length()-1)));

            else
                continue;
>>>>>>> 4807702f16239c432213db47e5c45be9e99a9e83
        }
        System.out.println("!Program Stopped!");
    }
}
