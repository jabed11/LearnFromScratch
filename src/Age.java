public class Age {
    public static void main(String[] args) {
        
        int anik = 23;
        int toton = 24;
        getDaysFromAge(anik);
        getDaysFromAge(toton);
    }
    public static void getDaysFromAge(int age){
        System.out.print("User age is: ");
        System.out.println(age+365);
    }
    
}
