import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs; //this declares a variable - all pairs, which is an ArrayList

    //constructor

    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++){
            for (int j = 0; j < words.length; i++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }

    }
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }

    public int numMatches(){
        int counter = 0;
        for(int i = 0; i< allPairs.size(); i++){
            if(allPairs.get(i).getFirstWord().equals(allPairs.get(i).getSecondWord())){
                counter++;
            }
        }
        return counter;
    }
}
