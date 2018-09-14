package com.shrekos.kata3;

public class BinaryArray {
    public static byte [] binaryArray (String binaryCode) {
        String binaryCodeArr [] = binaryCode.split(",");
        byte [] arrayBinary = new byte [binaryCodeArr.length];
        for (int y = 0; y < arrayBinary.length-1; y++) {
            arrayBinary [y] = Byte.parseByte(binaryCodeArr[y]);
        }
        return arrayBinary;
    }

}
