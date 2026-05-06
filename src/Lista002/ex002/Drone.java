package Lista002.ex002;

public class Drone {
    private String codigo;
    private double altura;
    private int bateria;
    private boolean emVoo;

    public Drone(){}

    public Drone(String codigo, double altura, int bateria){
        setCodigo(codigo);
        setAltura(altura);
        setBateria(bateria);
        this.emVoo = false;
    }

    // Setters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setAltura(double altura){
        if(altura > 0 && altura <= 120){
            this.altura = altura;
        } else{
            System.out.println("Não pode voar a essa altura!");
        }
    }

    public void setBateria(int bateria){
        if(bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }
    }

    // Getters
    public String getCodigo(){
        return this.codigo;
    }

    public double getAltura(){
        return this.altura;
    }

    public int getBateria(){
        return this.bateria;
    }

    public boolean getEmVoo(){
        return this.emVoo;
    }

    // Métodos públicos
    public void decolar(){
        if(testarMotores() && this.bateria > 20){
            this.emVoo = true;
            setAltura(2);
        } else{
            System.out.println("Falha ao decolar!");
        }
    }

    public void subir(int x){
        if(this.emVoo){
            setAltura(this.altura + x);
        } else{
            System.out.println("O drone precisa estar ligado!");
        }
    }

    public void descer(int x){
        if(this.emVoo){
            setAltura(this.altura - x);
        } else{
            System.out.println("O drone precisa estar ligado!");
        }
    }

    // Métodos privados
    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        int random = (int) (Math.random() * 10);

        return random < 8;
    }
}
