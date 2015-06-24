public class other {
    public static String rezultat(String s){
    if (s.length() == 0) {
            return "error!";
        }
    String[] tokens = s.split(" ");
    if (tokens.length != 3) {
        return "incorrect lenght!";
    }
        return (vichislyaem(tokens[0] , tokens[1], tokens[2]));
    }

    private static String vichislyaem(String token_0, String token_1, String token_2) {
    int numb_1 = Integer.parseInt(token_0);
    int numb_2 = Integer.parseInt(token_1);
    int rez;
        if (token_2.equals("+")) {
        rez = numb_1 + numb_2;
        }
        else if (token_2.equals("-")) {
            rez = numb_1 - numb_2;
        }
        else if (token_2.equals("Х")) {
            rez = numb_1 * numb_2;
        }

        else if (token_2.equals("/")) {
            rez = numb_1 / numb_2;
        }
        else {
            return "hueta kakayato!";
        }
    return Integer.toString(rez);
    }
}
