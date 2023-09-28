import interfaces.ConclusionTreaty;

public class Lawyer extends Collaborator implements ConclusionTreaty {
    public Lawyer(String name) {
        super(name);
    }

    @Override
    public void concludeContracts() {
        System.out.println("Юрист заключает договор");
    }
}

