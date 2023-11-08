interface PomeInc{
public void companyMission();
}
class PomeIncCompany implements PomeInc {
public void companyMission(){
    System.out.println("Our Mission is to develop innovative software products");
}
}
class CTO extends PomeIncCompany{
  public  void CTOs() {
        System.out.println("CTO Manages engineers");
}
}
class SoftwareEngineer extends CTO{
  public  void writeCode(){
    System.out.println("Software Engineer Writes code");
    }
}
class ProductManager extends SoftwareEngineer{
  public  void prioritizeFeatures(){
System.out.println("Product Manager Prioritizes feature");
}
}
class SalesManager extends ProductManager{
  public  void manageSalesTeam(){
System.out.println("Sales Manager Manages sales team");
}
}
class PomeIncHierarchy {
    // This class demonstrates the hierarchical power structure of PomeInc.
    public static void main(String[] args) {
        // Create an instance of the SalesManager class.
        SalesManager dis = new SalesManager();

        // Call the manageSalesTeam method to print the responsibilities of a Sales Manager.
        dis.manageSalesTeam();

        // Call the prioritizeFeatures method to print the responsibilities of a Product Manager.
        dis.prioritizeFeatures();

        // Call the writeCode method to print the responsibilities of a Software Engineer.
        dis.writeCode();

        // Call the CTOs method to print the responsibilities of a CTO.
        dis.CTOs();

        // Call the companyMission method to print the mission of PomeInc.
        dis.companyMission();
    }
}
