package case_study.resort_furama.commons.views.data.models;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getName().compareTo(o2.getName())>0){
            return 1;
        } else if (o1.getName().compareTo(o2.getName())<0){
            return -1;
        } else {
            return o1.getYearBirthday()-o2.yearBirthday;
        }
    }
}
