class Solution {
    public boolean isPalindrome(int x) {
        int reversedvalue=0;
        int x2=x;
        while(x>0){
            reversedvalue= x%10 + reversedvalue*10;
            x/=10;
        }
        if(reversedvalue==x2){
            return true;
        }else{
            return false;
        }

    }
}