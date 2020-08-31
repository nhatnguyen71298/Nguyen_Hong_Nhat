package string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameOfClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX =   "^[A,C,P][\\d]{4}[G, H, I, K, L, M]+$";

    public NameOfClass() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
