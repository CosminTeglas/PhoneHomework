package org.example;

/**
 * This is a class that extends Phone
 */
public class Iphone13PRO extends Iphone{
    String color;
    String material;
    String IMEI;

    /**
     * This is the constructor of the Iphone13PRO class.
     * @param batteryLife
     * @param color
     * @param material
     * @param IMEI
     */

    public Iphone13PRO(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }
}
