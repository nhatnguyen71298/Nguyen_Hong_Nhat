package common;

public class ValidateMatBangImpl implements ValidateMatBang {
    @Override
    public boolean validateMaMatBang(String ma) {
        return ma.matches("^(\\d|[A-Z]){3}-(\\d|[A-Z]){2}-(\\d|[A-Z]){2}$");
    }

    @Override
    public boolean validateGiaMatBang(String gia) {
        return gia.matches("^[1-9][\\d]{6,}$");
    }
}
