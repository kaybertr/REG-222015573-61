public class DoWhileLoop {
    public static void main(String[] args) {
         
        String text = "Hello";
        int i = 0;
    
        do {
          System.out.println(text.charAt(i));
          i++;
        } while(i < text.length());
    
      }
    
}
