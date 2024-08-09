import java.util.Scanner;

public class StudentAcc{
   public static void main(String[] args){
      Scanner read = new Scanner(System.in);
      
      System.out.println("***STUDENT INFO***");
      System.out.print("Please enter number of student(s): ");
      int length = read.nextInt();
      read.nextLine();
      
      String name[] = new String[3];
      int year[] = new int[3];
      
      for(int i = 0; i < length; i++){
         System.out.print("\nEnter student name: ");
         name[i] = read.nextLine();
   
         System.out.print("Enter student year: ");
         year[i] = read.nextInt();
         read.nextLine();
      }
      
      System.out.println("\nSelect task:");
      System.out.println("1. View student list");
      System.out.println("2. Update student info");
      System.out.println("3. Search student name");
      System.out.println("4. Delete student info");
      System.out.println("5. Exit");
      
      System.out.println("\nEnter number of choice: ");
      int choice = read.nextInt();
      
      switch(choice){
         case 1:
            for(int j = 0; j < length; j++){
            System.out.println("ID#: " + (K001+1) +"Name: " + name[j]+ "\nYear: " + year[j]);
            }
            break;
         case 2:
            
      }
   }
}