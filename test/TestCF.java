import org.checkerframework.checker.nullness.qual.NonNull;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestCF {
    @Test
    public void testCF() {
        @NonNull List<String> fieldNames = IntStream.range(0, 100)
                .mapToObj(i -> "fld" + i) //stop here
                .collect(Collectors.toList());
    }
}
