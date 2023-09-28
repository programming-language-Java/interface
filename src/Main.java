public class Main {

    public static void main(String[] args) {
        printAllCollaborators();
        everythingWorks();
    }

    public static void printAllCollaborators() {
        Collaborator[][] allCollaborators = new Collaborator[][]{
                getProgrammers(),
                getAccountants(),
                getLawyers()
        };
        for (Collaborator[] certainCollaborators : allCollaborators) {
            for (Collaborator collaborator : certainCollaborators) {
                collaborator.print();
            }
        }
    }

    public static void everythingWorks() {
        workProgrammers();
        workAccountant();
        workLawyer();
    }

    public static void workProgrammers() {
        for (Programmer programmer : getProgrammers()) {
            programmer.writeCode();
        }
    }

    public static Programmer[] getProgrammers() {
        Programmer programmer1 = new Programmer("Рома");
        Programmer programmer2 = new Programmer("Дима");
        Programmer programmer3 = new Programmer("Вася");
        return new Programmer[]{
                programmer1,
                programmer2,
                programmer3
        };
    }

    public static void workAccountant() {
        for (Accountant accountant : getAccountants()) {
            accountant.countSalary();
        }
    }

    public static Accountant[] getAccountants() {
        Accountant accountant1 = new Accountant("Федя");
        Accountant accountant2 = new Accountant("Петя");
        Accountant accountant3 = new Accountant("Маша");
        return new Accountant[]{
                accountant1,
                accountant2,
                accountant3
        };
    }

    public static void workLawyer() {
        for (Lawyer lawyer : getLawyers()) {
            lawyer.concludeContracts();
        }
    }

    public static Lawyer[] getLawyers() {
        Lawyer lawyer1 = new Lawyer("Вова");
        Lawyer lawyer2 = new Lawyer("Олег");
        Lawyer lawyer3 = new Lawyer("Аркаша");
        return new Lawyer[]{
                lawyer1,
                lawyer2,
                lawyer3
        };
    }
}