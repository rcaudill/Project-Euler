package euler.problems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem018 {
	/**
	 * @euler_problem Problem 18
	 */
	public Problem018() {
		run();
	}
	public static void run() {
		String[][] triangle = new String[][] {
			{"75"},
			{"95","64"},
			{"17","47","82"},
			{"18","35","87","10"},
			{"20","04","82","47","65"},
			{"19","01","23","75","03","34"},
			{"88","02","77","73","07","63","67"},
			{"99","65","04","28","06","16","70","92"},
			{"41","41","26","56","83","40","80","70","33"},
			{"41","48","72","33","47","32","37","16","94","29"},
			{"53","71","44","65","25","43","91","52","97","51","14"},
			{"70","11","33","28","77","73","17","78","39","68","17","57"},
			{"91","71","52","38","17","14","91","43","58","50","27","29","48"},
			{"63","66","04","68","89","53","67","30","73","16","69","87","40","31"},
			{"04","62","98","27","23","09","70","98","73","93","38","53","60","04","23"}};
		TreeNode[][] tree = new TreeNode[triangle.length][triangle[triangle.length-1].length];
		for (int row=0; row<triangle.length; row++) {
			for (int col=0; col<triangle[row].length; col++) {
				tree[row][col] = new TreeNode(triangle[row][col], row, col);
			}
		}
		
		Queue q = new LinkedList();
		q.add(tree[0][0]);
		while(!q.isEmpty()){
			TreeNode temp = (TreeNode)q.remove();
			System.out.print(temp.value + " ");
			if(getChildren(tree, temp) != null && getChildren(tree, temp).get(0) != null) { 
				q.add(getChildren(tree, temp).get(0));
			}
			if(getChildren(tree, temp) != null && getChildren(tree, temp).get(1) != null) {
				q.add(getChildren(tree, temp).get(1));
			}
		}
	}
	private static ArrayList<TreeNode> getChildren(TreeNode[][] tree, TreeNode n) {
		TreeNode l,r;
		try {
			l = tree[n.row+1][n.col];
			r = tree[n.row+1][n.col+1];
		} catch (Exception e) {
			return null;
		}
		
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		result.add(l);
		result.add(r);
		return result;
	}	
}
class TreeNode {
	String value;
	int row;
	int col;
	public TreeNode(String value, int row, int col) {
		this.value = value;
		this.row = row;
		this.col = col;
	}
}
