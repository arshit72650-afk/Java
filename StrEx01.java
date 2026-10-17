package String;

import java.util.Scanner;

public class StrEx01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name1;
        System.out.println("Enter name ");
        name1 =kb.nextLine();

        StringBuilder name =new StringBuilder(name1);
        StringBuilder reverse=new StringBuilder("");
        for (int i =name.length()-1;i>=0;i--){

          reverse = reverse.append(name.charAt(i));

        }
        System.out.print(reverse);

    }
    //take Extra space for Stringbuilder


}
