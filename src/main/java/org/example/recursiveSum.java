public class recursiveSum {

    public static void main(String[] args) {
        System.out.println(sums(1,29));
    }
    public static int sums(int n1, int n2){
        //Base case
        if (n1 > n2){
           return 0;
        }
        else {
            //if n2 is divisible by 7 add to value and continue recursion
            if (n2 % 7 == 0){
                return n2 + sums(n1, n2 - 1);
            }
            //continue recursion
            else {
                return sums(n1, n2 - 1);
            }
        }
    }
}
