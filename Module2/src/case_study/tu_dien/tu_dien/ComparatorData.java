package case_study.tu_dien.tu_dien;

import java.util.Comparator;

public class ComparatorData implements Comparator<Data> {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.getVietmameseMean().compareTo(o2.getVietmameseMean());
    }
}
