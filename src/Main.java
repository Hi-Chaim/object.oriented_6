import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Main {
        public static void main(String[] args) {
            double ans = 0;
            String[] operators ={"+", "-", "*", "/", "^", "sqrt"};
            String operator = null;
            double num1 = 0;
            double num2 = 0;
            String str;
            String[] arr;
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            if (str.equals("clear")) {
                arr=null;
                str = scanner.next();
            }
            for (int i = 0; i < operators.length; i++) {
                if (str.contains(operators[i])) {
                    operator = operators[i];
                    arr = str.split(Pattern.quote(operator));
                    if (operator.equals("sqrt")) {
                        num1 = Double.parseDouble(arr[1]);
                    }
                    else {
                        num1 = Double.parseDouble(arr[0]);
                        num2 = Double.parseDouble(arr[1]);
                    }
                    switch (operator) {
                        case "+":
                            ans = add(num1, num2);
                            break;
                        case "-":
                            ans = sub(num1, num2);
                            break;
                        case "*":
                            ans = mul(num1, num2);
                            break;
                        case "/":
                            try {
                                ans = div(num1, num2);
                            } catch (Exception e) {
                                System.out.println("can not divide by zero");
                            }
                            break;
                        case "^":
                            ans = pow(num1, num2);
                            break;
                        case "sqrt":
                            ans = sqrt(num1);

                    }
                }
            }
            System.out.println("the answer is:" + ans);
        }
        public static double add(double x, double y) {return x+y;}
        public static double sub(double x, double y) {return x-y;}
        public static double mul(double x, double y){return x*y;}
        public static double div(double x, double y) throws Exception {
            if (y==0){throw new Exception("ERROR! can not divide by zero");}
            return x/y;
        }
        public static double pow(double x, double y) {return Math.pow(x,y);}
        public static double sqrt(double x){return Math.sqrt(x);}
    }
