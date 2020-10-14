package bo.mat_bang;

import common.ValidateMatBang;
import common.ValidateMatBangImpl;
import dao.mat_bang.MatBangDaoImpl;
import model.MatBang;

import java.util.List;

public class MatBangBOImpl implements MatBangBO {

    MatBangDaoImpl matBangDao=new MatBangDaoImpl();
    ValidateMatBangImpl validateMatBang=new ValidateMatBangImpl();

    @Override
    public boolean themMoiMatBang(MatBang matBang) {
        return this.matBangDao.themMoiMatBang(matBang);
    }

    @Override
    public String validatMatBang(MatBang matBang) {
        String messenger="";
        if (!(this.validateMatBang.validateMaMatBang(matBang.getMaMatBang()))){
            messenger="Nhap ten theo dinh dang XXX-XX-XX !\n";
        }
        if (!(this.validateMatBang.validateGiaMatBang(matBang.getGia()))){
           messenger+="Nhap gia lon hon 1000000!";
        }
        return messenger;
    }

    @Override
    public List<MatBang> tatCaMatBang() {
        return this.matBangDao.tatCaMatBang();
    }

    @Override
    public boolean xoaBangMa(String maXoa) {
        return this.matBangDao.xoaBangMa(maXoa);
    }

    @Override
    public List<MatBang> timVanPhong(String loaiVanPhong) {
        return this.matBangDao.timVanPhong(loaiVanPhong);
    }

    @Override
    public List<MatBang> timSoTang(String soTang) {
        return this.matBangDao.timSoTang(soTang);
    }

    @Override
    public List<MatBang> timGia(String gia) {
        return this.matBangDao.timGia(gia);
    }

    @Override
    public List<MatBang> timBaDieuKien(String loaiVanPhong, String soTang, String gia) {
        return this.matBangDao.timBaDieuKien(loaiVanPhong,soTang,gia);
    }
}
