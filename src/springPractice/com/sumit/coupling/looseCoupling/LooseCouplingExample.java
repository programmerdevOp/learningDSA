package springPractice.com.sumit.coupling.looseCoupling;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();

        for (String query : queries) {

            for (String s : dictionary) {
                int diff = 0;
                System.out.println("hey");

                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != s.charAt(i)) {
                        diff++;
                    }

                    if (diff > 2)
                        break;
                }

                if (diff <= 2) {
                    result.add(query);
                    break;
                }
            }
        }

        return result;
    }
}