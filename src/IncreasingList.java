import java.util.*;

public class IncreasingList {
    private List<String> words = new ArrayList<String>();
    IncreasingList() {}
    IncreasingList(List<String> arr) {
        this.words = arr;
        words.sort((v1, v2) -> Integer.compare(v1.length(), v2.length()));
    }

    public void add(String val) {
        this.words.add(val);
        words.sort((v1, v2) -> Integer.compare(v1.length(), v2.length()));
    }

    public void showList() {
        System.out.println(words);
    }
}
