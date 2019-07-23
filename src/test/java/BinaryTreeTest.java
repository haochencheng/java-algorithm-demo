import pers.algorthm.demo.binarytree.Node;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-07-22 23:39
 **/
public class BinaryTreeTest {

    public static void main(String[] args) {
        Node node = Node.initTree(3, 5);
        int treeDeep = node.getTreeDeep(node);
        System.out.println(treeDeep);
        Node.levelTree(node);
        Node reNode=new Node("1",new Node("2"),new Node("3"));
        Node.DLRTree(reNode);
    }

}
