import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> d = new ArrayList<String>();
        d.add("askhkhkhkhkhkhkd");
        d.add("agkkkkd");
        d.add("ashkd");
        d.add("asf");
        d.add("ajkhkhkhksg");
        IncreasingList IL = new IncreasingList(d);
        IL.showList();
        IL.add("lfhkkmk");
        IL.showList();
        System.out.println(IL.getMax());
        System.out.println(IL.getMeanLength());
    }
}