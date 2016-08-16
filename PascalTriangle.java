/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i + 1) list.add(1);
                else list.add(result.get(level - 1).get(j - 1) + result.get(level - 1).get(j));
            }
            result.add(list);
            level++;
        }
        return result;
    }
}
