package string_and_regex.bai_tap.validate_so_dien_thoai;

public class TestPhoneNumber {
    private static PhoneNumber phoneNumberExample;
    public static final String[] validPhoneNumber = new String[] { "02-0786542543", "83-0565355694"};
    public static final String[] invalidPhoneNumber = new String[] { "aa-0876654625", "a2-0335987453", "46/0789632587","023-0354887634","68-3698412369","65-036974586" };

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumber();
        for (String phone : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is " + phone +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is  " + phone +" is valid: "+ isvalid);
        }
    }
}
