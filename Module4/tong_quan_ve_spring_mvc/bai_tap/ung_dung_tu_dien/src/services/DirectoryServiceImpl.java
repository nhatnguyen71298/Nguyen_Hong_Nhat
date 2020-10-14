package services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Service
public class DirectoryServiceImpl implements DirectoryService {
        Map<String,String> dictionary= new LinkedHashMap<>();

    public void addDataToDictionary(){
        dictionary.put("red","Màu đỏ");
        dictionary.put("yellow","Màu vàng");
        dictionary.put("blue","Màu xanh dương");
        dictionary.put("green","Màu xanh lá");
        dictionary.put("pink","Màu hồng-bê đê");
        dictionary.put("black","Màu đen");
        dictionary.put("White","Màu trắng");
        dictionary.put("silver","Màu bạc");
        dictionary.put("orange","Màu cam");
    }

    @Override
    public String vietnamMean(String engMean) {
        addDataToDictionary();
        String result="Không có trong từ điền";
        for (Map.Entry<String,String> means:this.dictionary.entrySet()) {
            if (engMean.equals(means.getKey())){
                result=means.getValue();
            }
        }
        return result;
    }
}
