public class BrkStatement {

  public static void main(String[] args) throws Exception {

    // Loop from 1 to 5
    for(int i=1; i<=5; i++){
    
      // Break out of loop if i is 3
      if(i == 3){
        break;
      }
      
      // Print value of i
      System.out.println(i);
    }
  }
}
