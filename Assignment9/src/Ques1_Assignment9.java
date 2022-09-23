//import com.sun.source.tree.BinaryTree;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashMap;
import java.util.HashSet;

class Node{
    String keys;
    Node leftSubTree;
    Node rightSubTree;

    public Node(String keys) {
        this.keys=keys;
        leftSubTree=null;
        rightSubTree=null;
    }

    public Node() {
        this("NA");
    }

    @Override
    public String toString() {
        return "Node{" +
                "keys='" + keys + '\'' +
                ", leftSubTree=" + leftSubTree +
                ", rightSubTree=" + rightSubTree +
                '}';
    }

    public void showData(){
        String data="Node{" +
                "keys='" + keys + '\'' +
                ", leftSubTree=" + leftSubTree +
                ", rightSubTree=" + rightSubTree +
                '}';
        System.out.println(data);
    }
}

class BinarySearchTree{

    int size;
    Node rootNode;
    Node lastAddedNode;

    public BinarySearchTree() {
        System.out.println("Binary Tree of size:"+size+ "and root node as :"+rootNode);
    }

    public Node insert(String data){

        size++;
        Node node=new Node(data);

        if (rootNode==null){
            rootNode=node;
            System.out.println("Root node added");
            rootNode.showData();
            System.out.println("RootNode is:"+rootNode+" and size is:"+size);

        }

        return null;
    }
}

public class Ques1_Assignment9 {

    public static void main(String [] args){

        BinarySearchTree binarySearchTree=new BinarySearchTree();

        //String[] names = {"micheal","manoj","dinesh","carmelita","uma","vinu","victory"};
        binarySearchTree.insert("ten");
        HashSet<Character> hashSet=new HashSet<Character>();
        hashSet.add('a');
        hashSet.size();
        HashMap<Character,Integer>map=new HashMap<>();
        map.getOrDefault('a',0);

    }
}
