import java.util.Scanner;

public class first{    
    public static Scanner in = new Scanner(System.in);

    private static String text = "";
    public static void main(String[] args) {
        while(text!= "stop"){
            System.out.print("C:> ");
            text = in.nextLine();

            if (text.substring(text.charAt(0), text.charAt(3)) == "make"
                    && text.substring(text.charAt(4), text.charAt(4)) == " "){
                System.out.println(text.substring(text.charAt(5), text.charAt(text.length()-1)));

            }else
                continue;
        }
        System.out.println("!Program Stopped!");
    }
}