class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List list = new ArrayList<>();
        int arr = 0;
        for(int i=0;i<candies.length;i++){
            arr = Math.max(arr,candies[i]);
        }
            for(int j=0;j<candies.length;j++){
                if((candies[j] + extraCandies) >= arr){
                    list.add(j,true);
                
                }else{
                    list.add(j,false);
                }
                
                }
                return list;
            }
        
    }

