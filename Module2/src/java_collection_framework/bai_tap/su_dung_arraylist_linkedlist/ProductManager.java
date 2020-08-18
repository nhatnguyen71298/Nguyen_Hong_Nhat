package java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.*;

public class ProductManager {

    static List<String[]> product=new ArrayList<>();
    static  Scanner scanner=new Scanner(System.in);

    public static void addProduct(){
        String[] inforOfproduct= new String[2];
        System.out.println("Add new Product:");
        System.out.println("Input name:");
        inforOfproduct[0] =scanner.next();
        System.out.println("Input price:");
        inforOfproduct[1] =scanner.next();
        product.add(inforOfproduct);
        System.out.println("Added!");
    }

    public static void repairProduct(){
        System.out.println("Choose product want to repair:");
        displayListProduct();
        String chooseProductRepair= scanner.next();
        boolean checkRepair=false;

        for (String[] element:product){
            if (chooseProductRepair.equals(element[0])){
                checkRepair=true;
                break;
            }
        }
        if (!checkRepair){
            System.out.println("Product is not in the list!");
        } else {
            for (String[] element:product){
                if (chooseProductRepair.equals(element[0])){
                    System.out.println("Repair product:");
                    System.out.println("Input name:");
                    element[0] =scanner.next();
                    System.out.println("Input price:");
                    element[1] =scanner.next();
                    System.out.println("Fixed");
                    displayListProduct();
                    break;
                }
            }
        }
    }

    public static void displayListProduct(){
        System.out.println("List Product: ");
        for (String[] element:product){
            System.out.print("{ Name: "+element[0]+" Price: "+element[1]+" } ");
        }
        System.out.println();
    }

    public static void searchProduct(){
        System.out.println("Search:");
        String chooseSearch= scanner.next();
        boolean checkSearch=false;
        for (String[] element:product){
            if (chooseSearch.equals(element[0])){
                checkSearch=true;
                break;
            }
        }
        if (!checkSearch){
            System.out.println("Product is not in the list!");
        } else {
            for (String[] element:product){
                if (chooseSearch.equals(element[0])){
                    System.out.println("Information of product: ");
                    System.out.println(Arrays.toString(element));
                }
            }
        }

    }



//   public static int SortProduct(){
//       displayListProduct();
//       System.out.println("1.Sort by name."+
//               "\n2.Sort by price");
//       int chooseSort= scanner.nextInt();
//       switch (chooseSort){
//           case 1:
//               for (String[]element: product
//                    )
//               break;
//           case 2:
//               break;
//           default:
//       }
//    }
//
//    @Override
//    public int compareTo(String[] o) {
//        return 0;
//    }
//

    public static void main(String[] args) {
        int choose=-1;
        while (choose!=6) {
            System.out.println("Choose:" +
                    "\n1. Add new product."+
                    "\n2. Repair product."+
                    "\n3. Display list product."+
                    "\n4. Search product."+
                    "\n5. Sort ascending, descending according to price."+
                    "\n6. Exit."
            );
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    addProduct();
                    break;
                case 2:
                    repairProduct();
                    break;
                case 3:
                    displayListProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
//                    SortProduct();
                    break;
                default:
                    System.out.println("Not Avaiable!");
            }
        }
    }


}
