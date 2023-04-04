package org.example;

/**
 * This is a class that extends from Iphone.
 */
public class Iphone6 extends Iphone{
    /**
     * This is the constructor of the Iphone6 class.
     * @param batteryLife
     * @param color
     * @param material
     * @param IMEI
     */
    public Iphone6(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    String color;
    String material;
    String IMEI;


}
