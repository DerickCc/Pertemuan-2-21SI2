package bangunruang;

public class Kubus {
    public int r = 0;
    public final float PI = 22.0f/7;
    public float volume = 0;

    public void hitungVolumeBola(){
        volume = 4 * PI * r * r * r / 3;
    }

    public void tampilkanVolumeBola(){
        hitungVolumeBola();
        System.out.println("Volume Bola (Jari-jari: "+ r +" cm) = "+ volume +" cm3\n");
    }
}
