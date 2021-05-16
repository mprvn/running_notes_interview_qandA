import java.util.ArrayList;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
         intList.add(10);
        intList.add(2);
        intList.add(11);
        intList.add(3);
        intList.add(5);
        intList.add(61);

       System.out.println("max ::" +intList.stream().max((x,y) -> x.compareTo(y)).get());;
        System.out.println("min ::"+intList.stream().min((x,y) -> x.compareTo(y)).get());;
    }

}
