package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());
    }

}
