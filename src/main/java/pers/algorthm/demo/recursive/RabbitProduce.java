package pers.algorthm.demo.recursive;

/**
 * 兔子产仔问题，斐波那契的《算盘书》中，一对两个月大的兔子以后每个月都可以生一只小兔子，而一对
 * 新出生的兔子出生2个月后才可以生小兔子，假定一年内没有发生死亡事件，一年后有多少只兔子
 *
 * @description:
 * @author: haochencheng
 * @create: 2019-07-24 07:11
 **/
public class RabbitProduce {

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    /**
     * 斐波那契数列 递推法
     * @param n
     * @return
     */
    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int i, j;
        i = fibonacci(n - 1);
        j = fibonacci(n - 2);
        return i + j;
    }


}
