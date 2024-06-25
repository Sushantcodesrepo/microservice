import java.util.*;

public class xyz {
    public static void sta() {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i<4; i++) stack.push(i);
        assert stack.toString().equals("[0, 1, 2, 3]");
        System.out.println(stack.toString());
    }
}
