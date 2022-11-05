class Solution {
    Set<String> ans = new HashSet<>();
    public List<String> findWords(char[][] board, String[] words) {

        Trie trie = new Trie();
        for(String word : words){
            trie.insert(word);
        }

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dfs(board, i, j, "", trie.root);
            }
        }
        return new ArrayList<>(ans);
    }

    private void dfs(char[][] board, int i, int j, String str, TrieNode trie) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '#') return;

        if(trie.children[board[i][j] - 'a'] == null) return;

        str += board[i][j];
        trie = trie.children[board[i][j] - 'a'];
        
        if(trie.isWord){
            ans.add(str);
        }

        char originalCh = board[i][j];
        board[i][j] = '#';
        dfs(board, i + 1, j, str, trie);
        dfs(board, i -1 , j, str, trie);
        dfs(board, i, j + 1, str, trie);
        dfs(board, i, j - 1, str, trie);
        board[i][j] = originalCh;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    Boolean isWord = false;
}

class Trie{
    TrieNode root;
    Trie() {
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;
        for(int i = 0; i< word.length(); i++){
            if(node.children[word.charAt(i) - 'a'] == null){
                node.children[word.charAt(i) - 'a'] = new TrieNode();
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = true;
    }
}