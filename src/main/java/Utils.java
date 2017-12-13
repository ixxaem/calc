import java.util.Scanner;

public class Utils {


    public static double getDouble(int max){
        Scanner scanner =  new Scanner(System.in);
        int flag = 0;
        while (!scanner.hasNextDouble()&&flag<max)
        {
            System.out.println("Значение в неверном формате:"+scanner.next());
            flag++;

        }
        return scanner.nextDouble();
    }

    public static String getSighn(int max){
        Scanner scanner =  new Scanner(System.in);
        int flag = 0;
        while(!scanner.hasNext("[\\+-/*]")&&flag<max)
        {
            System.out.println("Значение в неверном формате:"+scanner.next());
            flag++;
        }
        return scanner.next("[\\+-/*]");
    }



}
