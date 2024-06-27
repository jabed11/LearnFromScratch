public class Age {
    public static void main(String[] args) {
        
        int anik = 23;
        int toton = 40;
        
        getDaysFromAge(anik);
        getDaysFromAge(toton);
    }
    public static void getDaysFromAge(int age){
        System.out.print("User age in days: ");
        System.out.println(age*365);
    }

    //// Test commit and push  

    // public static void main(String[] args){
    //     Function f = new Function();
    //     f.sayHello();

    //     int anik = 23;
    //     int toton = 45;
    //     Age countAge = new Age();
    //     countAge.getDaysFromAge(anik);
    //     countAge.getDaysFromAge(toton);
    // }
    // public void getDaysFromAge(int age){
    //     System.out.print("User age: ");
    //     System.out.println(age*365);
    // }
    
}
