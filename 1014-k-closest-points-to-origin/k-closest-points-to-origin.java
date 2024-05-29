class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Create a max-heap using a priority queue with a custom comparator
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        // Iterate over each point
        for (int[] point : points) {
            // Add the current point to the max-heap
            maxHeap.offer(point);
            // If the heap size exceeds k, remove the point with the largest distance
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Extract the k closest points from the heap
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
