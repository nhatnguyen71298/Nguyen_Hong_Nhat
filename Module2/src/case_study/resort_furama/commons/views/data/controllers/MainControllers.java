package case_study.resort_furama.commons.views.data.controllers;

import case_study.resort_furama.commons.views.data.models.*;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

public class MainControllers {
    static Scanner scanner = new Scanner(System.in);
    static File cinemaFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Cinema.csv");
    static File employeeFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Employee.csv");
    static File bookingFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Booking.csv");
    static File villaFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Villa.csv");
    static File houseFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\House.csv");
    static File roomFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Room.csv");
    static File customerFile = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\resort_furama\\commons\\views\\data\\Customer.csv");
    static final String COMMON = ",";
    static final String REGEX_CODESERVICES="^SV(VL|HO|RO)-\\d{4}$";
    static final String REGEX_NAMEOFSERVICES="^[A-Z]{1}\\w+$";
    static final String REGEX_AREA="^([0-9]|1[0-9]|2[0-9]).([0-9]|[1-8][0-9]|9[0-9])|(30.00)$";
    static final String REGEX_PRICE="^[1-9][0-9]*$";
    static final String REGEX_MAXMEMBER="([1-9]|1[0-9])";
    static final String REGEX_SERVIVICEACCOMPANNIED ="^(massage|karaoke|food|drink|car)$";
    static final String REGEX_NUMBEROFFLOOR="^[1-9][0-9]*$";
    static final String REGEX_RENTALTYPE="^[A-Z]{1}\\w+$";
    static final String REGEX_TYPEROOM="^[A-Z]{1}\\w+$";

    static final String REGEX_BIRTHDAY="^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
    static final String REGEX_NAMECUSTOMER="^([A-Z][a-z]+\\s?)+$";
    static final String REGEX_EMAIL="^\\w+@\\w+.\\w+$";
    static final String REGEX_GENDER="^([Mm][Aa][Ll][E|e])|([F|f][E|e][M|m][A|a][L|l][E|e])|([U|u][N|n][K|k][N|n][O|o][W|w])$";
    static final String REGEX_CARD="^\\d{9}$";
    static final String REGEX_PHONENUMBER="^\\d{10}$";

    public static void displayMainMenu() {
        int choose = 0;
        while (choose != 7) {
            System.out.println("1.Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Search Employee\n" +
                    "8.Cinema 4D\n" +
                    "9.Exit\n");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServies();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInforCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInforEmployee();
                    break;
                case 7:
                    searchEmployee();
                    break;
                case 8:
                    checkCinema4D();
                    break;
                case 9:
                    exit(0);
                    break;
                default:
                    System.out.println("Not available!");
            }
        }
    }
//-----------------------------------------------------------------------------------
    public static void addNewServices() {
        int chooseServices = 0;
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        chooseServices = scanner.nextInt();
        switch (chooseServices) {
            case 1:
                inputNewVilla();
                break;
            case 2:
                inputNewHouse();
                break;
            case 3:
                inputNewRoom();
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

    public static void inputNewVilla() {
        boolean checkRegex=false;
        String nameVilla = null;
        while (!checkRegex) {
            System.out.println("Input name villa:");
            nameVilla = scanner.next();
            checkRegex = nameVilla.matches(REGEX_NAMEOFSERVICES);
        }
        checkRegex = false;
        String areaVilla = null;
        while (!checkRegex) {
            System.out.println("Input area:");
            areaVilla = scanner.next();
            checkRegex = areaVilla.matches(REGEX_AREA);
        }
        checkRegex = false;
        String priceVilla = null;
        while (!checkRegex) {
            System.out.println("Input price:");
            priceVilla = scanner.next();
            checkRegex = priceVilla.matches(REGEX_PRICE);
        }
        checkRegex = false;
        String maxMembersVilla = null;
        while (!checkRegex) {
            System.out.println("Input max of member:");
            maxMembersVilla = scanner.next();
            checkRegex = maxMembersVilla.matches(REGEX_MAXMEMBER);
        }
        checkRegex = false;
        String rentalTypeVilla = null;
        while (!checkRegex) {
            System.out.println("Input rental type:");
            rentalTypeVilla = scanner.next();
            checkRegex = rentalTypeVilla.matches(REGEX_RENTALTYPE);
        }
        checkRegex = false;
        String typeRoomVilla = null;
        while (!checkRegex) {
            System.out.println("Input type room:");
            typeRoomVilla = scanner.next();
            checkRegex = typeRoomVilla.matches(REGEX_TYPEROOM);
        }
        checkRegex = false;
        String ortherAmenitiesVilla = null;
        while (!checkRegex) {
            System.out.println("Input other amenities:");
            ortherAmenitiesVilla = scanner.next();
            checkRegex = ortherAmenitiesVilla.matches(REGEX_SERVIVICEACCOMPANNIED);
        }
        checkRegex = false;
        String areaSwimVilla = null;
        while (!checkRegex) {
            System.out.println("Input area of swimming pool:");
            areaSwimVilla = scanner.next();
            checkRegex = areaSwimVilla.matches(REGEX_AREA);
        }
        checkRegex = false;
        String numberFloorsVilla = null;
        while (!checkRegex) {
            System.out.println("Input number of floor:");
            numberFloorsVilla = scanner.next();
            checkRegex=numberFloorsVilla.matches(REGEX_NUMBEROFFLOOR);
        }
        StringBuilder inForVilla = new StringBuilder();
        inForVilla.append(nameVilla).append(COMMON).append(areaVilla).append(COMMON).append(priceVilla).append(COMMON).append(maxMembersVilla).append(COMMON);
        inForVilla.append(rentalTypeVilla).append(COMMON).append(typeRoomVilla).append(COMMON).append(ortherAmenitiesVilla).append(COMMON).append(areaSwimVilla).append(COMMON).append(numberFloorsVilla);
        try {
            FileWriter outputStreamVilla = new FileWriter(villaFile, true);
            BufferedWriter bufferedWriterVilla = new BufferedWriter(outputStreamVilla);
            bufferedWriterVilla.write(inForVilla.toString());
            bufferedWriterVilla.write("\n");
            bufferedWriterVilla.flush();
            bufferedWriterVilla.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addNewServices();
    }

    public static void inputNewHouse() {
        boolean checkRegex = false;
        String nameHouse = null;
        while (!checkRegex) {
            System.out.println("Input name:");
            nameHouse = scanner.next();
            checkRegex = nameHouse.matches(REGEX_NAMEOFSERVICES);
        }
        checkRegex=false;
        String areaHouse = null;
        while (!checkRegex) {
            System.out.println("Input area:");
            areaHouse = scanner.next();
            checkRegex = areaHouse.matches(REGEX_AREA);
        }
        checkRegex = false;
        String priceHouse = null;
        while (!checkRegex) {
            System.out.println("Input price:");
            priceHouse = scanner.next();
            checkRegex = priceHouse.matches(REGEX_PRICE);
        }
        checkRegex = false;
        String maxMembersHouse = null;
        while (!checkRegex) {
            System.out.println("Input max of member:");
            maxMembersHouse = scanner.next();
            checkRegex = maxMembersHouse.matches(REGEX_MAXMEMBER);
        }
        checkRegex = false;
        String rentalTypeHouse = null;
        while (!checkRegex) {
            System.out.println("Input rental type:");
            rentalTypeHouse = scanner.next();
            checkRegex = rentalTypeHouse.matches(REGEX_RENTALTYPE);
        }
        checkRegex = false;
        String typeRoomHouse = null;
        while (!checkRegex) {
            System.out.println("Input type room:");
            typeRoomHouse = scanner.next();
            checkRegex = typeRoomHouse.matches(REGEX_TYPEROOM);
        }
        checkRegex = false;
        String ortherAmenitiesHouse = null;
        while (!checkRegex) {
            System.out.println("Input other amenities:");
            ortherAmenitiesHouse = scanner.next();
            checkRegex = ortherAmenitiesHouse.matches(REGEX_SERVIVICEACCOMPANNIED);
        }
        checkRegex = false;
        String numberFloorsHouse = null;
        while (!checkRegex) {
            System.out.println("Input number of floor:");
            numberFloorsHouse = scanner.next();
            checkRegex = numberFloorsHouse.matches(REGEX_NUMBEROFFLOOR);
        }
        StringBuilder inForHouse = new StringBuilder();
        inForHouse.append(nameHouse).append(COMMON).append(areaHouse).append(COMMON).append(priceHouse).append(COMMON).append(maxMembersHouse).append(COMMON);
        inForHouse.append(rentalTypeHouse).append(COMMON).append(typeRoomHouse).append(COMMON).append(ortherAmenitiesHouse).append(COMMON).append(numberFloorsHouse);
        try {
            FileWriter outputStreamHouse = new FileWriter(houseFile, true);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(outputStreamHouse);
            bufferedWriterHouse.write(inForHouse.toString() + "\n");
            bufferedWriterHouse.flush();
            bufferedWriterHouse.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addNewServices();
    }

    public static void inputNewRoom() {
        boolean checkRegex = false;
        String nameRoom = null;
        while (!checkRegex) {
            System.out.println("Input name:");
            nameRoom = scanner.next();
            checkRegex = nameRoom.matches(REGEX_NAMEOFSERVICES);
        }
        checkRegex=false;
        String areaRoom = null;
        while (!checkRegex) {
            System.out.println("Input area:");
            areaRoom = scanner.next();
            checkRegex = areaRoom.matches(REGEX_AREA);
        }
        checkRegex = false;
        String priceRoom = null;
        while (!checkRegex) {
            System.out.println("Input price:");
            priceRoom = scanner.next();
            checkRegex = priceRoom.matches(REGEX_PRICE);
        }
        checkRegex = false;
        String maxMembersRoom = null;
        while (!checkRegex) {
            System.out.println("Input max of member:");
            maxMembersRoom = scanner.next();
            checkRegex = maxMembersRoom.matches(REGEX_MAXMEMBER);
        }
        checkRegex = false;
        String rentalTypeRoom = null;
        while (!checkRegex) {
            System.out.println("Input rental type:");
            rentalTypeRoom = scanner.next();
            checkRegex = rentalTypeRoom.matches(REGEX_RENTALTYPE);
        }
        checkRegex = false;
        String freeServicesRoom = null;
        while (!checkRegex) {
            System.out.println("Input Free Services:");
            freeServicesRoom = scanner.next();
            checkRegex = freeServicesRoom.matches(REGEX_SERVIVICEACCOMPANNIED);
        }
        StringBuilder inForRoom = new StringBuilder();
        inForRoom.append(nameRoom).append(COMMON).append(areaRoom).append(COMMON).append(priceRoom).append(COMMON).append(maxMembersRoom).append(COMMON);
        inForRoom.append(rentalTypeRoom).append(COMMON).append(freeServicesRoom);
        try {
            FileWriter outputStreamRoom = new FileWriter(roomFile, true);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(outputStreamRoom);
            bufferedWriterRoom.write(inForRoom.toString() + "\n");
            bufferedWriterRoom.flush();
            bufferedWriterRoom.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addNewServices();
    }
//-----------------------------------------------------------------------------------
    public static void showServies() {
        int chooseShowServices = 0;
        System.out.println("1.	Show all Villa"+
        "\n2.	Show all House"+
        "\n3.	Show all Room"+
        "\n4.	Show all Name Villa Not Duplicate"+
        "\n5.	Show all Name House Not Duplicate"+
        "\n6.	Show all All Name Name Not Duplicate"+
        "\n7.	Back to menu"+
        "\n8.	Exit");
        chooseShowServices = scanner.nextInt();
        switch (chooseShowServices) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showVillaNotDuplicate();
                break;
            case 5:
                showHouseNotDuplicate();
                break;
            case 6:
                showRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Not available!");
        }

    }

    public static void showAllVilla() {
        try {
            FileReader villaStream = new FileReader(villaFile);
            BufferedReader bufferedVillaInputStream = new BufferedReader(villaStream);
            List<Villa> villaList= new ArrayList<>();
            Villa villaTemp;
            String line;
            String[] temp;
            while ((line=bufferedVillaInputStream.readLine())!=null){
                temp=line.split(COMMON);
                villaTemp =new Villa(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5],temp[6],temp[7], parseInt(temp[8]));
                villaList.add(villaTemp);
            }

            int countVilla=0;
            System.out.println("All villa: ");
            System.out.println("-------------------------------");
            for (Villa villa:villaList){
                countVilla++;
                System.out.println("villa "+countVilla+" : ");
                villa.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showServies();
    }


    public static void showAllHouse() {
        try {
            FileReader houseStream = new FileReader(houseFile);
            BufferedReader bufferedHouseInputStream = new BufferedReader(houseStream);
            List<House> houseList= new ArrayList<>();
            House houseTemp;
            String line;
            String[] temp;
            while ((line=bufferedHouseInputStream.readLine())!=null){
                temp=line.split(COMMON);
                houseTemp =new House(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5],temp[6], parseInt(temp[7]));
                houseList.add(houseTemp);
            }

            int countHouse=0;
            System.out.println("All House: ");
            System.out.println("-------------------------------");
            for (House house:houseList){
                countHouse++;
                System.out.println("House "+countHouse+" : ");
                house.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showServies();
    }

    public static void showAllRoom() {
        try {
            FileReader roomStream = new FileReader(roomFile);
            BufferedReader bufferedHouseInputStream = new BufferedReader(roomStream);
            List<Room> roomList= new ArrayList<>();
            Room roomTemp;
            String line;
            String[] temp;
            while ((line=bufferedHouseInputStream.readLine())!=null){
                temp=line.split(COMMON);
                roomTemp =new Room(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5]);
                roomList.add(roomTemp);
            }

            int countRoom=0;
            System.out.println("All Room: ");
            System.out.println("-------------------------------");
            for (Room room:roomList){
                countRoom++;
                System.out.println("Room "+countRoom+" : ");
                room.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showServies();
    }
//-----------------------------------------------------------------------------------
    public static void addNewCustomer(){
        boolean checkRegex=false;
        String nameCustomer=null;
        while (!checkRegex) {
            try {
                System.out.println("Input name customer:");
                nameCustomer = scanner.next();
                checkRegex = nameCustomer.matches(REGEX_NAMECUSTOMER);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("write to the beginning of the capital letter");
            }
        }
        checkRegex=false;
        String birthday=null;
        while (!checkRegex) {
            try {
                System.out.println("Input birthday:");
                birthday = scanner.next();
                checkRegex = birthday.matches(REGEX_BIRTHDAY);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("The year of birth must be> 1900 and 18 years less than the current year, in the correct format dd / mm / yyyy");
            }
        }
        checkRegex=false;
        String cardID=null;
        while (!checkRegex) {
            try {
                System.out.println("Input card ID(cmnd):");
                cardID = scanner.next();
                checkRegex = cardID.matches(REGEX_CARD);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("The Id Card must have 9 digits and be in the format XXX XXX XXX");
            }
        }
        checkRegex=false;
        String gender=null;
        while (!checkRegex) {
            try {
                System.out.println("Input gender:");
                gender = scanner.next();
                checkRegex = gender.matches(REGEX_GENDER);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Illegal!");
            }
        }
        checkRegex=false;
        String phoneNumber=null;
        while (!checkRegex) {
            try {
                System.out.println("Input phone number:");
                phoneNumber = scanner.next();
                checkRegex = phoneNumber.matches(REGEX_PHONENUMBER);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Illegal!");
            }
        }
        checkRegex=false;
        String email=null;
        while (!checkRegex) {
            try {
                System.out.println("Input email:");
                email = scanner.next();
                checkRegex = email.matches(REGEX_EMAIL);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Email must be in the correct format abc@abc.abc");
            }
        }
        checkRegex=false;
        String typeCus=null;
        while (!checkRegex) {
            try {
                System.out.println("Input type customer:");
                typeCus = scanner.next();
                checkRegex = typeCus.matches(REGEX_TYPEROOM);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Ilegal!");
            }
        }

        System.out.println("Input address:");
        String address =scanner.next();

        System.out.println("Added!");
        try{
            FileWriter writerCus = new FileWriter(customerFile,true);
            BufferedWriter bufferedWriterCus =new BufferedWriter(writerCus);
            StringBuilder stringBuilderCus =new StringBuilder();
            stringBuilderCus.append(nameCustomer).append(COMMON).append(birthday).append(COMMON).append(cardID).append(COMMON);
            stringBuilderCus.append(phoneNumber).append(COMMON).append(email).append(COMMON).append(typeCus).append(COMMON).append(address);
            bufferedWriterCus.write(stringBuilderCus.toString()+"\n");
            bufferedWriterCus.flush();
            bufferedWriterCus.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        displayMainMenu();
    }
 //-----------------------------------------------------------------------------------
    public static void showInforCustomer(){
        try {
            FileReader customerStream = new FileReader(customerFile);
            BufferedReader bufferedReaderCustomer = new BufferedReader(customerStream);
            List<Customer> customerList= new ArrayList<>();
            Customer customerTemp;
            String line;
            String[] temp;
            while ((line=bufferedReaderCustomer.readLine())!=null){
                temp=line.split(COMMON);
                customerTemp =new Customer(temp[0],temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),temp[4],temp[5],temp[6]);
                customerList.add(customerTemp);
            }
            Collections.sort(customerList,new CustomerComparator());
            int countCustomer=0;
            System.out.println("All Customer: ");
            System.out.println("-------------------------------");
            for (Customer customer:customerList){
                countCustomer++;
                System.out.println("Customer "+countCustomer+" : ");
                customer.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }//-----------------------------------------------------------------------------------
    public static void addNewBooking(){
        int chooseBooking = 0;
        System.out.println("1.Booking Villa"+
        "\n2.Booking House"+
        "\n3.Booking Room"+
        "\n4.Back to Menu"+
        "\n5.Exit");
        chooseBooking = scanner.nextInt();
        switch (chooseBooking) {
            case 1:
                bookingVilla();
                break;
            case 2:
                bookingHouse();
                break;
            case 3:
                bookingRoom();
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

    public static void bookingVilla(){
        List<Villa> villaList= new ArrayList<>();
        try {
            FileReader villaStream = new FileReader(villaFile);
            BufferedReader bufferedVillaInputStream = new BufferedReader(villaStream);
            Villa villaTemp;
            String line;
            String[] temp;
            while ((line=bufferedVillaInputStream.readLine())!=null){
                temp=line.split(COMMON);
                villaTemp =new Villa(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5],temp[6],temp[7], parseInt(temp[8]));
                villaList.add(villaTemp);
            }
            int countVilla=0;
            System.out.println("All villa: ");
            System.out.println("-------------------------------");
            for (Villa villa:villaList){
                countVilla++;
                System.out.println("villa "+countVilla+" : ");
                villa.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean checkChooseVilla=false;
        System.out.println("Input name of villa you want: ");
        String chooseVilla=scanner.next();
        for (Villa villa:villaList){
            if (villa.getNameOfService().equals(chooseVilla)){
                checkChooseVilla=true;
                try{
                    FileWriter fileWriterBooked =new FileWriter(bookingFile,true);
                    BufferedWriter bufferedWriterBooked =new BufferedWriter(fileWriterBooked);
                    StringBuilder stringBuilderBookedVilla =new StringBuilder();
                    stringBuilderBookedVilla.append(villa.getNameOfService()).append(COMMON).append(villa.getArea()).append(COMMON).append(villa.getPrice()).append(COMMON).append(villa.getMaxMembers()).append(COMMON);
                    stringBuilderBookedVilla.append(villa.getRentalType()).append(COMMON).append(villa.getTypeRoom()).append(COMMON).append(villa.getOtherAmenities()).append(COMMON).append(villa.getAreaSwim()).append(COMMON).append(villa.getNumberFloors());
                    bufferedWriterBooked.write(stringBuilderBookedVilla.toString()+"\n");
                    bufferedWriterBooked.flush();
                    bufferedWriterBooked.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
                break;
            }
        }
        if (!checkChooseVilla){
            System.out.println("Villa not in villa list!");
        } else {
            System.out.println("Booked!");
        }
        addNewBooking();
    }

    public static void bookingHouse(){
        List<House> houseList= new ArrayList<>();
        try {
            FileReader houseStream = new FileReader(houseFile);
            BufferedReader bufferedHouseInputStream = new BufferedReader(houseStream);
            House houseTemp;
            String line;
            String[] temp;
            while ((line=bufferedHouseInputStream.readLine())!=null){
                temp=line.split(COMMON);
                houseTemp =new House(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5],temp[6], parseInt(temp[7]));
                houseList.add(houseTemp);
            }

            int countHouse=0;
            System.out.println("All House: ");
            System.out.println("-------------------------------");
            for (House house:houseList){
                countHouse++;
                System.out.println("House "+countHouse+" : ");
                house.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean chechChooseHouse=false;
        System.out.println("Input name of house you want: ");
        String chooseVilla=scanner.next();
        for (House house:houseList){
            if (house.getNameOfService().equals(chooseVilla)){
                chechChooseHouse=true;
                try{
                    FileWriter fileWriterBooked =new FileWriter(bookingFile,true);
                    BufferedWriter bufferedWriterBooked =new BufferedWriter(fileWriterBooked);
                    StringBuilder stringBuilderBookedVilla =new StringBuilder();
                    stringBuilderBookedVilla.append(house.getNameOfService()).append(COMMON).append(house.getArea()).append(COMMON).append(house.getPrice()).append(COMMON).append(house.getMaxMembers()).append(COMMON);
                    stringBuilderBookedVilla.append(house.getRentalType()).append(COMMON).append(house.getTypeRoom()).append(COMMON).append(house.getOtherAmenities()).append(COMMON).append(house.getNumberFloors());
                    bufferedWriterBooked.write(stringBuilderBookedVilla.toString()+"\n");
                    bufferedWriterBooked.flush();
                    bufferedWriterBooked.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
                break;
            }
        }
        if (!chechChooseHouse){
            System.out.println("House not in house list!");
        } else {
            System.out.println("Booked!");
        }
        addNewBooking();
    }

    public static void bookingRoom(){
        List<Room> roomList= new ArrayList<>();
        try {
            FileReader roomStream = new FileReader(roomFile);
            BufferedReader bufferedHouseInputStream = new BufferedReader(roomStream);
            Room roomTemp;
            String line;
            String[] temp;
            while ((line=bufferedHouseInputStream.readLine())!=null){
                temp=line.split(COMMON);
                roomTemp =new Room(temp[0],temp[1], parseInt(temp[2]), parseInt(temp[3]),temp[4],temp[5]);
                roomList.add(roomTemp);
            }

            int countRoom=0;
            System.out.println("All Room: ");
            System.out.println("-------------------------------");
            for (Room room:roomList){
                countRoom++;
                System.out.println("Room "+countRoom+" : ");
                room.showInfor();
                System.out.println("-------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean checkRoomBooked=false;
        System.out.println("Input name of Room you want: ");
        String chooseRoom=scanner.next();
        for (Room room:roomList){
            if (room.getNameOfService().equals(chooseRoom)){
                checkRoomBooked=true;
                try{
                    FileWriter fileWriterBooked =new FileWriter(bookingFile,true);
                    BufferedWriter bufferedWriterBooked =new BufferedWriter(fileWriterBooked);
                    StringBuilder stringBuilderBookedVilla =new StringBuilder();
                    stringBuilderBookedVilla.append(room.getNameOfService()).append(COMMON).append(room.getArea()).append(COMMON).append(room.getPrice()).append(COMMON).append(room.getMaxMembers()).append(COMMON);
                    stringBuilderBookedVilla.append(room.getRentalType()).append(COMMON).append(room.getFreeService());
                    bufferedWriterBooked.write(stringBuilderBookedVilla.toString()+"\n");
                    bufferedWriterBooked.flush();
                    bufferedWriterBooked.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
                break;
            }
        }
        if (!checkRoomBooked){
            System.out.println("Room not in room list!");
        } else {
            System.out.println("Booked!");
        }
        addNewBooking();
    }
//-------------------------------------------------------------------------------------------------
    public static void showVillaNotDuplicate(){
        TreeSet<String> nameVilla= new TreeSet<>();
        try{
            FileReader fileReaderVilla =new FileReader(villaFile);
            BufferedReader bufferedReaderVilla =new BufferedReader(fileReaderVilla);
            String line;
            String[] temp;
            while ((line=bufferedReaderVilla.readLine())!=null){
                temp=line.split(COMMON);
                boolean checkDuplicate =false;
                for (String villa:nameVilla){
                    if (temp[0].equals(villa)){
                        checkDuplicate =true;
                        break;
                    }
                }
                if (!checkDuplicate){
                    nameVilla.add(temp[0]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Iterator<String> iteratorteNameVilla =nameVilla.iterator();
        System.out.println("List name Villa not duplicate and sort: ");
        while (iteratorteNameVilla.hasNext()){
            System.out.println(iteratorteNameVilla.next());
        }
        showServies();
    }

    public static void showHouseNotDuplicate(){
        TreeSet<String> nameHouse= new TreeSet<>();
        try{
            FileReader fileReaderHouse =new FileReader(houseFile);
            BufferedReader bufferedReaderHouse =new BufferedReader(fileReaderHouse);
            String line;
            String[] temp;
            while ((line=bufferedReaderHouse.readLine())!=null){
                temp=line.split(COMMON);
                boolean checkDuplicate =false;
                for (String house:nameHouse){
                    if (temp[0].equals(house)){
                        checkDuplicate =true;
                        break;
                    }
                }
                if (!checkDuplicate){
                    nameHouse.add(temp[0]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Iterator<String> iteratorteNameHouse =nameHouse.iterator();
        System.out.println("List name House not duplicate and sort: ");
        while (iteratorteNameHouse.hasNext()){
            System.out.println(iteratorteNameHouse.next());
        }
        showServies();
    }

    public static void showRoomNotDuplicate(){
        TreeSet<String> nameRoom= new TreeSet<>();
        try{
            FileReader fileReaderRoom =new FileReader(roomFile);
            BufferedReader bufferedReaderRoom =new BufferedReader(fileReaderRoom);
            String line;
            String[] temp;
            while ((line=bufferedReaderRoom.readLine())!=null){
                temp=line.split(COMMON);
                boolean checkDuplicate =false;
                for (String room:nameRoom){
                    if (temp[0].equals(room)){
                        checkDuplicate =true;
                        break;
                    }
                }
                if (!checkDuplicate){
                    nameRoom.add(temp[0]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Iterator<String> iteratorteNameRoom =nameRoom.iterator();
        System.out.println("List name Room not duplicate and sort: ");
        while (iteratorteNameRoom.hasNext()){
            System.out.println(iteratorteNameRoom.next());
        }
        showServies();
    }
//---------------------------------------------------------------------------------------
    public static void showInforEmployee(){
        Map<Integer,Employee> inforEmployee= new HashMap<>();
        try {
            FileReader fileReaderEmployee =new FileReader(employeeFile);
            BufferedReader bufferedReaderEmployee= new BufferedReader(fileReaderEmployee);
            int countEmployee = 0;
            String[] temp;
            Employee employeeTemp;
            String line ;
            while ((line=bufferedReaderEmployee.readLine())!=null){
                countEmployee++;
                temp=line.split(COMMON);
                employeeTemp=new Employee(temp[0],Integer.parseInt(temp[1]),temp[2]);
                inforEmployee.put(countEmployee,employeeTemp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        for (Map.Entry<Integer,Employee> entry:inforEmployee.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        displayMainMenu();
    }
//----------------------------------------------------------------------------------------------
    public static void searchEmployee(){
        Stack<Employee> employees= new Stack<>();
        System.out.println("Input name employee: ");
        String employeeSearch=scanner.next();
        try {
            FileReader fileReaderEmployee =new FileReader(employeeFile);
            BufferedReader bufferedReaderEmployee= new BufferedReader(fileReaderEmployee);
            String[] temp;
            Employee employeeTemp;
            String line ;
            while ((line=bufferedReaderEmployee.readLine())!=null){
                temp=line.split(COMMON);
                employeeTemp=new Employee(temp[0],Integer.parseInt(temp[1]),temp[2]);
                employees.push(employeeTemp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        boolean checkEmployee=false;
        Employee employeeSearched=new Employee();
        while (!employees.isEmpty()){
            employeeSearched=employees.pop();
            if (employeeSearch.equals(employeeSearched.getName())){
                checkEmployee=true;
                break;
            }
        }
        if (!checkEmployee){
            System.out.println("Employee not in employee list!");
        } else {
            System.out.println(employeeSearched);
        }
        displayMainMenu();
    }
//----------------------------------------------------------------------------------------
    public static void checkCinema4D(){
        int chooseCinema = 0;
        System.out.println("1.Check list ciname4D." +
                "\n2.Book tickets." +
                "\n3.Back to Menu." +
                "\n4.Exit.");
        chooseCinema = scanner.nextInt();
        switch (chooseCinema) {
            case 1:
                checkListCinema();
                break;
            case 2:
                bookTickets();
                break;
            case 3:
                displayMainMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Not available!");
        }
    }

    public static void checkListCinema(){
        System.out.println("List name customer booked ticket(sorted FIFO): ");
        Queue<String> listCinema=new ArrayDeque<>();
        try{
            FileReader fileReader =new FileReader(cinemaFile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                listCinema.add(line);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        for (String name:listCinema){
            System.out.println(name);
        }
        checkCinema4D();
    }

    public static void bookTickets(){
        System.out.println("Input your name: ");
        String booking= scanner.next();
        try{
            FileWriter fileWriter =new FileWriter(cinemaFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("\n"+booking);
            System.out.println("Booked!");
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        checkListCinema();
    }
}
