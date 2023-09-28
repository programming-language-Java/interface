class Collaborator {
    private final String NAME;

    public Collaborator(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public void print() {
        System.out.println("Имя сотрудника: " + NAME);
    }
}
