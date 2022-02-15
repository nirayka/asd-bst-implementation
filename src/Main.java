public class Main {
    public static void main(String[] args){
        Tree familyTree = createTree("nirayka mom dad momsMom momsDad dadsMom dadsDad");
        familyTree.traverse();
    }

    public static Tree createTree( String content ) {
        Tree stringTree = new Tree();
        if (content != null) {
            String[] words = content.split( " " );
            stringTree = new Tree();
            for (int i = 0; i < words.length; i++) {
                stringTree.addNode(words[i]);
            }
        }
        return stringTree;
    }

}
