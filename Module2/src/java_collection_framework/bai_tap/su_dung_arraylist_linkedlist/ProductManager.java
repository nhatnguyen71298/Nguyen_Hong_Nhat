package java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    static List<Product> listProduct = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addProduct() {
        System.out.println("Add new Product:");
        System.out.println("Input name:");
        String nameOfProduct = scanner.next();
        System.out.println("Input price:");
        int priceProduct = scanner.nextInt();
        listProduct.add(new Product(nameOfProduct, priceProduct));
        System.out.println("Added!");
    }

    public static void repairProduct() {
        System.out.println("Choose product want to repair:");
        displayListProduct();
        String chooseProductRepair = scanner.next();
        boolean checkRepair = false;

        for (Product element : listProduct) {
            if (chooseProductRepair.equals(element.getName())) {
                checkRepair = true;
                break;
            }
        }
        if (!checkRepair) {
            System.out.println("Product is not in the list!");
        } else {
            for (Product element : listProduct) {
                if (chooseProductRepair.equals(element.getName())) {
                    System.out.println("Repair product:");
                    System.out.println("Input name:");
                    element.name = scanner.next();
                    System.out.println("Input price:");
                    element.price = scanner.nextInt();
                    System.out.println("Fixed");
                    displayListProduct();
                    break;
                }
            }
        }
    }

    public static void displayListProduct() {
        System.out.println("List Product: ");
        for (Product element : listProduct) {
            System.out.print("{ Name: " + element.getName() + " Price: " + element.getPrice() + " } ");
        }
        System.out.println();
    }

    public static void searchProduct() {
        displayListProduct();
        String chooseSearch = scanner.next();
        boolean checkSearch = false;
        for (Product element : listProduct) {
            if (chooseSearch.equals(element.getName())) {
                checkSearch = true;
                break;
            }
        }
        if (!checkSearch) {
            System.out.println("Product is not in the list!");
        } else {
            for (Product element : listProduct) {
                if (chooseSearch.equals(element.getName())) {
                    System.out.println("Information of product: ");
                    System.out.println(element);
                    break;
                }
            }
        }
    }

    public static void sortProduct() {
        displayListProduct();
        System.out.println("1.Sort by name." +
                "\n2.Sort by price");
        int chooseSort = scanner.nextInt();
        switch (chooseSort) {
            case 1:
                listProduct.sort(Product::compareTo);
                displayListProduct();
                break;
            case 2:
                listProduct.sort(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.price - o2.price;
                    }
                });
                displayListProduct();
                break;
            default:
                System.out.println("Not available!");
        }
    }

    public static void main(String[] args) {
        int choose=0;
        while (!(choose== 6)) {
            System.out.println("Choose:" +
                    "\n1. Add new product." +
                    "\n2. Repair product." +
                    "\n3. Display list product." +
                    "\n4. Search product." +
                    "\n5. Sort ascending, descending according to price." +
                    "\n6. Exit."
            );
            choose = scanner.nextInt();
            switch (choose) {
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
                    sortProduct();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Not Available!");
            }
        }
    }
}
