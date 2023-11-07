public class DoWhileLoop {

  public static void main(String[] args) {

    String text = "Hello";
    
    int i = 0;
    
    // Execute loop body at least once
    do {
    
      // Print current char from text
      System.out.println(text.charAt(i));  
      
      // Increment i after each iteration
      i++;
      
    // Continue looping while i is less than text length  
    } while(i < text.length());
  }
}
