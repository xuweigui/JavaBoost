package com.optiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.math3.util.Precision;

public class ForengeExchange {

    private static double epsilon = 0.000001d;
    /**
     *
     * @param from example AUD
     * @param to example CNY
     * @param rates example AUDUSD@0.74
     */
    public static double exchange(String from, String to, List<String> rates) {
        List<Exchange> exchanges = rates.stream().map(r -> new Exchange(r.substring(0, 3), r.substring(3, 6), Double.parseDouble(r.substring(7)))).collect(Collectors.toList());
        Stack<Exchange> paths = new Stack<>();

        exchange(paths, exchanges, from, to);

        return paths.stream().mapToDouble(Exchange::getRate).reduce(1, (a, b) -> a * b);
    }

    private static void exchange(@Nonnull Stack<Exchange> paths, @Nonnull List<Exchange> remains, @Nonnull String from, @Nonnull String to) {
        Optional<Exchange> found = remains.stream().filter(s ->from.equals(s.getFrom())).findFirst();
        if (found.isPresent()) {
            Exchange exchange = found.get();
            if (to.equals(exchange.to)) {
                paths.push(exchange);
            } else {
                paths.push(exchange);
                remains.remove(exchange);
                exchange(paths, remains, exchange.to, to);
            }
        } else {
            Exchange previous = paths.pop();
            exchange(paths, remains, previous.from, to);
        }
    }

    @Data
    @AllArgsConstructor
    private static class Exchange {
        private String from;
        private String to;
        double rate;
    }
}
