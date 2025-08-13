public final class Employee {
    private final int id;
    private final String name;
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Employee e=new Employee(111,"Rheya");
        System.out.println("Employee ID: "+e.getId());
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Attempting to modify state of Employee object by changing ID value: \n");
        e.id=112;//Compilation error
        System.out.println("New Employee ID: "+e.getId());
    }
}
