
import java.util.Scanner;

interface Calcultor{
    int add(int a, int b);

    default int mulitiply(int a, int b){
        return a *b;
    }

    static int subtract(int a, int b){
        return a-b;
    }
}

class simpleCalculator implements Calcultor{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        simpleCalculator calc = new simpleCalculator();

        System.out.println(calc.add(a, b));
        System.out.println(calc.mulitiply(a, b));
        System.out.println(Calcultor.subtract(a, b));
    }
}