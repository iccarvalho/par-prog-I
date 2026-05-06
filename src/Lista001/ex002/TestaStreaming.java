package Lista001.ex002;

public class TestaStreaming {
    public static void main(String[] args){
        Streaming streaming = new Streaming("Igor", "Premium");

        streaming.assistirFilme("Star Wars");

        System.out.println(streaming.toString());
        streaming.cancelarAssinatura();
        System.out.println(streaming.toString());
    }
}
