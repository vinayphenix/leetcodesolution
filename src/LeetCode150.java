import java.util.LinkedList;
import java.util.List;

public class LeetCode150 {

    public int evalRPN(String[] tokens) {

        List<Integer> list = new LinkedList<>();
        int a = 0;
        int b = 0;
        for (String str : tokens) {
            switch (str) {
                case "+":
                    a = list.removeLast();
                    b = list.removeLast();
                    list.add(b + a);
                    break;
                case "-":
                    a = list.removeLast();
                    b = list.removeLast();
                    list.add(b - a);
                    break;
                case "*":
                    a = list.removeLast();
                    b = list.removeLast();
                    list.add(b * a);
                    break;
                case "/":
                    a = list.removeLast();
                    b = list.removeLast();
                    list.add(b / a);
                    break;
                default:
                    list.add(Integer.parseInt(str));
            }
        }
        return list.removeFirst();
    }
}
