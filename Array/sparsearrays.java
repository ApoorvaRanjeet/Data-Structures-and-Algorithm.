import java.util.ArrayList;
import java.util.List;

public class sparsearrays 
{
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries)
    {
        // stringList = ['ab','abc','ab']  queries = ['ab','abc,'bc']
        // I have to check how many times each string of query occured in the string list
        int n = queries.size();
    int m = stringList.size();
    List<Integer> result = new ArrayList<>();
    int count;
    for (int i = 0; i < n; i++) {
        count = 0;
        String currentQuery = queries.get(i);
        for (int j = 0; j < m; j++) {
            if (currentQuery.equals(stringList.get(j))) {
                count++;
            }
        }
        result.add(count);
    }
    return result;
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aba");
        stringList.add("baba");
        stringList.add("aba");
        stringList.add("xzxb");
        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        List<Integer> result = new ArrayList<>();
        result=matchingStrings(stringList, queries);
        System.out.print(result);
    }
    
}
