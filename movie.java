package booking;
import java.util.scanner;
   
   
   public class movie{
    private sting name;
    private sting theatername;
    private int nooftickets;
    private int cost;

    movie(){
        scanner sc=new Scanner(system.in);
        system.out.println("enter the name of the movie: ");
        this.name = sc.nextline();
         system.out.println("enter the theaters name: ");
        this.theatersname = sc.nextline();
         system.out.println("enter the no of tickets: ");
        this.nooftickets = sc.nextInt();
         system.out.println("enter the cost per ticket: ");
        this.cost = sc.nextInt();
        
    }
void setName(string name){
        this.name  = name;
    }
    String getName(){
        return name;
    }
void settheatername(String theatername){
        this.theatername = theatername;
        }
        String gettheatername() {
        return theatername;
    }
   
void setnooftickets(int nooftickets) {
    this.nooftickets nooftickets;

      }
    int getnooftickets() {
      }
        return nooftickets;

void setcost(int cost) {
this.costcost;
}

int getcost() {
return cost;
}

void storeAllDetails(String name, String brand, int memory, int camera, double price) {
this.name name;
this.theatername = theatername;
this,nooftickets = nooftickets;
this.costcost;
}

void viewAllDetails() {
System.out.println("Name:"+name);
System.out.println("Theater name:"+theatername);
System.out.println("No. of tickets: "+nooftickets); System.out.println("Cost of the ticket: "+cost);
}
}
