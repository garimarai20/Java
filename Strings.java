


public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        } System.out.println();
    }

    public static void checkPalindrome(String str){
        boolean y=true;
        int n=str.length()-1;
        for(int i =0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(n-i)){
                    y=false;
                }else y=true;}
                if(y==true){
                System.out.println("yes, "+ str+" is a palindrome");
                }else{System.out.println(str + " is not a palindrome");}
        
    }

    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //South 
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            else{x++;}
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static String subString(String str,int startIn,int endIn){
        String subStr="";
        for(int i=startIn;i<endIn;i++){
            subStr+=str.charAt(i);

        }
        return subStr;
    }

public static String toUpperCase(String str){
    StringBuilder sb= new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' '&& i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    } return sb.toString();
}
public static String compress(String str){
    String newStr= "";
    for(int i=0;i<str.length();i++){
        Integer count =1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count++ ;
            i++ ;
        }
    newStr+=str.charAt(i);
    if(count>1){
        newStr+=count.toString();

    }
} return newStr;
}


    public static void main(String[] args) {
        String str= "aaabbcccdd";
        System.out.println(compress(str));



        // String str="hi, i am garima";
        // System.out.println(toUpperCase(str));

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }System.out.println(sb.length());

        // String fruits[]={"apple","mango","banana"};

        // String largest=fruits[0];
        // for(int i=0;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }}
        //     System.out.println(largest);

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));
        // String str= "garima";
        // checkPalindrome(str);
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2 = new String("xyz");
        // Scanner sc= new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("name is "+name);
        // String fullname="Tony Stark";
        // System.out.println(fullname.length());
        //Concatenation
        // String firstName ="Garima";
        // String lastName = "Rai";
        // String fullName= firstName+" "+lastName;
        // printLetters(fullName);
        /*Strings are IMMUTABLE(cannot be changed)
        new string needs to be made for changes in the previous one. */
        
        /*Strings are IMMUTABLE(cannot be changed)
        new string needs to be made for changes in the previous one. */



    }
    
}
