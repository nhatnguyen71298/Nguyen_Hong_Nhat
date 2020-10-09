package bo.catelory;

import dao.catelory.CateloryDaoImpl;
import model.TypeCatelory;

import java.util.List;

public class CateloryServiceImpl implements CateloryService {

    CateloryDaoImpl cateloryDao=new CateloryDaoImpl();
    @Override
    public List<TypeCatelory> allCatelory() {
        return this.cateloryDao.allCatelory();
    }
}
