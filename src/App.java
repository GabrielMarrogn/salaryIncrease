import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double earned = 0;
        sc.close();

        if(salary >= 0 && salary <= 400 ){
            earned = salary * 15/100;
            salary = salary + earned;
            System.out.printf("Novo salario: %.2f\n" ,salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 15 %");
        }else if(salary > 400 && salary <= 800 ){
            earned = salary * 12/100;
            salary = salary + earned;
            System.out.printf("Novo salario: %.2f\n" ,salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 12 %");
        }else if(salary > 800 && salary <= 1200 ){
            earned = salary * 10/100;
            salary = salary + earned;
            System.out.printf("Novo salario: %.2f\n" ,salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 10 %");
        }else if(salary > 1200 && salary <= 2000 ){
            earned = salary * 7/100;
            salary = salary + earned;
            System.out.printf("Novo salario: %.2f\n" ,salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 7 %");
        }else if(salary > 2000 ){
            earned = salary * 4/100;
            salary = salary + earned;
            System.out.printf("Novo salario: %.2f\n" ,salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 4 %");
        }
    }
}
