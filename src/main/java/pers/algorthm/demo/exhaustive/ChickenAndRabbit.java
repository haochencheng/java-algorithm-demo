package pers.algorthm.demo.exhaustive;

/**
 * 🐔兔同笼问题
 * 孙子算经，今有🐔🐰同笼，上有35头，下有94足，问🐔🐰各几何
 * @description:
 * @author: haochencheng
 * @create: 2019-07-23 23:53
 **/
public class ChickenAndRabbit {

    public static void main(String[] args) {
        qiongJu(35,94);
    }

    /**
     * 穷举法（暴力破解法）
     * @param head
     * @param foot
     */
    private static void qiongJu(int head,int foot){
        int i,j;
        for (  i=0;i < head; i++) {
            j=head-i;
            if ((i*2+j*4) ==foot){
                System.out.printf("鸡：{%d},兔：{%d} ",i,j);
            }
        }
    }

}
