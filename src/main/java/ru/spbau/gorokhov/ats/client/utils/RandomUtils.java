package ru.spbau.gorokhov.ats.client.utils;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    // FIXME implement better
    public static long nextLong(long limit) {
        return ((RANDOM.nextLong() % limit) + limit) % limit;
    }

    public static long nextLong(long from, long to) {
        return from + nextLong(to - from + 1);
    }
}
