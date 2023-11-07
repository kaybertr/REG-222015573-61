public class NstdForLoop {

  public static void main(String[] args) {
  
    // Outer loop to control rows
    for(int i=1; i<=3; i++) {
    
      System.out.print("Row " + i + ": ");
      
      // Inner loop to print columns  
      for(int j=1; j<=5; j++) {
      
        // Print column number
        System.out.print(j + " ");
      }
      
      // Move to next line after each row
      System.out.println(); 
    }
  }
}
