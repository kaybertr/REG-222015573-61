public class SWITCH{

  public static void main(String args[]){

    int taxifees= 350;
    
    // Switch based on value of taxifees
    switch (taxifees) {
    
      // If 200, print route
      case 200: 
        System.out.println("Kagugu to Kimironko");
        break;
        
      // If 300 or 350, print route  
      case 300,350:
        System.out.println("Kimironko to Remera");
        break;
        
      // If 400 or 450, print route
      case 400,450:
        System.out.println("Remera to Kicukiro");
        break;
        
      // Default case  
      default:
        System.out.println("Kigali to Province"); 
    }
  }
}
