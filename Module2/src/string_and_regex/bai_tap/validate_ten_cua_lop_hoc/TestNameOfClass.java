package string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

public class TestNameOfClass {
    private static NameOfClass classExample;
    public static final String[] validClass = new String[] { "C0318G", "A5864L", "P4465M" };
    public static final String[] invalidClass = new String[] { "E6846G", "A48654H", "A878L","C3458P" };

    public static void main(String args[]) {
        classExample = new NameOfClass();
        for (String name : validClass) {
            boolean isvalid = classExample.validate(name);
            System.out.println("Name of class is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidClass) {
            boolean isvalid = classExample.validate(name);
            System.out.println("Name of class is  " + name +" is valid: "+ isvalid);
        }
    }
}
