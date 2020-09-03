package case_study.tu_dien.tu_dien;

import java.io.*;
import java.util.*;

public class Data {
    public String vietmameseMean,EngMean,typeOfWord;
    public Scanner scanner= new Scanner(System.in);
    public File fileData= new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\case_study\\tu_dien\\data\\data.csv");
    public final String COM_MOM=",";
    public final String REGEX_MEAN="^[A-Z]{1}\\w+$";
    public final String REGEX_TYPEWORD="^(Verb|Adj|N)$";


    public Data(){

    }

    public Data(String vietNameseMean, String engMean, String typeOfWord) {
        this.vietmameseMean = vietNameseMean;
        EngMean = engMean;
        this.typeOfWord = typeOfWord;
    }

    public String getVietmameseMean() {
        return vietmameseMean;
    }

    public void setVietmameseMean(String vietmameseMean) {
        this.vietmameseMean = vietmameseMean;
    }

    public String getEngMean() {
        return EngMean;
    }

    public void setEngMean(String engMean) {
        EngMean = engMean;
    }

    public String getTypeOfWord() {
        return typeOfWord;
    }

    public void setTypeOfWord(String typeOfWord) {
        this.typeOfWord = typeOfWord;
    }
//-----------------------------------------------------------------------------------------
    public void displayDataList(){
        Data dataTemp;
        List<Data> dataList=new ArrayList<>();
        try {
            FileReader fileReader =new FileReader(fileData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] temp;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(COM_MOM);
                dataTemp=new Data(temp[0],temp[1],temp[2]);
                dataList.add(dataTemp);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        Collections.sort(dataList,new ComparatorData());
        for (Data data: dataList) {
            System.out.println(data);
        }
    }
//----------------------------------------------------------------------------------------------------
    public void saveData(String vietmameseMean,String engMean, String typeOfWord){
        try {
            FileReader fileReader =new FileReader(fileData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] temp;
            boolean checkSave =false;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(COM_MOM);
                if (vietmameseMean.equals(temp[0])||engMean.equals(temp[1])){
                    checkSave=true;
                    break;
                }
            }
            bufferedReader.close();
            if (checkSave){
                System.out.println("Từ này đã có trong từ điển!");
            } else {
                System.out.println("Đã lưu");
                FileWriter fileWriter= new FileWriter(fileData,true);
                BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
                StringBuilder stringBuilderNew= new StringBuilder();
                stringBuilderNew.append(vietmameseMean).append(COM_MOM).append(engMean).append(COM_MOM).append(typeOfWord);
                bufferedWriter.write(stringBuilderNew.toString()+"\n");
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------
    public void getData(){
        System.out.println("Nhập từ muốn tìm:");
        String mean =scanner.next();
        try {
            FileReader fileReader =new FileReader(fileData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] temp;
            boolean checkData =true;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(COM_MOM);
                if (mean.equals(temp[0])||mean.equals(temp[1])){
                    checkData=false;
                    Data data =new Data(temp[0],temp[1],temp[2]);
                    System.out.println(data.toString());
                    break;
                }
            }
            if (checkData){
                System.out.println("Từ này không có trong danh sách!");
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//-----------------------------------------------------------------------------------
    public void addNewData(){
        boolean checkRegex=false;
        String meanVietnamese="";
        while (!checkRegex) {
            try {
                System.out.println("Nhập nghĩa tiếng Việt:");
                meanVietnamese = scanner.next();
                checkRegex = meanVietnamese.matches(REGEX_MEAN);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Không hợp lệ!");
            }
        }
        checkRegex=false;
        String meanEng="";
        while (!checkRegex) {
            try {
                System.out.println("Nhập nghĩa Anh:");
                meanEng = scanner.next();
                checkRegex = meanEng.matches(REGEX_MEAN);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Không hợp lệ!");
            }
        }
        checkRegex=false;
        String typeWord="";
        while (!checkRegex) {
            try {
                System.out.println("Nhập loại từ:");
                typeWord = scanner.next();
                checkRegex = typeWord.matches(REGEX_TYPEWORD);
                if (!checkRegex) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Không hợp lệ!");
            }
        }
        saveData(meanVietnamese,meanEng,typeWord);
    }
//---------------------------------------------------------------------------------
    public void delData(){
        System.out.println("Nhập nghĩa của từ muốn xóa");
        String mean=scanner.next();
        List<Data> dataList =new LinkedList<>();
        Data dataTemp;
        try {
            FileReader fileReader =new FileReader(fileData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line="";
            String[] temp;
            boolean checkData =false;
//  Không thêm vào data list phần tử cần xóa.
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(COM_MOM);
                dataTemp=new Data(temp[0],temp[1],temp[2]);
                if (mean.equals(temp[0])||mean.equals(temp[1])){
                    checkData=true;
                } else {
                    dataList.add(dataTemp);
                }
            }
            bufferedReader.close();
            if (!checkData){
                System.out.println("Từ này không có trong danh sách!");
            } else {
                FileWriter fileWriter =new FileWriter(fileData);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                for (Data data:dataList){
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(data.getVietmameseMean()+COM_MOM+data.getEngMean()+COM_MOM+data.getTypeOfWord());
                    bufferedWriter.write(stringBuilder.toString()+"\n");
                }
                bufferedWriter.close();
                System.out.println("Đã xóa: "+mean);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//-----------------------------------------------------------------------------------
    public String getTypeWordInVietNam(){
        if (getTypeOfWord().equals("Verb")){
            return "động từ";
        } else if (getTypeOfWord().equals("N")){
            return "danh từ";
        } else {
            return "tính từ";
        }
    }
//-----------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Từ điển : {" +
                "Tiếng Việt ='" + vietmameseMean + '\'' +
                ", Tiếng Anh ='" + EngMean + '\'' +
                ", Loại từ ='" + typeOfWord + " ("+getTypeWordInVietNam()+")"+ '\'' +
                '}';
    }
}
