

public class BackTracking2{
    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return
        }

        //recursion 
        //Yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str,ans,i+1);

    }

    public static void main(String[] args) {
        
    }
}