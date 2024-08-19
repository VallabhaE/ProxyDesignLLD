public class EmployeProxy {
    public void CreateEmploye(String user,EmployeImplementation obj) throws Exception{
        if(user.equals("USER")){
            System.out.println("LOGIN VERIFIED AND INITIATING CREATE");
            obj.createEmployee();
        }else{
            throw new Exception("LOGIN NOT VERIFIED AND NOT INITIATING CREATE");
        }
    }

    public void DeleteEmploye(String user,EmployeImplementation obj) throws Exception{
        if(user.equals("USER")){
            System.out.println("LOGIN VERIFIED AND INITIATING DELETE");
            obj.deleteEmployee();
        }else{
            throw new Exception("LOGIN NOT VERIFIED AND NOT INITIATING DELETE");
        }
    }
    public void get(String user,EmployeImplementation obj) throws Exception{
        if(user.equals("USER") || user.equals("ADMIN")){
            System.out.println("LOGIN VERIFIED AND INITIATING DELETE");
            obj.deleteEmployee();
        }else{
            throw new Exception("LOGIN NOT VERIFIED AND NOT INITIATING DELETE");
        }

    }
}
