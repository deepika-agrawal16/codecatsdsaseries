class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int add = 0;
        for(int i=0;i<nums.size();i++){
            Boolean b;
            b = isRight(i,k);
            if(b==true){
                add = add+nums.get(i);
            }
        }
        return add;
        
    }
    public Boolean isRight(int n,int k){
        int c = 0;
        String str = Integer.toString(n,2);
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)== '1'){
                c++;
            }
        }
        if(c==k){
            return true;
        }
        return false;
    }
}
