package ArraysAndHashes;

import java.util.*;

public class TopKElements {
    public int[] topKFrequent1(int[] nums, int k) {
        /*
        input [1,1,1,2,2,3]
        */
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       /* Map looks like this
       {1,3}
       {2,2}
       {3,1}
       */
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

       /* List looks like this
       [
        [3,1],
        [2,2],
        [1,3]
       ]*/
        list.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = list.get(i)[1];
        }
        return res;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        /*
        input [1,1,1,2,2,3]
        */
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       /* Map looks like this
       {1,3}
       {2,2}
       {3,1}
       */
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            heap.offer(new int[] {entry.getValue(), entry.getKey()});
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = heap.poll()[1];
        }
        return res;
    }

    public int[] topKFrequent3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> [] freq = new List[nums.length+1];
        for(int i=0; i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int n: nums)
            map.put(n, map.getOrDefault(n,0)+1);

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index =0;
        for(int i = freq.length -1; i>0 && index<k ;i--){

            for(int n : freq[i]){
                res[index++] = n;
                if (index == k) {
                    return res;
                }

            }
        }
        return res;
    }

}
