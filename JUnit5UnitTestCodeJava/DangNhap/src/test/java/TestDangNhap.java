import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestDangNhap {
    @Test
    public  void  TestDangNhap()  {
        boolean test;
        DangNhap demo1 = new DangNhap();
        String result = demo1.dangnhap("Hongan212003@gmail.com","An");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertTrue(test);
    }
    @Test
    public  void  TestDangNhap2()  {
        boolean test;
        DangNhap demo1 = new DangNhap();
        String result = demo1.dangnhap("Hongan212003gmail.com","An");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  TestDangNhap3()  {
        boolean test;
        DangNhap demo1 = new DangNhap();
        String result = demo1.dangnhap("Hongan212003@gmail.com","");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  TestDangNhap4()  {
        boolean test;
        DangNhap demo1 = new DangNhap();
        String result = demo1.dangnhap("Hongan212003@gmail","");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
    @Test
    public  void  TestDangNhap5()  {
        boolean test;
        DangNhap demo1 = new DangNhap();
        String result = demo1.dangnhap("","");
        if(result == "k co loi") {
            test = true;
        }else {
            test = false;
        }
        assertFalse(test);
    }
}
