import interfaces.Programming;

public class Programmer extends Collaborator implements Programming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Программист пишет код");
    }
}
