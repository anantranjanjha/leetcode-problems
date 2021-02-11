class Solution {
    public int calPoints(String[] ops) {
        int i=0;
        int x=0;
        int y=0,z=0;
        Stack<Integer> in=new Stack<Integer>();
        while(i<ops.length)
        {
        
        if(ops[i].equals("+"))
        {
            x=in.pop();
            y=in.peek();
            in.push(x);
            in.push(x+y);
        }
        else if(ops[i].equals("C"))
        {
                in.pop();
        }
        else if(ops[i].equals("D"))
        {
            x=in.peek();
            in.push(2*x);
        }
        else
        {
            int m=Integer.parseInt(ops[i]);
            in.push(m);
        }
            i++;
    }
        while(!in.empty())
        {
            z=z+in.peek();
            in.pop();
            
        }
        return z;
}
}