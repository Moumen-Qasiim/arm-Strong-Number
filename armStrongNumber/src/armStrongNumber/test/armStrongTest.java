package armStrongNumber.test;

import java.util.List;

import armStrongNumber.Main.armStrong;

public class armStrongTest 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = armStrong.get_array_of_digest(123);
        int numberodDigest = armStrong.get_Total_Number_of_digest(123);
        boolean isarmStrong = armStrong.isArmStrongNumber(153);

        if(numberodDigest == 3)
            System.out.println("Test 1 passed...");
        else
            System.out.println("Test 1 failed...");
        
        if(numbers.get(0) == 3 && numbers.get(1) == 2 && numbers.get(2) == 1)
            System.out.println("Test 2 passed...");
        else
            System.out.println("Test 2 failed...");

        if(isarmStrong == true)
            System.out.println("Test 3 passed...");
        else    
            System.out.println("Test 3 failed...");  
    }
}
