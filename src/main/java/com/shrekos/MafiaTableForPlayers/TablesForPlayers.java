package com.shrekos.MafiaTableForPlayers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class TablesForPlayers {
    public static void parsing (String tableURL) {
        try {
            Document document = Jsoup.connect(tableURL).get();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
