public class other {
    public static String rezultat(String s) {
        if (s.length() == 0) {
            return "Zero lenght!";
        }
        String[] tokens = s.split(" ");

        Stack mystack = new Stack();
        int n1;
        int n2;
        for (String z : tokens) {
            if (z.equals("+")) {
                n1 = mystack.pop();
                n2 = mystack.pop();
                mystack.push(n2 + n1);
            } else if (z.equals("-")) {
                n1 = mystack.pop();
                n2 = mystack.pop();
                mystack.push(n2 - n1);
            } else if (z.equals("*")) {
                n1 = mystack.pop();
                n2 = mystack.pop();
                mystack.push(n2 * n1);
            } else if (z.equals("/")) {
                n1 = mystack.pop();
                n2 = mystack.pop();
                mystack.push(n2 / n1);
            } else {
            mystack.push(Integer.parseInt(z));
            }
        }
        return Integer.toString(mystack.pop());
    }
}
