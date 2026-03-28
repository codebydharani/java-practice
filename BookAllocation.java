public class BookAllocation {
public static boolean canAllocate(int[] books, int students, int maxPages) {
        int count = 1;
        int pages = 0;
        for (int book : books) {
            if (pages + book <= maxPages) {
                pages += book;
            } else {
                count++;
                pages = book;
            }
        }
        return count <= students;
    }
    public static int allocate(int[] books, int students) {
        int low = 0, high = 0;
        for (int book : books) {
            low = Math.max(low, book);
            high += book;
        }
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canAllocate(books, students, mid)) {
                ans = mid;
                high = mid - 1; // minimize
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println(allocate(books, students));
    }
}