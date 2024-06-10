
class Sqrt {
    static int findsqrt(int n){
    int start=0;
    int end=n;
    int mid=start+(end-start)/2;
    int target=n;
    int ans=-1;
    while(start<=end){
        if(mid*mid==target){
            return mid;
        }
        if(mid*mid<target){
            ans=mid;
            start=mid+1;
        }
        if(mid*mid>target){
            end=mid-1;
        }
        mid=start+(end-start)/2;
    }
    return ans;
}
    public static void main(String[] args) {
    int ans=findsqrt(52);
    System.out.println(ans);
    }
    
}



