import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DangKy {
    public  String  dangky(String Ho, String ten, String email, String sdt, String password)  {
        String loi;
        EmailValidator gmail  = new EmailValidator();
        if(Ho == "" || Ho.length()>25){
           loi = "Please Fill out this filed";
        }
        else if(ten == "" || ten.length()>25){
          loi = "Please Fill out this filed" ;
        }
        else if (email ==""){
            loi = "Please Fill out this filed" ;
        }else if(gmail.validate(email)==false){
            loi = "Email khong hop le";
        }
        else if(sdt == ""){
             loi = "Please Fill out this filed" ;
         }
        else if(password == "") {
            loi = "Please Fill out this filed";
        } else {
            loi = "k co loi";
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
