package dao.mat_bang;

import model.MatBang;

import java.util.List;

public interface MatBangDao {
    boolean themMoiMatBang(MatBang matBang);
    List<MatBang> tatCaMatBang();
    List<MatBang> timVanPhong(String loaiVanPhong);
    List<MatBang> timSoTang(String soTang);
    List<MatBang> timGia(String gia);
    List<MatBang> timBaDieuKien(String loaiVanPhong,String soTang,String gia);
    boolean xoaBangMa(String maXoa);

}
