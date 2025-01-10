public class TwoSum{
        public int[] twoSum(int[] nums, int target) {
            System.out.println(target);
            for(int i = 0 ; i < nums.length; i++){
                for(int j = i; j < nums.length;j++ ){
                    if(nums[i] + nums[j] == target && j != i){
                        
                        int[] arr = {i,j};
                        return arr;
                    }
                }
    
    
            }
    
    
            return null; 
        }
}