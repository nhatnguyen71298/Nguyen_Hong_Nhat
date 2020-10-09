package dao.catelory;

import dao.BaseDao;
import model.TypeCatelory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CateloryDaoImpl implements CateloryDao {

    BaseDao baseDao=new BaseDao();

    @Override
    public List<TypeCatelory> allCatelory() {
        List<TypeCatelory> typeCateloryList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from type_catelory ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id_type_catelory");
                String name = resultSet.getString("name_type_catelory");
                TypeCatelory typeCatelory=new TypeCatelory(id,name);
                typeCateloryList.add(typeCatelory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeCateloryList;
    }
}
