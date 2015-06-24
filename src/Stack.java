/**
 * andrew on 6/24/15
 */
public class Stack {
    int stck[] = new int[100];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 99) {
            System.err.println("Stack full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.err.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
