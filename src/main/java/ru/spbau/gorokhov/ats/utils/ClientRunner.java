package ru.spbau.gorokhov.ats.utils;

import ru.spbau.gorokhov.ats.client.Client;

import java.io.IOException;
import java.net.InetAddress;

public class ClientRunner {
    public static void main(String[] args) throws IOException {
        String serverHostname = InetAddress.getLocalHost().getHostName();

        new Client(serverHostname).connect();
    }
}
