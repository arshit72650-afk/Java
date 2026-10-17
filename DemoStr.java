package String;

public class DemoStr {
    public static void main(String[] args) {
        String sentence = "My name is Tony ";
        String name = sentence.substring(11);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Tony");
        //charAt
        //  System.out.println(sb.charAt(0));;
        // sb.setCharAt(0,'P');
        //   System.out.println(sb);
        sb.insert(3, 'n');
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);


        //why its used
        //String builder is used to reduce time complexity for
        // add or removing string in the string
        // for example

        StringBuilder sb1 = new StringBuilder("H");
        System.out.println(sb1);
        sb1.append("e");
        sb1.append("l") ;
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
        System.out.println("The length of the String: "+sb1.length());
        System.out.println(sb.capacity());
    }

}
