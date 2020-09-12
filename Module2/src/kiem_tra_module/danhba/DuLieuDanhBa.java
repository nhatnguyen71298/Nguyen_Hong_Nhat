package kiem_tra_module.danhba;

import java.io.*;
import java.util.*;

public class DuLieuDanhBa {
    static Scanner scanner = new Scanner(System.in);
    String soDienThoai;
    String nhomDanhBa;
    String hoVaTen;
    String gioiTinh;
    String diaChi;
    String ngaySinh;
    String email;
    static final String REGEX_EMAIL="^\\w+@\\w+.\\w+$";
    static final String REGEX_SODIENTHOAI="^\\d{10}$";
    static File danhSachNguoiDung = new File("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\kiem_tra_module\\dulieu\\contacts.csv");
    public static final String COM_MOM = ",";

    public DuLieuDanhBa() {
    }

    public DuLieuDanhBa(String soDienThoai, String nhomDanhBa, String hoVaTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomDanhBa = nhomDanhBa;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//-----------------------------------------------------------------------------------------
public static void hienThiDanhBa(){
    DuLieuDanhBa dataTemp;
    List<DuLieuDanhBa> dataList=new ArrayList<>();
    try {
        FileReader fileReader =new FileReader(danhSachNguoiDung);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line="";
        String[] temp;
        while ((line=bufferedReader.readLine())!=null){
            temp=line.split(COM_MOM);
            dataTemp=new DuLieuDanhBa(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
            dataList.add(dataTemp);
        }
        bufferedReader.close();
    } catch (IOException e){
        e.printStackTrace();
    }
    for (DuLieuDanhBa data: dataList) {
        System.out.println(data);
    }
}
//-----------------------------------------------------------------------------------------
    public static void themNguoiDung() {
        String soDienThoai = null;
        String nhomDanhBa;
        String hoVaTen;
        String gioiTinh;
        String diaChi;
        String ngaySinh;
        String email = null;
        boolean regex=false;
        while (!regex){
        System.out.println("Nhập số điện thoại: ");
        soDienThoai = scanner.next();
        regex=soDienThoai.matches(REGEX_SODIENTHOAI);
        }
        System.out.println("Nhập nhóm danh ba: ");
        nhomDanhBa = scanner.next();
        System.out.println("Nhập họ tên: ");
        hoVaTen = scanner.next();
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.next();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.next();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = scanner.next();
        regex=false;
        while (!regex){
        System.out.println("Nhập email: ");
        email = scanner.next();
        regex=email.matches(REGEX_EMAIL);
        }
        saveData(soDienThoai,nhomDanhBa,hoVaTen,gioiTinh,diaChi,ngaySinh,email);
    }
//----------------------------------------------------------------------------------
    public static void saveData(String sodienthoai, String nhomDanhBa, String hoVaTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        System.out.println("Đã lưu");
        try {
            FileWriter fileWriter = new FileWriter(danhSachNguoiDung, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilderNew = new StringBuilder();
            stringBuilderNew.append(sodienthoai).append(COM_MOM).append(nhomDanhBa).append(COM_MOM).append(hoVaTen).append(COM_MOM).append(gioiTinh).append(COM_MOM).append(diaChi).append(COM_MOM).append(ngaySinh).append(COM_MOM).append(email);
            bufferedWriter.write(stringBuilderNew.toString() + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//---------------------------------------------------------------------------------------
public static void capNhatDanhBa(){
    System.out.println("Nhập Số điện thoai muốn cập nhật");
    String soCapNhat=scanner.next();
    try {
        FileReader fileReader =new FileReader(danhSachNguoiDung);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line="";
        String[] temp;
        boolean checkData =false;
//  Không thêm vào data list phần tử cần xóa.
        while ((line=bufferedReader.readLine())!=null){
            temp=line.split(COM_MOM);
            if (soCapNhat.equals(temp[0])){
                checkData=true;
            }
        }
        bufferedReader.close();
        if (!checkData){
            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
        } else {
            xoaNguoiDung(soCapNhat);
            String nhomDanhBa;
            String hoVaTen;
            String gioiTinh;
            String diaChi;
            String ngaySinh;
            String email = null;
            boolean regex=false;
            System.out.println("Nhập nhóm danh ba: ");
            nhomDanhBa = scanner.next();
            System.out.println("Nhập họ tên: ");
            hoVaTen = scanner.next();
            System.out.println("Nhập giới tính: ");
            gioiTinh = scanner.next();
            System.out.println("Nhập địa chỉ: ");
            diaChi = scanner.next();
            System.out.println("Nhập ngày sinh: ");
            ngaySinh = scanner.next();
            regex=false;
            while (!regex){
                System.out.println("Nhập email: ");
                email = scanner.next();
                regex=email.matches(REGEX_EMAIL);
            }
            saveData(soCapNhat,nhomDanhBa,hoVaTen,gioiTinh,diaChi,ngaySinh,email);
        }
        bufferedReader.close();
    } catch (IOException e){
        e.printStackTrace();
    }
}
//---------------------------------------------------------------------------------------
    public static void xoaNguoiDung(String soDienThoaiXoa){
        List<DuLieuDanhBa> dataList =new LinkedList<>();
        DuLieuDanhBa dataTemp;
        try {
            FileReader fileReader =new FileReader(danhSachNguoiDung);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line="";
            String[] temp;
            boolean checkData =false;
//  Không thêm vào data list phần tử cần xóa.
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(COM_MOM);
                dataTemp=new DuLieuDanhBa(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
                if (soDienThoaiXoa.equals(temp[0])){
                    checkData=true;
                    System.out.println(dataTemp.getSoDienThoai()+"----> Đã xóa.");
                } else {
                    dataList.add(dataTemp);
                }
            }
            bufferedReader.close();
            if (!checkData){
                System.out.println("Số điện thoại này không có trong danh sách!");
            } else {
                FileWriter fileWriter =new FileWriter(danhSachNguoiDung);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                for (DuLieuDanhBa data:dataList){
                    StringBuilder stringBuilderNew = new StringBuilder();
                    stringBuilderNew.append(data.getSoDienThoai()).append(COM_MOM).append(data.getNhomDanhBa()).append(COM_MOM).append(data.getHoVaTen()).append(COM_MOM).append(data.getGioiTinh()).append(COM_MOM).append(data.getDiaChi()).append(COM_MOM).append(data.getNgaySinh()).append(COM_MOM).append(data.getEmail());
                    bufferedWriter.write(stringBuilderNew.toString()+"\n");
                }
                bufferedWriter.close();
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------
public static void timSoDienThoaiTheoSo(){
    Stack<DuLieuDanhBa> soDienThoai= new Stack<>();
    System.out.println("Nhập số muốn tìm: ");
    String soDienThoaiTim=scanner.next();
    try {
        FileReader fileReaderEmployee =new FileReader(danhSachNguoiDung);
        BufferedReader bufferedReaderEmployee= new BufferedReader(fileReaderEmployee);
        String[] temp;
        DuLieuDanhBa soDienThoaiTemp;
        String line ;
        while ((line=bufferedReaderEmployee.readLine())!=null){
            temp=line.split(COM_MOM);
            soDienThoaiTemp=new DuLieuDanhBa(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
            soDienThoai.push(soDienThoaiTemp);
        }
    } catch (IOException e){
        e.printStackTrace();
    }
    boolean kiemTraSoDienThoai=false;
    DuLieuDanhBa nguoiDungDaTim=new DuLieuDanhBa();
    while (!soDienThoai.isEmpty()){
        nguoiDungDaTim=soDienThoai.pop();
        if (soDienThoaiTim.equals(nguoiDungDaTim.getSoDienThoai())){
            kiemTraSoDienThoai=true;
            break;
        }
    }
    if (!kiemTraSoDienThoai){
        System.out.println("Số điện thoại này không có trong danh sách!");
    } else {
        System.out.println(nguoiDungDaTim);
    }
}

    public static void timSoDienThoaiTheoTen(){
        Stack<DuLieuDanhBa> nguoiDung= new Stack<>();
        System.out.println("Nhập tên người dùng muốn tìm: ");
        String tenNguoiDung=scanner.next();
        try {
            FileReader fileReaderEmployee =new FileReader(danhSachNguoiDung);
            BufferedReader bufferedReaderEmployee= new BufferedReader(fileReaderEmployee);
            String[] temp;
            DuLieuDanhBa nguoiDungTemp;
            String line ;
            while ((line=bufferedReaderEmployee.readLine())!=null){
                temp=line.split(COM_MOM);
                nguoiDungTemp=new DuLieuDanhBa(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
                nguoiDung.push(nguoiDungTemp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        boolean kiemTraSoDienThoai=false;
        DuLieuDanhBa nguoiDungDaTim=new DuLieuDanhBa();
        while (!nguoiDung.isEmpty()){
            nguoiDungDaTim=nguoiDung.pop();
            if (tenNguoiDung.equals(nguoiDungDaTim.getHoVaTen())){
                kiemTraSoDienThoai=true;
                break;
            }
        }
        if (!kiemTraSoDienThoai){
            System.out.println("Người dùng này không có trong danh sách!");
        } else {
            System.out.println(nguoiDungDaTim);
        }
    }
//----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "DanhBa{" +
                "soDienThoai='" + soDienThoai + '\'' +
                ", nhamDanhBa='" + nhomDanhBa + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

