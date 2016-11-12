package strassen;
public class Strassen {
    public static void main(String[] args) {
    int A00 = 1, A01 = 2, A10 = 3, A11 = 4, B00 = 5, B01 = 6, B10 = 7, B11 = 8;
    int M1, M2, M3, M4, M5, M6, M7;
    int C00,C01,C10,C11;
    
    
    M1 = (A00 + A11) * (B00 + B11);
    M2 = (A10+A11)* B00;
    M3 = A00 * (B01 - B11);
    M4 =  A11 * (B10 - B00);
    M5 = (A00 + A01) * B11;
    M6 = (A10 - A00) * (B00 + B01);
    M7 = (A01 - A11) * (B10 + B11);
    
    C00 = M1 + M4 - M5 + M7;
    C01 = M3 + M5;
    C10 = M2 + M4;
    C11 = M1 + M3 - M2 + M6;
    
        System.out.println(C00 + "  " + C01);
        System.out.println(C10 + "  " + C11);
    }
    
}