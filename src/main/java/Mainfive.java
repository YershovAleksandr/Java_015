import java.io.PrintWriter;
import java.util.function.Function;

interface My5Func<R, T>{
    R func(T n);
}

class My5Class<T>{
    private T val;

    My5Class(T v){
        val = v;
    }

    My5Class(){
        val = null;
    }

    T getVal(){
        return val;
    }
}

class My55Class{
    String str;

    My55Class(String s){
        str = s;
    }

    My55Class(){
        str = "";
    }

    String getVal(){
        return str;
    }
}

public class Mainfive {

    static <R, T> R myClassFactory(My5Func<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String... args){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Bitch");

        My5Func<My5Class<Double>, Double> myClassCons = My5Class<Double>::new;

        My5Class<Double> mc = myClassFactory(myClassCons, 100.1);
        pw.println("Value of val in object mc equals " + mc.getVal());

        My5Func<My55Class, String> myClassCons2 = My55Class::new;

        My55Class mc2 = myClassFactory(myClassCons2, "lambda");
        pw.println("Value str in object mc2 equals " + mc2.getVal());

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;

            for(int i = 1; i <= n; i++){
                result = i * result;
            }

            return result;
        };

        pw.println("Factorial number 3 is " + factorial.apply(3));
        pw.println("Factorial number 5 is " + factorial.apply(5));

    }
}
