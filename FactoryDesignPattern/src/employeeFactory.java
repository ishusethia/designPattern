public class employeeFactory {

    public static employee getEmployee(String empType){
        if(empType.trim()=="Android"){
            return new androidDeveloper();
        }
        else if(empType.trim()=="Web"){
            return new webDeveloper();
        }
        else
            return null;
    }
}
