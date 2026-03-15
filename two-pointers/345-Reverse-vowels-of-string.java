// 345-Reverse-vowels-of-string
// Easy String 2 pointer problm


class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0 , right = s.length() - 1 ;
        while(left < right) {
            if(!isvowel(arr[left])) left++;
            else if(!isvowel(arr[right])) right-- ;
            if(isvowel(arr[left]) && isvowel(arr[right])){
                char temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp ;
                left++ ;
                right-- ;
            }    
        }
        return new String(arr);
    }
    public Boolean isvowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ;
    }
}
