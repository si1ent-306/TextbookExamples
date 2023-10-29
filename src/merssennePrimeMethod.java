public class merssennePrimeMethod {
    public static void main(String[] args){
        merssenePrimeNumbers(31);
    }

    private static void merssenePrimeNumbers(int max) {
        for (int i = 1; i < max; i++){
           int merssene =  (int) (Math.pow(2,i))-1;
           System.out.print(i + " ");
           System.out.print(" " + merssene + " ");
        }
    }
}
