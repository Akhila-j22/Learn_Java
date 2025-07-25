/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
  
Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
Constraints:
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.*/


/*source code:*/

class JewelsStones{
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            int temp = stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                if(temp==jewels.charAt(j)){
                    ans=ans+1;
                    break;
                }
            }
        }
        return ans;
    }
}
