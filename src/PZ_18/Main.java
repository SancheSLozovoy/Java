package PZ_18;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1 - Чтение из файла, 2 - Чтение с консоли: ");
        int n = s.nextInt();
        s.nextLine();
        String result = String.valueOf(0.0);
        switch(n){
            case 1:
                try {
                    File inputFile = new File("C:\\Users\\Student\\IdeaProjects\\Java\\src\\PZ_18\\input.txt");
                    s = new Scanner(inputFile);

                    if (s.hasNextLine()) {
                        String inputLine = s.nextLine();
                        String[] a1 = inputLine.split(" ");

                        if (a1.length != 3) {
                            throw new IllegalArgumentException("Строка должна содержать <число оператор число>");
                        }

                        double oper1 = Double.parseDouble(a1[0]);
                        String operator = a1[1];
                        double oper2 = Double.parseDouble(a1[2]);

                        if (operator.equals("+")) {
                            result = Double.toString(oper1 + oper2);
                        } else if (operator.equals("-")) {
                            result = Double.toString(oper1 - oper2);
                        } else if (operator.equals("*")) {
                            result = Double.toString(oper1 * oper2);
                        } else if (operator.equals("/")) {
                            if (oper1 == 0 || oper2 == 0) {
                                throw new ArithmeticException("Division by zero");
                            }
                            result = Double.toString(oper1 / oper2);
                        } else {
                            throw new IllegalArgumentException("Operation Error!");
                        }
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Файл пустой");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден");
                    result = "Файл не найден";
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка! Неверный формат числа");
                    result = "Ошибка! Неверный формат числа";
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка, " + e.getMessage());
                    result = e.getMessage();
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка, " + e.getMessage());
                    result = e.getMessage();
                }


                break;
            case 2:
                try {
                    String a = s.nextLine();
                    String[] a1 = a.split(" ");

                    if(a1.length != 3){
                        throw new IllegalArgumentException("Строка должна содержать <число оператор число>");
                    }

                    double oper1 = Double.parseDouble(a1[0]);
                    String operator = a1[1];
                    double oper2 = Double.parseDouble(a1[2]);


                    if(operator.equals("+")){
                        result = Double.toString(oper1 + oper2);
                    }else if(operator.equals("-")){
                        result = Double.toString(oper1 - oper2);
                    }else if(operator.equals("*")){
                        result = Double.toString(oper1 * oper2);
                    }else if(operator.equals("/")){
                        if(oper1 == 0 || oper2 == 0){
                            throw new ArithmeticException("Division by zero");
                        }
                        result = Double.toString(oper1 / oper2);
                    }else{
                        throw new IllegalArgumentException("Operation Error!");
                    }
                    System.out.println("Рузультат: " + result);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка! Неверный формат числа");
                    result = "Ошибка! Неверный формат числа";
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка, " + e.getMessage());
                    result = e.getMessage();
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка, " + e.getMessage());
                    result = e.getMessage();
                }

                break;
        }

        System.out.println("Записать в файл? 1 - yes, 0 - no");
        s = new Scanner(System.in);
        int nit = s.nextInt();
        if (nit == 1){

            try(FileWriter writer = new FileWriter("C:\\Users\\Student\\IdeaProjects\\Java\\src\\PZ_18\\output.txt", false))
            {
                writer.write(result);
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}