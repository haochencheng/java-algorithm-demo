package pers.algorthm.demo.recursion;

/**
 * 阶乘算法
 * @description:
 * @author: haochencheng
 * @create: 2019-07-24 07:42
 **/
public class Christian {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        if (n<=1){
            return 1;
        }else {
            return n*fact(n-1);
        }
    }

}
