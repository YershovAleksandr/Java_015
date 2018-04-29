import java.io.PrintWriter;

interface StringFunc{
    String func(String n);
}

interface DoubleNumericArraFunc{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array is empty BITCH");
    }
}

interface MyFunk{
    int func(int n);
}

public class Mainto {

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }


    public static void main(String[] args) throws EmptyArrayException{
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Pidor bitch");

        String inStr = "Lamba powerup effectency Java Bitch";
        String outStr;

        System.out.println("In " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        pw.println("Out " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }

            return result;
        }, inStr);

        pw.println("Out " + outStr);


        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >=0; i--){
                result += str.charAt(i);
            }

            return result;
        };


        pw.println("Wtf " + stringOp(reverse, inStr));

        double[] values = {1.0,2.0,3.0,4.0};

        DoubleNumericArraFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0){
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++){
                sum += n[i];
            }

            return sum / n.length;
        };

        pw.println("Average = " + average.func(values));
        //pw.println("Average error = " + average.func(new double[0]));


        int num = 10;

        MyFunk myLambda = (n) -> {
            int v = num + n;

            //num++;

            return v;
        };

        //num = 9;


    }
}
