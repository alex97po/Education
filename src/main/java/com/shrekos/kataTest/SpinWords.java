package com.shrekos.kataTest;

public class SpinWords {
    public String spinWords(String sentence) {
        String [] sentenceArr = sentence.split(" ");
        String result = "";
        for (int i = 0; i <= sentenceArr.length-1; i++){
            if (sentenceArr[i].length() >= 5) {
                char[] charArray = sentenceArr[i].toCharArray();
                String resultString = "";
                for (int y = charArray.length - 1; y >= 0; y--) {
                    resultString += charArray[y];
                }
                sentenceArr[i] = resultString;
            }
         if (i == sentenceArr.length-1) {result = result + sentenceArr[i];
         } else result = result + sentenceArr[i] + " ";
        }
        return result;
    }
}
