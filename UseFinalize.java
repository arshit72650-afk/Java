package Class;




public class UseFinalize {
    public static void main(String[] args) {
Company.Count();
        {
            Company obj1 = new Company(20, "Aryan", 222922.92);
            obj1.getValue();
            Company.Count();//1

            Company obj2 = new Company(30, "Arshit", 288392.2);
            obj2.getValue();
            Company.Count();//2

            Company obj3 = new Company(25, "Aaru", 28229.29);
            obj3.getValue();
            Company.Count();//3

            Company obj4 = new Company(23, "Garima", 288329.2);
            obj4.getValue();
            Company.Count();//4


            {  // this method show if want to remove the object from
                // memory we can use garbage collection provided by jvm
                System.out.println("These are interns data");

                Company x = new Company(20, "Ashu", 34422.2);
                x.getValue();
                Company.Count();//5

                Company y = new Company(26, "Abhishek", 234341.2);
                y.getValue();
                Company.Count();//6

                x = y = null;
                System.gc();
                System.runFinalization();//its not error it showing lesser version of SDK
                Company.Count();//4
            }
            obj1 = obj2 =obj3=obj4= null;
            System.gc();
            System.runFinalization();
        }
        System.out.println("now the count is ");
       Company.Count();
    }
}
