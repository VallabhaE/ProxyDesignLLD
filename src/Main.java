
public class Main {
    public static void main(String[] args) {
        try{
            EmployeProxy a = new EmployeProxy();
            a.CreateEmploye("USER",new Employe());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}