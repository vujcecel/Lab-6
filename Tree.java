

public class Tree {
  private String treeName;
  private TreeType treeType;
  private boolean leavesFall;
  private String leafColor;

  public Tree() {
    treeName = "";
    treeType = null;
    leavesFall = false;
    leafColor = "";
  }

  public Tree(String treeName, TreeType treeType, boolean leavesFall, String leafColor) {
    this.treeName = treeName;
    this.treeType = treeType;
    this.leavesFall = leavesFall;
    this.leafColor = leafColor;
  }

  public void print() {
    System.out.printf(
      "This is a %s tree. It is a %s and its leaves are currently %s. It %s lose its leaves for the winter.%n",
      treeName,
      treeType != null ? treeType : "",
      leafColor,
      leavesFall ? "does" : "does not"
    );
  }

  public String getName() {
    return treeName;
  }

  public void setName(String treeName) {
    this.treeName = treeName;
  }

  public TreeType getType() {
    return treeType;
  }

  public void setType(TreeType treeType) {
    this.treeType = treeType;
  }

  public boolean getLeavesFall() {
    return leavesFall;
  }

  public void setLeavesFall(boolean leavesFall) {
    this.leavesFall = leavesFall;
  }

  public String getLeafColor() {
    return leafColor;
  }

  public void setLeafColor(String leafColor) {
    this.leafColor = leafColor;
  }
}