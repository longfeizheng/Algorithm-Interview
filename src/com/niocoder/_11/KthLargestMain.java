package com.niocoder._11;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * 最小堆，优先队列实现
 * Created on 2019/4/6.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class KthLargestMain {

    Queue<Integer> queue;
    int k;

    public KthLargestMain(int k , int[] arr){
        this.k=k;
        queue = new PriorityQueue(k);
        for(int i:arr){
            add(i);
        }
    }

    public int add(int val){
        if(queue.size()<k){
            queue.offer(val);
        }else if(queue.peek()<val){
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {

    }
}
