package pers.algorthm.demo.separation;

/**
 * 寻找假币，假币比真币轻
 *
 * @description:
 * @author: haochencheng
 * @create: 2019-07-24 07:53
 **/
public class LookupCoin {

    public static void main(String[] args) {
        System.out.println(falseCoin(new int[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, 1, 9));
    }

    public static int falseCoin(int[] coin, int low, int height) {
        if (low >= height) {
            if (coin[height] == coin[low]) {
                return 0;
            }
            return coin[height] > coin[low] ? low : height;
        }
        int mid = (height - low) / 2 + low;
        int left = falseCoin(coin, low, mid - 1);
        int right = falseCoin(coin, mid + 1, height);
        return left > right ? left : right;
    }

}
