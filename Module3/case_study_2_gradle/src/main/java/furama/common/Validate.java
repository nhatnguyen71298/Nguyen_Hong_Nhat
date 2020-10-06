package furama.common;

public interface Validate {
    boolean validateNameCustomer(String nameCustomer);
    boolean validateNameEmployee(String nameEmployee);
    boolean validateNameService(String nameService);
    boolean validatePhoneNumber(String phoneNumber);
    boolean validateCMND(String cmnd);
    boolean validateEmail(String email);
    boolean validateNumber(String number);
    boolean validateNumber(int number);
}
