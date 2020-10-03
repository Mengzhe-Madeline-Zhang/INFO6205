package edu.northeastern.mengzhe;

class Q19 {
    public String removeKdigits(String num, int k) {

        if(k>=num.length()||num.length()==0)
            return "0";

        Stack<Integer>stack=new Stack<>();
        stack.push(num.charAt(0)-'0');
        for(int i=1;i<num.length();i++)
        {
            int now=num.charAt(i)-'0';

            while(!stack.isEmpty()&&k>0&&now<stack.peek()){
                stack.pop();
                k--;
            }

            if(now!=0||!stack.isEmpty())
            {
                stack.push(now);
            }
        }

        while(k>0)
        {
            k--;
            stack.pop();
        }

        if(stack.isEmpty())
            return "0";
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
    
        return sb.reverse().toString();
    }
}