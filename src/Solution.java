/**
 * Created by user on 29.01.2016.
 */
import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = 0;
        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(reader.readLine());
            if (maximum < m) {maximum = m;}
        }
        System.out.println(maximum);
    }
}