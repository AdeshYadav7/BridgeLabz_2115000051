import java.util.ArrayList;

public class MainWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Unchecked warning suppressed");
        System.out.println(list.get(0));
    }
}
