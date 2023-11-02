package PZ_17;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try {
            String a = s.nextLine();
            String[] a1 = a.split(" ");

            if(a1.length != 3){
                throw new IllegalArgumentException("Строка должна содержать <число оператор число>");
            }

            double oper1 = Double.parseDouble(a1[0]);
            String operator = a1[1];
            double oper2 = Double.parseDouble(a1[2]);

            double result;

            if(operator.equals("+")){
                result = oper1 + oper2;
            }else if(operator.equals("-")){
                result = oper1 - oper2;
            }else if(operator.equals("*")){
                result = oper1 * oper2;
            }else if(operator.equals("/")){
                if(oper1 == 0 || oper2 == 0){
                    throw new ArithmeticException("Division by zero");
                }
                result = oper1/oper2;
            }else{
                throw new IllegalArgumentException("Operation Error!");
            }
            System.out.println("Рузультат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        }catch (ArithmeticException e){
            System.out.println("Ошибка, " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Ошибка, " + e.getMessage());
        }
    }
}
