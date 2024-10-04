import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            // Handle case when asteroid is moving to the right or stack is empty
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                int temp=Math.abs(asteroids[i]);
                // Process the collision with the right-moving asteroids in the stack
                while(!st.isEmpty() && st.peek()>0 && temp>st.peek()){
                    st.pop();
                }
                // If stack is empty or top of stack is left-moving, add the current asteroid
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
                // If top of stack is equal to the incoming asteroid (they annihilate each other)
                if(!st.isEmpty() && st.peek()==temp){
                    st.pop();
                }
                
            }
        }
       // Convert stack to array in correct order-reverse the stack
       int []res=new int[st.size()];
       for(int i=res.length-1;i>=0;i--){
        res[i]=st.pop();
       }
       return res;
    }
}