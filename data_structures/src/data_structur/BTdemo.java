package data_structur;

import java.util.*;

/**
 *
 * @author ziade
 */
public class BTdemo {

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        StopWatch Timer = new StopWatch();
                Timer.setstartime(System.currentTimeMillis());

        int childe_root_value = 0;
        double tree_ratio = 0, total_nums = 0, counter_N = 0;
        int count = 0;
        double user_ratio = s.nextDouble();
        int root_value = s.nextInt();
        Node root = new Node(root_value);
        BinaryTree bt = new BinaryTree(root);
        while (user_ratio > tree_ratio && childe_root_value != -1) {
            counter_N++;
            childe_root_value = s.nextInt();
            Node newNode = new Node(childe_root_value);
            bt.addNode(newNode, bt.root);
            count = bt.getCount();
            total_nums = (counter_N + 1) - count;
            tree_ratio = (counter_N + 1) / total_nums;

        }
        System.out.println("ratio : " + tree_ratio);
        if (user_ratio <= tree_ratio) {
            System.out.println("many repetions");
        } else {
            System.out.println("few repetions");
        }
         Timer.setendtime(System.currentTimeMillis());
        double starttime = Timer.getstarttime();
        double endtime = Timer.getendtime();
        System.out.println("Excution time:\t" + Timer.gettimeelapsed(endtime, starttime));
    }
}
