import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> d = new ArrayList<String>();
        d.add("asd");
        d.add("agdfsd");
        d.add("asddfgg");
        d.add("asfd");
        d.add("asgfgasddd");
        IncreasingList IL = new IncreasingList(d);
        IL.showList();
        IL.add("lfmfoeda");
        IL.showList();
    }
}