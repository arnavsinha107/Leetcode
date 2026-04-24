class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie=new Trie();
        for(String str:words){
            trie.insert(str);
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,trie.root,list);
            }
        }





        return list;
        
    }
    public void dfs(char[][] board,int i,int j,Trie.Node node,List<String> list){
        if(i<0||j<0||i>=board.length||j>=board[0].length)return;
        char c=board[i][j];

        if(c=='#' || node.children[c-'a']==null)return;
        node=node.children[c-'a'];
        if(node.word!=null){
            list.add(node.word);
            node.word=null;
        }
        board[i][j]='#';
        dfs(board,i+1,j,node,list);
        dfs(board,i-1,j,node,list);
        dfs(board,i,j+1,node,list);
        dfs(board,i,j-1,node,list);


        board[i][j] = c;
    }
}
class Trie {

    class Node{
        Node[] children=new Node[26];
        String word=null;
    }
    Node root;


    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.word=word;
    }
    
   

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */