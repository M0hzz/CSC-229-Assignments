public class Main {
    //Task 1
    static void countDown(int num)

    {

        if (num == 0) // test

            System.out.println("Blastoff!");

        else {

            System.out.println(num + "...");

            countDown(num-2); // recursive call

        }

    }
    /*
    Given an integer input(n), This code outputs "..." n-1 times and on the n-th step,
    it outputs Blastoff!
     */
    /*
    Time complexity is O(g(n)) = n/2. It is linear because as n gets bigger,
    the number of steps increase by the same amount.
     */
    static int gcd(int x, int y) {

        if (x == y) //base case

            return y;

        else if(x > y) {
            return(gcd(x-y,y));
        }
        else{
            return gcd(x, y - x);
        }

    }
    /*
    The output of this code is the greatest common divisor of two integers
     */
    static int fib(int n)

    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n-1) + fib(n-2);

    }
    /*
    The time complexity of this algorithm is O(g(n)) = 2^n because as the input size increases
    the time required to execute the code increases exponentially. For a large number like 100,
    this code has to call the argument for every number before 100, and it has to start with 1 since
    that is the only known case which will then be used to go up to fib(100)
     */

    static void hellowWorldMessage(int n){
        if(n==0){

        }
        else{
            System.out.println("Hello World");
            hellowWorldMessage(n-1);

        }
    }
    static int sum7(int n1, int n2){
        int result;
        if(n1 % 7 == 0 && n1 != n2){
            result = n1 + sum7(n1+1,n2);
        }
        return result;
    }
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l && l <= arr.length - 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x); // lower half

            }
            else {
                return binarySearch(arr, mid + 1, r, x);//upper half
            }
        }
        return -1; // no answer
    }
    public static void main(String[] args) {
        countDown(20);
        System.out.println(gcd(105356,59324));
        hellowWorldMessage(4);
        System.out.println(sum7(10,30));
    }
}
