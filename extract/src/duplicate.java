import java.util.Scanner;
import java.lang.String;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String");
        String str=in.nextLine();
        String str1=str.toUpperCase();
        System.out.println(str1);
        // String str = "Happy Homes";
        char str2[] = str1.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            count=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(str2[i]== str2[j] && str2[i]!=' ')
                {
                    count++;
                }
            }
            if(count > 1 )
                System.out.println(str2[i] + " " + count);
        }
    }
}
