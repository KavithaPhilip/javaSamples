import java.util.Scanner;

public class extraction {

   public static void splitString(String str)

    {

        StringBuffer alpha = new StringBuffer(),

                num = new StringBuffer(), special = new StringBuffer();


        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)))

                num.append(str.charAt(i));

            else if (Character.isAlphabetic(str.charAt(i)))

                alpha.append(str.charAt(i));

            else

                special.append(str.charAt(i));

        }


        System.out.println(num);

        System.out.println(special);
    }

    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        splitString(str);

    }

}

