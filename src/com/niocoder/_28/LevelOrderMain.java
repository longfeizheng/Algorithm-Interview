package com.niocoder._28;

import com.niocoder._17.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderMain {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> tempList = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    tempList.add(poll.val);
                    aa(queue, poll);
                }
                result.add(tempList);
            }
        }
        return result;
    }

    public static void aa(Queue<TreeNode> queue, TreeNode poll) {
        if (poll.left != null) {
            queue.add(poll.left);
        }
        if (poll.right != null) {
            queue.add(poll.right);
        }
    }
}
