// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        int result = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            long s1 = arr[i];
            while(left < right){
                long s2 = s1 + arr[left] + arr[right];
                
                if(s2 < sum){
                    result += right - left;
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return result;
    }
}
