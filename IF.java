public class IF {
  public static void main(String args[]){
    int age = 18;
    if (age < 18 ) {
      System.out.println("You're allowed 60% Discount");
    }else if( age >= 18 && age < 25){
      System.out.println("You're allowed 40% Discount");
    }else if ( age >= 25 && age < 35){
      System.out.println("You're allowed 35% Discount");
    }else if(age >=35 && age < 40){
      System.out.println("You're allowed 30% Discount");
    }else if(age >= 40 && age < 45){
      System.out.println("You're allowed 25% Discount");
    }else{
      System.out.println("You're not allowed Discount!");
    }
    }} 
