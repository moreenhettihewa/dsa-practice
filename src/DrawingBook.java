public class DrawingBook {

    //problem link: https://www.hackerrank.com/challenges/drawing-book/problem

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }

    public static int pageCount(int n, int p) {
        int front = p / 2;
        int back = (n / 2 - p / 2);
        return Math.min(front, back);
    }
}
