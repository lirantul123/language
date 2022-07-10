import java.util.*;

public class practice {
    public static Scanner in = new Scanner(System.in);
    static final int EMMO = 300;
    static int currentEmmo = 300;
    public static void main(String[] args) throws InterruptedException {
        currentEmmoFun();
    }

    public static void currentEmmoFun() throws InterruptedException{
        String input = in.next();
        while (true && input == "start"){
            Thread.sleep(1000);
            currentEmmo--;
            System.out.println(currentEmmo);
            if (input == "r")
                currentEmmo = 300;
            if (input == "stop")
                break;    
                
        }
    }
}
