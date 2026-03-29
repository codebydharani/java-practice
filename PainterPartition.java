public class PainterPartition {
public static boolean canPaint(int[] boards, int painters, int maxTime) {
        int count = 1;
        int time = 0;
        for (int board : boards) {
            if (time + board <= maxTime) {
                time += board;
            } else {
                count++;
                time = board;
            }
        }
        return count <= painters;
    }
    public static int solve(int[] boards, int painters) {
        int low = 0, high = 0;
        for (int b : boards) {
            low = Math.max(low, b);
            high += b;
        }
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPaint(boards, painters, mid)) {
                ans = mid;
                high = mid - 1; // minimize
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int painters = 2;
        System.out.println(solve(boards, painters));
    }
}