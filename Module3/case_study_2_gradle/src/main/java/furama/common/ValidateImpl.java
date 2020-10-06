package furama.common;

public class ValidateImpl implements Validate{
    String REGEX_NAMECUSTOMER="^KH-[\\d]{4}$";
    String REGEX_NAMEEMPLOYEE="^NV-[\\d]{4}$";
    String REGEX_NAMESERVICE="^DV-[\\d]{4}$";
    String REGEX_PHONE_NUMBER="^(090|091|8490|8491)[\\d]{6}$";
    String REGEX_CMND="^[\\d]{9,10}$";
    String REGEX_EMAIL="^[\\w]+[@\\w]+[.\\w]+$";
    String REGEX_NUMBER="^[\\d]+$";

    @Override
    public boolean validateNumber(String number) {
        if (number.matches(REGEX_NUMBER)){
            if (Integer.parseInt(number)>0)
                    return true;
        }
        return false;
    }

    @Override
    public boolean validateNumber(int number) {
        if (number>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }

    @Override
    public boolean validateCMND(String cmnd) {
        return cmnd.matches(REGEX_CMND);
    }

    @Override
    public boolean validateEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }

    @Override
    public boolean validateNameCustomer(String nameCustomer) {
        return nameCustomer.matches(REGEX_NAMECUSTOMER);
    }

    @Override
    public boolean validateNameService(String nameService) {
        return nameService.matches(REGEX_NAMESERVICE);
    }
    @Override
    public boolean validateNameEmployee(String nameEmployee) {
        return nameEmployee.matches(REGEX_NAMEEMPLOYEE);
    }
}
