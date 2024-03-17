pacakage booking;
import.java.util.scanner;
public class Movie1 {
      public static void main(string[ args]){

        Scanner sc=new Scanner(system.in);
        int status=1;
        Movie movlist[]=null;

        do{
            system.out.println("Movie Management System" );
            system.out.println("1. add movie deatils " );
            system.out.println(" 2. Search and book " );
            system.out.println(" 3. view all" );
            system.out.println("enter your choice : " );
            int ch=sc.nextInt();
            switch(ch)
            {
             case 1:
                    System.out.println("Enter no. of movie :")
                    int no=sc.nextInt();
                    movlist=new Movie[no];
                    for(int i=0;i<movlist.length;i++)
                    {
                        int j=i;
                        system.out.println("Enter movie"+ ++j+"Details");
                        movlist[i]=new Movie();
        
                    }
                    System.out.println("Data saved....")
                    break;
            case 2:
                boolean flag=true;
                sc.nextline();
                System.out.println("Enter movie nameL:");
                String name=sc.nextLine();
                for(int i=0;i<movlist.length;i++)
                {
                    if(movlist[i].getName().equals(name))
                    {
                        movlist[i].viewAllDetails();
                        flag=true;
                        System.out.println("Would you like to book tickets for this movie?:");
                        System.out.println("Enter 1 to book and 2 to exit:");
                        int c=sc.nextInt();
                        if(c==1)
                        {
                            System.out.println("Enter the no. of tickets:");
                            int tick=sc.nextInt();
                            int tc=movielist[i].getcost()*tick;
                            System.out.println("The bill comes up to:"+tc);
                        }
                        else
                        break;
                    }
                    elseflag=false;
                }
                case 3:
                    for(int i=0;i<movlist.length;i++){
                        movlist[i].viewAllDetails();
                    }
                    default: System.out.println("Wrong choice...");
            }
            System.out.println("Do you want to continue?(1.yes/2.no):");
            status=sc.nextInt();
        }
        while(status==1);
        System.out.println("Execution completed sucessfully...");
      }
}
            
