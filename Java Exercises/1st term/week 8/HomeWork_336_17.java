public class HomeWork_336_17 {
    public static void main(String[] args) {

        swapPairs("Hello you fool I think you smelly");

    }

    public static void swapPairs(String s) {
        int strLen = s.length();
        String newString = "";
        if (strLen % 2 == 0) {
            for (int i = 0; i < strLen; i = i + 2) {
                int var = i;
                String x = s.substring(var, var + 1);
                String y = s.substring(var + 1, var + 2);
                String tempStr = oneSwap(x, y);
                newString = newString + tempStr;
            }
        }
        else{
            for (int i = 0; i < strLen - 1; i = i + 2) {
                int var = i;
                String x = s.substring(var, var + 1);
                String y = s.substring(var + 1, var + 2);
                String tempStr = oneSwap(x, y);
                newString = newString + tempStr;
            }
        String c = s.substring(strLen - 1, strLen);
        newString = newString + c;
        }
        System.out.println(newString);
    }

    public static String oneSwap(String a, String b) {
        String swapped = (b + a);
        return swapped;
    }

}
