public class IF {

  public static void main(String args[]){
    
    int age = 18;
    
    // Check if age is less than 18
    if (age < 18 ) {
      System.out.println("You're allowed 60% Discount"); 
    }
    
    // Check if age is between 18 and 25
    else if( age >= 18 && age < 25){
      System.out.println("You're allowed 40% Discount");
    }
    
    // Check if age is between 25 and 35
    else if ( age >= 25 && age < 35){
      System.out.println("You're allowed 35% Discount");
    }
    
    // Check if age is between 35 and 40  
    else if(age >=35 && age < 40){
      System.out.println("You're allowed 30% Discount");
    }
    
    // Check if age is between 40 and 45
    else if(age >= 40 && age < 45){
      System.out.println("You're allowed 25% Discount");
    }
    
    // If none of the above conditions are met
    else{
      System.out.println("You're not allowed Discount!");
    }
  }
}
