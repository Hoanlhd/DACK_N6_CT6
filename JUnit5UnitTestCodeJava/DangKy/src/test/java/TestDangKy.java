import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDangKy {
    @Test
    public  void  testPremium()  {
        boolean test;
        DangKy demo1 = new DangKy();
        String result = demo1.dangky("Hua","An", "Hongan212003@gmail.com", "0909461549", "anhua2003");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertTrue(test);
    }

    @Test
    public  void  testPremium2()  {
        boolean test;
        DangKy demo1 = new DangKy();
        String result = demo1.dangky("","An", "", "0909461549", "anhua2003");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  testPremium3()  {
        boolean test;
        DangKy demo1 = new DangKy();
        String result = demo1.dangky("An", "An","Hongan212003gmail.com", "0909461549", "anhua2003");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  testPremium4()  {
        boolean test;
        DangKy demo1 = new DangKy();
        String result = demo1.dangky("An", "An","Hongan212003@gmail.com", "", "anhua2003");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  testPremium5()  {
        boolean test;
        DangKy demo1 = new DangKy();
        String result = demo1.dangky("Anàafaasdasdasdsadsdadasasdadadaasd", "An","Hongan212003@gmail.com", "0909461549", "anhua2003");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
}