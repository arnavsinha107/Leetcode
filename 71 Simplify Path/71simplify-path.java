class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
  
        String[] p=path.split("/");
        StringBuilder sb=new StringBuilder();
        sb.append("/");
        for(int i=0;i<p.length;i++){
            if(p[i].length()>0&&p[i].charAt(0)!=' ')s.push(p[i]);
            if(p[i].equals("..")){
                if(!s.isEmpty()) s.pop();
                if(!s.isEmpty()) s.pop();

            }
            else if(p[i].equals(".")){
                if(!s.empty()) s.pop();
            }


        }
        /*for(int i=0;i<p.length;i++){

            System.out.print(p[i]+" ");
        }*/
        //System.out.print("\n"+s);
        if(p.length==0) return "/";
        Stack<String> stack=new Stack<>();
        while(!s.empty()){
            stack.push(s.pop());
        }
        
        while(!stack.empty()){
            sb.append(stack.pop());
            if(!stack.empty())sb.append("/");
        }
        return sb.toString();
    }
}