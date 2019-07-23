package pers.algorthm.demo.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-07-22 22:13
 **/
public class Node {

    private String data;
    private Node left;
    private Node right;

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    private static Random random = new Random();

    public static Node initTree(int depLeft, int depRight) {
        Node node = getRandomNode();
        Queue<Node> queue = new LinkedList();
        queue.add(node);
        int i = 0, j = 0;
        while (!queue.isEmpty() && (i++ < depLeft+1 || j++ < depRight+1)) {
            Node tmpNode = queue.poll();
            if (i < depLeft && tmpNode.left == null) {
                tmpNode.left = getRandomNode();
                queue.offer(tmpNode.left);
            }
            if (j < depRight && tmpNode.right == null) {
                tmpNode.right = getRandomNode();
                queue.offer(tmpNode.right);
            }
        }
        return node;
    }

    private static Node getRandomNode() {
        return new Node(getLowerLetter());
    }

    private static String getLowerLetter() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        int length = random.nextInt(5);
        for (int i = 0; i < length; ++i) {
            sb.append(str.charAt(random.nextInt(26)));
        }
        return sb.toString();
    }

    /**
     * 二叉树深度
     * @param node
     * @return
     */
    public int getTreeDeep(Node node) {
        int depLeft, depRight;
        if (node == null) {
            return 0;
        } else {
            depLeft = getTreeDeep(node.left);
            depRight = getTreeDeep(node.right);
            return depLeft < depRight ? depRight + 1 : depLeft + 1;
        }
    }

    /**
     * 层次遍历
     * @param node
     */
    public static void levelTree(Node node){
        Node p;
        int maxLen=100;
        Node[] q=new Node[maxLen];
        //双指针 head 头指针 tail 元素队列
        int head=0,tail=0;
        if (node!=null){
            tail=(tail+1)%maxLen;
            q[tail]=node;
        }
        while (head!=tail){
            head=(++head)%maxLen;
            p=q[head];
            if (p!=null){
                System.out.printf( " %s ",p.data);
                if (p.left!=null){
                    q[tail++]=p.left;
                }
                if (p.right!=null){
                    q[tail++]=p.right;
                }
            }
        }
    }

    /**
     * 前序遍历
     *      D
     *     / \
     *     L  R
     *  DLR 先访问D，在访问L，在访问R
     * @param node
     */
    public static void DLRTree(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.data);
        DLRTree(node.left);
        DLRTree(node.right);
    }

    /**
     * 中序遍历
     *  LDR
     * @param node
     */
    public static void LDRTree(Node node){
        if (node==null){
            return;
        }
        LDRTree(node.left);
        System.out.println(node.data);
        LDRTree(node.right);
    }


    /**
     * 后续遍历
     *  LDR
     * @param node
     */
    public static void LRDTree(Node node){
        if (node==null){
            return;
        }
        LRDTree(node.left);
        LRDTree(node.right);
        System.out.println(node.data);
    }




}
