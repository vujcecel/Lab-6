class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", TreeType.broadleaf, true, "red");

    tree1.print();
    tree2.print();
    
    tree1.setName("spruce");
    tree1.setType(TreeType.conifer);

    tree1.print();
  }
}