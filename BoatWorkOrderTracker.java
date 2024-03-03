
// andrewklasen intro java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  private String boatName;
  private ArrayList<String> workOrders;

  public Main(String name, ArrayList<String> orders) {
    boatName = name;
    workOrders = orders;
  }

  public ArrayList<String> getWorkOrders() {
    return workOrders;
  }

  public String getBoatName() {
    return boatName;
  }

  public void setWorkOrders(ArrayList<String> newWorkOrders) {
    this.workOrders = newWorkOrders;
  }

  public void setBoatName(String newboatname) {
    this.boatName = newboatname;
  }

  public void addWorkOrder(String workOrder) {

    boolean exists = this.workOrders.contains(workOrder);

    if (!exists) {
      this.workOrders.add(workOrder);
    }

  }

  public void deleteWorkOrder(String workOrder) {

    boolean exists = this.workOrders.contains(workOrder);

    if (exists) {
      this.workOrders.remove(workOrder);
    }

  }

  public static void main(String[] args) {

    String boatNameOne = "Lady Anne";
    // create a list from the array
    // create an array of integers
    String[] array = { "fresh paint job", "waxing hull" };
    ArrayList<String> boatAList = new ArrayList<String>(Arrays.asList(array));

    // we create a new boat called boatOne ..
    Main boatOne = new Main(boatNameOne, boatAList);

    //
    String[] newArray = { "NEW fresh paint job", "NEW waxing hull" };
    ArrayList<String> newBoatAList = new ArrayList<String>(Arrays.asList(newArray));

    boatOne.setWorkOrders(newBoatAList);
    System.out.println(boatOne.getBoatName());
    System.out.println(boatOne.getWorkOrders());

    String boatNametwo = "bobthebuilder";
    boatOne.setBoatName(boatNametwo);
    System.out.println(boatOne.getBoatName());

    String newWorkOrder = "new work order";
    boatOne.addWorkOrder(newWorkOrder);
    System.out.println(boatOne.getWorkOrders());

    String newsWorkOrder = "NEW waxing hull";
    boatOne.addWorkOrder(newsWorkOrder);
    System.out.println(boatOne.getWorkOrders());

    String deleteWorkOrder = "NEW waxing hull";
    boatOne.deleteWorkOrder(deleteWorkOrder);
    System.out.println(boatOne.getWorkOrders());

    String bobWorkOrder = "engine work";
    boatOne.deleteWorkOrder(bobWorkOrder);
    System.out.println(boatOne.getWorkOrders());
  }

}
