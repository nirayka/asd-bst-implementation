import java.util.ArrayList;

public class Tree {
    private String data;
    private Tree left;
    private Tree right;
    private static int branchCounter = 0;

    public Tree() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public Tree(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void addNode(String data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (this.left != null) {
                this.left.addNode(data);
            } else if (this.right != null) {
                this.right.addNode(data);
            } else if (branchCounter % 2 == 0) {
                this.left = new Tree(data);
                branchCounter++;
            } else {
                this.right = new Tree(data);
                branchCounter++;
            }
        }
    }

    public void traverse() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.traverse();
        }
        if (this.right != null) {
            this.right.traverse();
        }
    }

    public void search(String token) {
        ArrayList<String> nodes = new ArrayList<String>();
        nodes.add(this.data);


    }

    public void traverseWithoutPrint() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.traverse();
        }
        if (this.right != null) {
            this.right.traverse();
        }
    }



}