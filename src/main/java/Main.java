import java.io.PrintWriter;

public class Main {

    interface MyNumber{
        double getValue();
    }

    interface MyNumber2{
        boolean getRez(int i);
    }

    interface MySm{
        int getSm(int i, int ii);
    }

    interface NumericFunc{
        int func(int n);
    }

    interface StringFunc{
        String func(String n);
    }

    interface SomeFunc<T>{
        T func(T t);
    }

    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Хеллоу PIDOR Bitch!!");

        //() -> 123.45

        //() -> Math.random() * 100

        //(n) -> (n % 2) == 0

        MyNumber myNum;

        myNum = () -> 123.45;
        pw.println("lambda const = " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        pw.println("Lambda random = " + myNum.getValue());
        pw.println("Lambda random = " + myNum.getValue());

        MyNumber2 myNum2;
        myNum2 = (n) -> (n % 2) == 0;
        pw.println("Lambda ch/nch = " + myNum2.getRez(11));

        MySm mySm;
        mySm = (n, m) -> (n + m);
        pw.println("Lambda summ = " + mySm.getSm(2, 3));


        //NumericFunc factorial = (n) -> {
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++){
                result = i * result;
            }

            return result;
        };

        pw.println("Factorial 3 = " + factorial.func(3));
        pw.println("Factorial 4 = " + factorial.func(4));
        pw.println("Factorial 5 = " + factorial.func(5));
        pw.println("Factorial 6 = " + factorial.func(6));
        pw.println("Factorial 7 = " + factorial.func(7));
        pw.println("Factorial 8 = " + factorial.func(8));
        pw.println("Factorial 9 = " + factorial.func(9));
        pw.println("Factorial 10 = " + factorial.func(10));
        pw.println("Factorial 11 = " + factorial.func(11));
        pw.println("Factorial 12 = " + factorial.func(12));
        pw.println("Factorial 13 = " + factorial.func(13));
        pw.println("Factorial 14 = " + factorial.func(14));
        pw.println("Factorial 15 = " + factorial.func(15));


        //StringFunc reverse = (str) -> {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }

            return result;
        };

        pw.println("Bitch " + reverse.func("Bitch"));
        pw.println("Pidor " + reverse.func("Pidor"));
        pw.println("Еблан " + reverse.func("Еблан"));


    }
}
