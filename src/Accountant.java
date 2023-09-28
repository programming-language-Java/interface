import interfaces.SalaryCalculation;

public class Accountant extends Collaborator implements SalaryCalculation {
    public Accountant(String name) {
        super(name);
    }

    @Override
    public void countSalary() {
        System.out.println("Бухгалтер рассчитывает зарплату");
    }
}
