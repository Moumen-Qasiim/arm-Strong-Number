package armStrongNumber.Main;

import java.util.LinkedList;
import java.util.List;

public class armStrong 
{
    public static boolean  isArmStrongNumber(int number)
    {
        int power = get_Total_Number_of_digest(number);
        List<Integer> numbers = get_array_of_digest(number);
        int total = 0;
        for(int num : numbers)
        {
            total += (int) Math.pow(num, power);
        }

        return total == number;
    }

    public static int get_Total_Number_of_digest(int Number)
    {
        
        return itorator(Number, 0);
        
    }

    public  static List<Integer> get_array_of_digest(int number)
    {
        List<Integer> numbers = new LinkedList<>();
        while(number != 0)
        {
            numbers.add(number%10);
            number /= 10;
        }
        return numbers;
    }

    private static int itorator(int number,int total)
    {
        if(number == 0)
        return total;

        return itorator(number/10, ++total);
    }
}
