package week12;
import sun.misc.Signal;

import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class HandshakeCalculator {
    enum Signal {
        WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP
    }
    public List<Signal> calculateHandshake(int n) {
        IntPredicate isBitOn = bitIndex -> ((1 << bitIndex) & n) > 0;
        List<Signal> signals = IntStream.range(0, Signal.values().length)
                .filter(isBitOn)
                .mapToObj(i -> Signal.values()[i])
                .collect(Collectors.toList());

        if (isBitOn.test(Signal.values().length)) {
            Collections.reverse(signals);
        }

        return signals;
    }
}
