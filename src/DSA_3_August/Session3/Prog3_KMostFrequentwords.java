package DSA_3_August.Session3;
import java.util.*;
class WordCount {
    public String word;
    public int count;

    public WordCount(String word, int count){
        this.word = word;
        this.count = count;
    }
    public  int compareTo(WordCount w2){
        if(this.count == w2.count){
            return this.word.compareTo(w2.word);
        }
        return w2.count - this.count;
    }
}
public class Prog3_KMostFrequentwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<String> vec=new Vector<String>();
        for(int i=0;i<n;i++)
            vec.add(sc.next());
        int k=sc.nextInt();
        Vector<String> ans = frequentWords(vec, k);
        for(int i=0;i<k;i++)
            System.out.println(ans.get(i));
    }

    private static Vector<String> frequentWords(Vector<String> vec, int k) {
        Map<String,Integer> map = new HashMap<>();
        count(map,vec);
        PriorityQueue<WordCount> pq = new PriorityQueue<>(WordCount::compareTo);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.add(new WordCount(entry.getKey(),entry.getValue()));
        }
        Vector<String> ans = new Vector<>();
        for(int i = 0; i < k; i++){
            ans.add(pq.poll().word);
        }
        return ans;
    }

    private static void count(Map<String, Integer> map, Vector<String> vec) {
        for(int i = 0 ; i < vec.size(); i++){
            map.put(vec.get(i),map.getOrDefault(vec.get(i),0)+1);
        }
    }

}
