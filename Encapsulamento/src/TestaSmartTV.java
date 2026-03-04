public class TestaSmartTV {
    public static void main(String[] args){
        SmartTV tv1 = new SmartTV();
        tv1.setVolume(-10);
        tv1.setVolume(140);
        tv1.setVolume(30);
        System.out.println("Volume atual: " + tv1.getVolume());

        SmartTV tv2 = new SmartTV("Sansung", "Oled de 45 polegadas", 0);
    }
}
