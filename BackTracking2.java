

public class BackTracking2{

    public static void findPermutation(String str, String ans){
      //base case  
      if(str.length()==0){
      System.out.println(ans);
      return;
      }
      //recursion 
        for(int i =0; i<str.length(); i++){
            char curr = str.charAt(i);
            String nstr= str.substring(0,i) +str.substring(i+1) ;
            findPermutation(nstr, ans+curr);

        }
    }

    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, "");
    }
}
//     public static void findSubsets(String str, String ans, int i){
//         //base case
//         if(i==str.length()){
//             if(ans.length() ==0){
//                 System.out.println("null");
//             }else{
//             System.out.println(ans);
//             return;
//         }}

//         //recursion 
//         //Yes choice 
//         findSubsets(str, ans+str.charAt(i), i+1);

//         //No choice
//         findSubsets(str,ans,i+1); 

//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }