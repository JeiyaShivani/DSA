/* Given an array of N integers, determine whether the sequence is special.

A sequence is called special if every pair of adjacent elements has different parity. In other words:

An odd number must be followed by an even number.
An even number must be followed by an odd number.
No two adjacent elements can both be odd or both be even.

Print "YES" if the sequence is special; otherwise print "NO".

Input Format
The first line contains an integer T, the number of test cases.
For each test case:
The first line contains an integer N, the size of the array.
The second line contains N space-separated integers.

For each test case, print:

"YES" if the sequence is special.
"NO" otherwise.

Input
1
4
1 4 3 8
Output
YES*/

public class OddEvenSequence {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 8};

        boolean special = true;

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i] % 2) == (arr[i - 1] % 2)) {
                special = false;
                break;
            }
        }

        if (special) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}





