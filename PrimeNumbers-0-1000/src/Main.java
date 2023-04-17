public class Main {
    public static void main(String[] args) {
        System.out.println("Prime Numbers between 1 and 1000");

        for (int i = 0; i<=1000; i++){
            if(checkPrime(i)){
                System.out.println(i + " is prime");
            }
        }
    }

    public static boolean checkPrime(int limit){

        /*Address the exception case: 0 and 1 are not prime*/
        if (limit == 0 || limit == 1){
            return false;
        }

        /*Address the base case: 2 is prime*/
        if (limit == 2){
            return true;
        }

        /*Address all other cases*/
        for (int i = 2; Math.pow(i, i)<=limit; i++){
            if (limit%i==0){
                return false;
            }
        }
        return true;
    }
}