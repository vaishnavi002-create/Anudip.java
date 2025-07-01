
    class Employee {
        int id;
        String name;
        double salary;

    
        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

    
        void displayInfo() {
            System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
        }
    }


    public class Assignment3 {
        public static void main(String[] args) {
        
            Employee e1 = new Employee(101, "Ram", 25000);
            Employee e2 = new Employee(102, "Gauri", 30000);
            Employee e3 = new Employee(103, "Vaishnavi", 28000);

            
            e1.displayInfo();
            e2.displayInfo();
            e3.displayInfo();
        }
    }
