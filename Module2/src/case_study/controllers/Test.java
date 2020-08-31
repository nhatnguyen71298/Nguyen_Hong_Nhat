package case_study.controllers;

public class Test {
        public static final String REGEX_CODE = "^SV(VL|HO|RO)-\\d{4}$";
        static final String REGEX_NAMEOFSERVICES="^[A-Z]{1}\\w+$";
    static final String REGEX_AREA="^([0-9]|1[0-9]|2[0-9]),([0-9]|[1-8][0-9]|9[0-9])$";
    static final String REGEX_PRICE="^[1-9][0-9]*$";
    static final String REGEX_MAXMEMBER="([1-9]|1[0-9])";
    static final String REGEX_BIRTHDAY="^\\d{2}/\\d{2}/\\d{4}$";
    static final String REGEX_NAMECUS="^([A-Z][a-z]+\\s?)+$";
    static final String REGEX_EMAIL="^\\w+@\\w+.\\w+$";
    static final String REGEX_GENDER="^([Mm][Aa][Ll][E|e])|([F|f][E|e][M|m][A|a][L|l][E|e])|([U|u][N|n][K|k][N|n][O|o][W|w])$";



    public static void main(String[] args) {
            String test="UnKnoW";

            System.out.println(test.matches(REGEX_GENDER));
        }
}
