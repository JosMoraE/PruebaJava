public class Fibonacci {
    public static int sucesion(int user){
        if(user==0){
            return 0;
        }
        else if(user == 1){
            return 1;
        }
        else{
            return sucesion(user-1) + sucesion(user-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci.sucesion(5));
    }
}

