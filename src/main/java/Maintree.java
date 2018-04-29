import java.io.PrintWriter;

interface StrFunk{
    String func(String n);
}

interface MyFunc2<T>{
    boolean func(T v1, T v2);
}

class MyStrOps{
    //static String strReverse(String str){
    String strReverse(String str){
        String result = "";

        int i;

        for (i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }
}

class HighTemp{
    private int hTemp;

    HighTemp(int ht){
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}


public class Maintree {

    static String strOp(StringFunc sf, String s){
        return sf.func(s);
    }

    static <T> int counter(T[] vals, MyFunc2<T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++){
            if (f.func(vals[i], v)){
                count++;
            }
        }

        return count;
    }

    public static void main(String... args){
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Pidor Bitch");

        String inStr = "Lambda-sequence upper effectivity of Java Bitch";
        String outStr;

        //outStr = strOp(MyStrOps::strReverse, inStr);

        MyStrOps strOps = new MyStrOps();
        outStr = strOp(strOps::strReverse, inStr);


        pw.println("Into string : " + inStr);
        pw.println("Outto string : " + outStr);

        int count;

        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
                                    new HighTemp(90), new HighTemp(89),
                                    new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        pw.println("Days when maximum temperature was 89 " + count);

        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        pw.println("Days when maximum temperature was 12 " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        pw.println("Days when maximum temperature was less when 89 " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        pw.println("Days when maximum temperature was less when 19 " + count);

    }
}
