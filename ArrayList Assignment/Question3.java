import java.util.ArrayList;

class Question3 {

    public static void removeConsecutives(ArrayList<Integer> nums) {
        int lastValue=nums.get(0);
        for(int i=1;i<nums.size();){
            if(lastValue==nums.get(i))nums.remove(i);
            else{
                lastValue=nums.get(i);
                i++;
            }
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
        //should output [1,2,3,1]
    }

    
}