public class Factorial {
    public static int factorial(int user){
        if(user==0){
            return 1;
        }
        else{
            return user * factorial(user-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5));
    }
}
