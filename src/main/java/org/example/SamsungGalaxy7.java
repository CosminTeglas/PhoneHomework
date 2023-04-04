package org.example;
/**
 * This is a method that extends Samsung.
 */
public class SamsungGalaxy7 extends Samsung{
    String color;
    String material;
    String IMEI;
    /**
     * This is the constructor of the class SamsungGalaxy7.
     * @param batteryLife
     * @param color
     * @param material
     * @param IMEI
     */
    public SamsungGalaxy7(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }
}
