package armStrongNumber.run;

import armStrongNumber.Main.armStrong;

public class Main 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 500; i++)
        {
            System.out.println("is "+i+" an armStrong Number? "+armStrong.isArmStrongNumber(i));
        }    
    }
}
