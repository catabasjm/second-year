import java.util.Scanner;

public class User_Y{
   public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
      System.out.println("ACTIVTY # 1 ONLINE RETAIL SYSTEM");
      //User
      User boxOne = new User();
      boxOne.logIn();
      boxOne.logOut();
      //Customer
      Customer boxTwo = new Customer();
      boxTwo.placeOrder();
      boxTwo.viewOrderHistory();
      //Admin
      Admin boxThree = new Admin();
      boxThree.addProduct();
      boxThree.removeProduct();
      boxThree.manageInventory();
      //Product
      Product boxFour = new Product();
      boxFour.updatePrize();
      boxFour.updateStock();
      //Order
      Order boxFive = new Order();
      boxFive.calcTotalAmount();
      boxFive.addProduct();
      boxFive.confirmOrder();
   }
}
//User
class User{
   public void logIn(){
      System.out.println("You are logged In");
   }
   public void logOut(){
      System.out.println("You are logged out");
   }
}
//Customer
class Customer extends User{
   public void placeOrder(){
      System.out.println("Place your order: ");
   }
   public void viewOrderHistory(){
      System.out.println("View order history: ");
   }
}
//Admin
class Admin extends User{
   public void addProduct(){
      System.out.println("Add product/s: "); 
   }
   public void removeProduct(){
      System.out.println("Remove product/s: ");
   }
   public void manageInventory(){
      System.out.println("Manage inventory: ");
   }
}
//Product
class Product{
   public void updatePrize(){
      System.out.println("Update prize");
   }
   public void updateStock(){
      System.out.println("Update stock");
   }
}
//Order
class Order{
   public void calcTotalAmount(){
      System.out.println("Calculate total amount");
   }
   public void addProduct(){
      System.out.println("Add a product to order");
   }
   public void confirmOrder(){
      System.out.println("Confirm order");
   }
}
