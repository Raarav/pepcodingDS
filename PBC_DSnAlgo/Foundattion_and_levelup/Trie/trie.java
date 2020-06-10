public class Trie{
    static final int ALPHABET_SIZE = 26;
    static class TrieNode{
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
        TrieNode(){
            isEndOfWord = false;
            for(int i = 0; i < ALPHABET_SIZE; i++)
            {
                children[i] = null;
            }
        }
    };

    static TrieNode root;

    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
    }
};