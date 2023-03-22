import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DangNhap {
    public String dangnhap(String email, String password){
        String loi = "k co loi";
        EmailValidator gmail = new EmailValidator();
        if(email == ""){
            loi = "Vui long nhap email vao";
        }else if(gmail.validate(email)==false){
            loi = "Email khong hop le";
        }else if(password == ""){
            loi = "Vui long nhap password vao";
        }
        return loi;
    }
    public class EmailValidator {
        private static Pattern pattern;

        private Matcher matcher;

        private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường

        public EmailValidator() {
            pattern = Pattern.compile(EMAIL_PATTERN);
        }

        // Class kiểm định dạng email
        public boolean validate(final String hex) {

            matcher = pattern.matcher(hex);
            return matcher.matches();

        }
    }
}
