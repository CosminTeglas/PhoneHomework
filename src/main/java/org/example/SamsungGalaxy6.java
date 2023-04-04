package org.example;

/**
 * This is a method that extends Samsung.
 */

public class SamsungGalaxy6 extends Samsung{
    /**
     * This is the constructor of the class SamsungGalaxy6.
     * @param batteryLife
     * @param color
     * @param material
     * @param IMEI
     */
    public SamsungGalaxy6(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    String color;
    String material;
    String IMEI;

}
