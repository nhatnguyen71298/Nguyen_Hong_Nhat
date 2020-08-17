package java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.*;

public class ArrayListAndLinkedList {

    static List<String[]> product=new ArrayList<>();
    static  Scanner scanner=new Scanner(System.in);

    public static void addProduct(){
        displayListProduct();
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

        for (String[] element:product){
            if (chooseProductRepair.equals(element[0])){
                System.out.println("Repair product:");
                System.out.println("Input name:");
                element[0] =scanner.next();
                System.out.println("Input price:");
                element[1] =scanner.next();
                System.out.println("Fixed");
                System.out.println(product);
                break;
            } else {
                System.out.println("The product is not in the list");
            }
        }

    }

    public static void displayListProduct(){
        System.out.println("List Product: ");
        System.out.println(Arrays.toString(product.toArray()));
    }

    public static void searchProduct(){
        System.out.println("Search:");
        String chooseSearch= scanner.next();
        for (String[] element:product){
            if (chooseSearch.equals(element[0])){
                System.out.println("Information of product: ");
                System.out.println(Arrays.toString(element));
            } else {
                System.out.println("The product is not in the list ");
            }
        }
    }

//    public static void SortProduct(){
//       displayListProduct();
//       System.out.println("1.Sort by name."+
//               "\n2.Sort by price");
//       int chooseSort= scanner.nextInt();
//       switch (chooseSort){
//           case 1:
//               String[] sortByName=new String[product.size()];
//
//               break;
//           case 2:
//               break;
//           default:
//       }
//    }

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
