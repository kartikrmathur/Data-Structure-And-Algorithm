package Leetcode.FirstOccurenceInString;

public class Jumpgame2 {
        public int jump(int[] nums) {
            // given :- 0 indexed array -> length = n
            // initial position = 0 -> nums[0]
            int min_of_jumps = 0;
            int destination = 0;
            int position_while_jumping = 0;

            // int final_destination = nums.length -1;

            for (int i=0;i<nums.length -1;++i){
                // nums[i] -> max length of forward jump from index i.
                destination = Math.max(destination, i+nums[i]);
                if(destination >= nums.length -1 ){
                    ++min_of_jumps;
                    break;
                }
                // you can jump to any nums[i+j]
                // 0 <= j <= nums[i]
                // i + j < n
                if(i==position_while_jumping){
                    ++min_of_jumps;
                    position_while_jumping = destination;
                }
            }
            // return min of jumps to reach [n-1] -> final destination will be n-1 i.e length-1
            return min_of_jumps;
        }
}
