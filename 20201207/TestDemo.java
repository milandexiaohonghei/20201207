import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;








public class TestDemo {


    //写一个递归方法，输入一个非负整数，返回组成它的数字之和

    public static void main(String[] args) {
        int n = 1234;
        print(n);
    }
    public static void print(int num){
        if(num> 9){
            print(num/10);
        }
        System.out.println(num%10);
    }



    //递归求斐波那契数列的第 N 项
    public static void main9(String[] args) {
        int n = 3;
        int ret = fib2(n);
        System.out.println(ret);

    }

    public static int fib2(int n){
       if (n <= 2){
           return 1;
       }else{
           return  fib2(n-1) + fib2(n-2);
       }
    }





    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static void main8(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(add1(a,b));
        double a1 = 15.3;
        double a2 = 12.4;
        double a3 = 13.4;
        System.out.println(add1(a1,a2,a3));
    }


    public static int add1(int a, int b){
        return a + b;
    }
    public static double add1(double a, double b,double c){
        return a + b +c;

    }

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static void main7(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(add(a,b));
        double a1 = 15.3;
        double b1 = 16.3;
        System.out.println(add(a1,b1));
        double c = 155.4;
        double a2 = 155.47;
        int b2 = 255;
        System.out.println(add(c,a2,b2));

    }


    public static int add(int a, int b){

        if (a>b){
            return a;
        }else{
            return b;

        }
    }
    public static double add(double a, double b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
    public static double add(double a,double b,int c){
        if (a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        } else{
            if(b >c){
                return b;
            }else{
                return c;
            }
        }
    }


        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main6(String[] args) {
        int a = 10;
        int b = 25;
        int c =17;
        int tmp = max(a,b);
        System.out.println(max(tmp,c));


    }
    public static int  max (int a,int b){
        if (a>b){
            return a;
        }else{
            return b;

        }
    }










    public static void main5(String[] args) {
        int[] num = new int[]{14, 7, 9, 20, 25, 34, 30, 27};
        int num1 = 0;
        int num2 = 0;
        for (int i =0; i < num.length; i++){
            if(num[i] %2 == 0){
                num1++;
            }else{
                num2++;
            }
        }
        int j = 0;
        int f = 3;
        for (int i = 0;i < num.length;i++){
            if(num[i] %2 == 0){
                num[j] = num[i];
                j++;
            }
        }
        for (int i = 0;i < num.length;i++){
            if(num[i] %2 != 0){
                num[f] = num[i];
                f++;
            }
        }
        for (int i = 0;i < num.length;i++){
            System.out.println(num[i]);
        }
    }


    //求 N 的阶乘 .
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        for (int j = 1; j <= n; j++){
            mul *= j;
        }
        System.out.println(mul);
    }


    //求1！+2！+3！+4！+........+n!的和
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i<= n; i++){
            count += fac(i);
        }
        System.out.println(count);
    }
    public static int fac(int i){
        int mul = 1;
        for (int j = 1; j <= i; j++){
            mul *= j;
        }
        return mul;
    }



    //求斐波那契数列的第n项。(迭代实现)
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 2){
            System.out.println(1);
        }else{
            fib(n);
        }


    }

    public static void fib(int n) {
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }




    public static void main1(String[] args) {

        // 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
        int[] num = new int[]{1, 9, 9, 5, 4, 5, 4, 1, 3, 7, 3};
        findnumber(num);

    }
    public static void findnumber(int[] num){
        int i = 0;
        int n = 0;
        for( i = 0; i<num.length;i++){
            n ^= num[i];
        }
        System.out.println(n);
    }
}


