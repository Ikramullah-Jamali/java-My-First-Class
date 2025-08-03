

import java.util.Scanner;

class TakingUserInput
{
   public static void main (String[] args)
  
     { 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=s.next();
        System.out.println("Enter Your Age:");
        int age=s.nextInt();
        System.out.println("Enter your Gender(M/F):");
        char gender=s.next().charAt(0);
        System.out.println("Enter Your Phone No:");
        long phno=s.nextLong();
        System.out.println("***--**--**---**---**---**---**---**---**---**---**---**---**---**---***");
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
        System.out.println("Phone No. : "+phno);
        s.close();


      }
}
