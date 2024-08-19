public class Employe implements EmployeImplementation{
    @Override
    public void createEmployee() {
        System.out.println("Employee created");
    }

    @Override
    public void viewEmployee() {
        System.out.println("Employee viewed");

    }

    @Override
    public void deleteEmployee() {
        System.out.println("Employee deleted");

    }
}
