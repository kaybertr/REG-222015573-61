public class NstdForLoop {

  public static void main(String[] args) {
    for(int i=1; i<=3; i++) {
      System.out.print("Row " + i + ": "); 
      
      
      for(int j=1; j<=5; j++) {
        System.out.print(j + " ");
      }
      
      System.out.println(); 
    }

  }

}