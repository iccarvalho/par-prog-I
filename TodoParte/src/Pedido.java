import java.util.Date;

public class Pedido {
    private int ID;
    private Date data;
    private Cliente cliente; // associação todo-parte

    public Pedido() {}

    // O cliente veio pronto, mostrando sua independencia do Pedido
    public Pedido(int ID, Date data, Cliente cliente) {
        setID(ID);
        setData(data);
        setCliente(cliente);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getID() {
        return this.ID;
    }

    public Date getData() {
        return this.data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Pedido {" +
                "\n ID:" + ID +
                "\n data: " + data +
                ",\n " + cliente +
                "\n}";
    }
}
