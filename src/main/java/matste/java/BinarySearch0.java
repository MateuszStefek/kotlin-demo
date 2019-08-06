package matste.java;

import matste.kotlin.demo.BinarySearch0Kt;
import matste.kotlin.demo.ExtensionsKt;

public class BinarySearch0 {
    public static void main(String[] args) {
        System.out.println(BinarySearch0Kt.binarySearch(new String[] { "Ala", "kota", "ma"}, 0, 3, "ble"));
        System.out.println(BinarySearch0Kt.binarySearch(new String[] { "Ala", "kota", "ma"}, "ble"));
    }
}
