package jcodetest;

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        leverOrder(node);
    }

    private static List<List<Integer>> leverOrder(TreeNode node) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> levelList = new ArrayList<>();

        int inputCountFromLevel = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            for (int i = 0; i < Math.pow(2, inputCountFromLevel); i++) {
                TreeNode currentFirst = queue.pop();
                levelList.add(currentFirst.val);
                queue.add(currentFirst.left);
                queue.add(currentFirst.right);
            }
            inputCountFromLevel++;
            result.add(levelList);
            levelList.clear();
        }

        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
