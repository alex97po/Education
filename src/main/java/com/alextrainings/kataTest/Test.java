package com.shrekos.kataTest;

public class Test {
    public static void main(String[] args) {
        WhichAreIn test = new WhichAreIn();
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(WhichAreIn.inArray(a,b));
    }
}
