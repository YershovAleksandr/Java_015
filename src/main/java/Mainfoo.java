import java.io.PrintWriter;
import java.util.*;

interface My42Func<T>{
    int func(T[] vals, T v);
}

interface My4242Func{
    My4242Class func(int n);
}

interface My43Func<T>{
    My43Class<T> func(T n);
}

class My43Class<T>{
    private T val;

    My43Class(T v){
        val = v;
    }

    My43Class(){
        val = null;
    }

    T getVal(){
        return val;
    }
}

class My4242Class{
    private int val;

    My4242Class(int v){
        val = v;
    }

    My4242Class(){
        val = 0;
    }

    int getVal(){
        return val;
    }
}

class My42ArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++){
            if (vals[i] == v){
                count++;
            }
        }

        return count;
    }
}

class My42Class{
    private int val;

    My42Class(int v){
        val = v;
    }

    int getVal(){
        return val;
    }
}

public class Mainfoo {

    static <T> int myOp(My42Func<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    static int compareMC(My42Class a, My42Class b){
        return a.getVal() - b.getVal();
    }

    public static void main(String... args){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Pidor Bitch!!");

        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"odin", "dva", "trii", "dva"};
        int count;

        count = myOp(My42ArrayOps::<Integer>countMatching, vals, 4);
        pw.println("Arrays val xontain " + count + " number 4 bitch");

        count = myOp(My42ArrayOps::<String>countMatching, strs, "dva");
        pw.println("Arrays strs contains " + count + " world dva bitch");

        ArrayList<My42Class> al = new ArrayList<My42Class>();

        al.add(new My42Class(1));
        al.add(new My42Class(4));
        al.add(new My42Class(2));
        al.add(new My42Class(9));
        al.add(new My42Class(3));
        al.add(new My42Class(7));

        My42Class maxValObj = Collections.max(al, Mainfoo::compareMC);
        pw.println("Maxumum value is " + maxValObj.getVal());

        My4242Func myClassCons = My4242Class::new;

        My4242Class mc = myClassCons.func(100);

        pw.println("Value val in object mc equals " + mc.getVal());

        My43Func<Integer> myCC = My43Class<Integer>::new;

        My43Class<Integer> mcc = myCC.func(100);

        pw.println("Value of val in object mc equals " + mc.getVal());

    }
}
