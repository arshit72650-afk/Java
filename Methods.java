package Class;

public class Methods{
    private static int count  = 0 ;
    private  int age;
    private String name="Arshit";
     public void Set(int a ,String b)
     {
           age = a;
           name = b;
           count++;
     }

     public void Get()
     {
          System.out.println("The age is "+age+ "\nThe name is "+name);
        System.out.println("the number of time method is used "+ count);
     }


}
