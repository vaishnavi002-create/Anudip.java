//

 public class parameterconst {

    String name;
    int age;

    parameterconst(String Stuname, int stdage){
        name=Stuname;
        age=stdage;
    }

    void out(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }

    public static void main(String[] args) {

        parameterconst S1 = new parameterconst("vaishnavi",18);
        parameterconst S2 = new parameterconst("gauri",19);

        S1.out();
        System.out.println("----");
        S2.out();
        System.out.println("----");
    
    }
    
 }
 
