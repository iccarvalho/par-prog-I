public class TestaSmartTV {
    public static void main(String[] args){
        SmartTV tv1 = new SmartTV();
        tv1.setVolume(-10);
        tv1.setVolume(140);
        tv1.setVolume(30);
        System.out.println("Volume atual: " + tv1.getVolume());

        SmartTV tv2 = new SmartTV("Samsung", "OLED de 45 polegadas", 0);
        tv2.setConectado(true);
        System.out.println(tv2.getConectado());
        tv2.abrirYoutube();
        tv2.aumentarVolume(40);
        tv2.aumentarVolume(40);
        tv2.diminuirVolume(10);
    }
}
