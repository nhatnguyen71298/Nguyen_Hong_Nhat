package dao.mat_bang;

import dao.BaseDao;
import model.MatBang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangDaoImpl implements MatBangDao {

    BaseDao baseDao = new BaseDao();

    @Override
    public boolean themMoiMatBang(MatBang matBang) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement= this.baseDao.getConnection().prepareStatement("insert into mat_bang values (?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1,matBang.getMaMatBang());
            preparedStatement.setString(2,matBang.getTrangThai());
            preparedStatement.setString(3,matBang.getDienTich());
            preparedStatement.setString(4,matBang.getSoTang());
            preparedStatement.setString(5,matBang.getLoaiVanPhong());
            preparedStatement.setString(6,matBang.getGia());
            preparedStatement.setString(7,matBang.getNgayBatDau());
            preparedStatement.setString(8,matBang.getNgayKetThuc());

            int check=preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<MatBang> tatCaMatBang() {
        List<MatBang> matBangList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from mat_bang ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma");
                String dienTich = resultSet.getString("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                String soTang = resultSet.getString("so_tang");
                String loaiVanPhong = resultSet.getString("loai_mat_bang");
                String gia = resultSet.getString("gia");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                MatBang matBang =new MatBang(maMatBang,dienTich,trangThai,soTang,loaiVanPhong,gia,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public boolean xoaBangMa(String maXoa) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement= this.baseDao.getConnection().prepareStatement(
                    "delete from mat_bang"+
                            " where ma=?;"
            );
            preparedStatement.setString(1,maXoa);
            int check=preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<MatBang> timVanPhong(String loaiVanPhong) {
        List<MatBang> matBangList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from mat_bang where loai_mat_bang=? ;");
            preparedStatement.setString(1,loaiVanPhong);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma");
                String dienTich = resultSet.getString("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                String soTang = resultSet.getString("so_tang");
                String loaiVanPhongTim = resultSet.getString("loai_mat_bang");
                String gia = resultSet.getString("gia");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                MatBang matBang =new MatBang(maMatBang,dienTich,trangThai,soTang,loaiVanPhongTim,gia,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public List<MatBang> timSoTang(String soTang) {
        List<MatBang> matBangList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from mat_bang where so_tang=? ;");
            preparedStatement.setString(1,soTang);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma");
                String dienTich = resultSet.getString("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                String soTangTim = resultSet.getString("so_tang");
                String loaiVanPhong = resultSet.getString("loai_mat_bang");
                String gia = resultSet.getString("gia");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                MatBang matBang =new MatBang(maMatBang,dienTich,trangThai,soTangTim,loaiVanPhong,gia,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public List<MatBang> timGia(String gia) {
        List<MatBang> matBangList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from mat_bang where gia=? order by dien_tich;");
            preparedStatement.setString(1,gia);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma");
                String dienTich = resultSet.getString("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                String soTang = resultSet.getString("so_tang");
                String loaiVanPhong = resultSet.getString("loai_mat_bang");
                String giaTim = resultSet.getString("gia");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                MatBang matBang =new MatBang(maMatBang,dienTich,trangThai,soTang,loaiVanPhong,giaTim,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public List<MatBang> timBaDieuKien(String loaiVanPhong, String soTang, String gia) {
        List<MatBang> matBangList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from mat_bang where gia=? and so_tang=? and loai_mat_bang=? ;");
            preparedStatement.setString(1,gia);
            preparedStatement.setString(2,soTang);
            preparedStatement.setString(3,loaiVanPhong);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma");
                String dienTich = resultSet.getString("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                String soTangBaDieuKien = resultSet.getString("so_tang");
                String loaiVanPhongBaDieuKien = resultSet.getString("loai_mat_bang");
                String giaBaDieuKien = resultSet.getString("gia");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                MatBang matBang =new MatBang(maMatBang,dienTich,trangThai,soTangBaDieuKien,loaiVanPhongBaDieuKien,giaBaDieuKien,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;    }
}
