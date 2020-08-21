package case_study.controllers;
import java.util.Scanner;

public class MainControllers {
    static Scanner scanner=new Scanner(System.in);
    public static void displayMainMenu(){
        int choose=0;
        while (choose!=7){
            System.out.println("1. Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Exit\n");
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    addNewServices();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not available!");
            }
        }
    }

    public static void addNewServices(){
        int chooseServices=0;
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        chooseServices=scanner.nextInt();
        switch (chooseServices){
            case 1:
                System.out.println("Input area:");
                int areaVilla=scanner.nextInt();
                System.out.println("Input price:");
                int priceVilla=scanner.nextInt();
                System.out.println("Input max of member:");
                int maxMembersVilla=scanner.nextInt();
                System.out.println("Input rental type:");
                String rentalTypeVilla=scanner.next();
                System.out.println("Input type room:");
                String typeRoomVilla=scanner.next();
                System.out.println("Input other amenities:");
                String ortherAmenitiesVilla=scanner.next();
                System.out.println("Input area of swimming pool:");
                int areaSwimVilla=scanner.nextInt();
                System.out.println("Input number of floor:");
                int numberFloorsVilla=scanner.nextInt();

                break;
             case 2:
                 System.out.println("Input area:");
                 int areaHouse=scanner.nextInt();
                 System.out.println("Input price:");
                 int priceHouse=scanner.nextInt();
                 System.out.println("Input max of member:");
                 int maxMembersHouse=scanner.nextInt();
                 System.out.println("Input rental type:");
                 String rentalTypeHouse=scanner.next();
                 System.out.println("Input type room:");
                 String typeRoomHouse=scanner.next();
                 System.out.println("Input other amenities:");
                 String ortherAmenitiesHouse=scanner.next();
                 System.out.println("Input number of floor:");
                 int numberFloorsHouse=scanner.nextInt();
                 break;
            case 3:
                System.out.println("Input area:");
                int areaRoom=scanner.nextInt();
                System.out.println("Input price:");
                int priceRoom=scanner.nextInt();
                System.out.println("Input max of member:");
                int maxMembersRoom=scanner.nextInt();
                System.out.println("Input rental type:");
                String rentalTypeRoom=scanner.next();
                System.out.println("Input Free Services:");
                String freeServicesRoom=scanner.next();
                break;
            case 4:
                displayMainMenu();
                break;
             case 5:
                 System.exit(0);
                 break;
             default:
                 System.out.println("Not available!");
            }
        }
    }
