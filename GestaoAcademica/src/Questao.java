public class Questao {
    private int numero;
    private String enunciado;
    private double valor;

    public Questao(){}

    public Questao(int numero, String enunciado, double valor){
        setNumero(numero);
        setEnunciado(enunciado);
        setValor(valor);

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return "\n            {" +
                "\n                Número: " + this.numero + "," +
                "\n                Enunciado: " + this.enunciado + "," +
                "\n                Valor: " + this.valor +
                "\n            }" +
                "\n          ";
    }
}
