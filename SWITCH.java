public class SWITCH{
  public static void main(String args[]){
   int taxifees= 350;
   switch (taxifees) {
    case 200: System.out.println("Kagugu to Kimironko");
      
      break;
      case 300,350: System.out.println("Kimironko to Remera");

      break;
      case 400,450: System.out.println("Remera to Kicukiro");
      break;
   
    default: System.out.println("Kigali to Province");
   } 
  } 
}