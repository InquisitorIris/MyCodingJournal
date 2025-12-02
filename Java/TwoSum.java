class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                return new int[] { map.get(x), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

/*
Create a HashMap:
HashMap<Integer, String> map = new HashMap<>();
key type: Integer
value type: String

Put (Insert a key-value pair)
map.put(1, "Apple");
map.put(2, "Banana");

Get (Retrieve the value for a key)
String fruit = map.get(1); // "Apple"
String fruit1 = map.get(99); // returns null

Check if a key exists
map.containsKey(2); // true
map.containsKey(50); // false

Remove a key
map.remove(1);

Loop through a HashMap
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}
*/
