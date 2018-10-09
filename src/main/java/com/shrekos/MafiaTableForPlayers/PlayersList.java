package com.shrekos.MafiaTableForPlayers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class PlayersList {
    public static void playersList (String playersListURL) {
        try {
            Document document = Jsoup.connect(playersListURL).get();
            Elements element = document.getElementsByAttribute("pl.done");
            System.out.println(element);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
