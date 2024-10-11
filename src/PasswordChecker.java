import java.util.*;
public class PasswordChecker {
    public static int checker(String s, int n) {
        if (n < 4) {
            return 0;
        }
        if (Character.isDigit(s.charAt(0))) {
            return 0;
        }
        int num = 0, cap = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '/') {
                return 0;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                cap++;
            }
            if (Character.isDigit(s.charAt(i))) {
                num++;
            }
            if (num > 0 && cap > 0) {
                return 1;
            }
        }
            return 0;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password : ");
            String pswd = sc.nextLine();
            int res = checker(pswd, pswd.length());
            if (res == 0) {
                System.out.println("your password is invalid");
            } else {
                System.out.println("Your password is valid");
            }

        }
    }

