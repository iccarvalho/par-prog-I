package ex004;

public class Main {
    public static void main(String[] args){
        Programador dev1 = new Programador(101, "Igor", "JavaScript");
        Programador dev2 = new Programador(102, "Cauê", "Python");

        Projeto projeto = new Projeto(1, "CRM");
        projeto.addProgramador(dev1);
        projeto.addProgramador(dev2);

        System.out.println(projeto);
        projeto.listarProgramadores();
    }
}
