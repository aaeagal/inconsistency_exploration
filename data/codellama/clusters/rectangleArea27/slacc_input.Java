public class Solution {
    public int getArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 1
        int area2 = (bx2 - bx1) * (by2 - by1); // 2
        int intersectionWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 3
        int intersectionHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 4
        int intersectionArea = Math.max(intersectionWidth, 0) * Math.max(intersectionHeight, 0); // 5
        return area1 + area2 - intersectionArea;
    }

    public int getTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 6
        int area2 = (bx2 - bx1) * (by2 - by1); // 7
        return area1 + area2;
    }
    public double getTotalArea3(double ax1, double ay1, double ax2, double ay2, double bx1, double by1, double bx2, double by2) {
        double area1 = (ax2 - ax1) * (ay2 - ay1); // 8
        double area2 = (bx2 - bx1) * (by2 - by1); // 9
        return area1 + area2;
    }

    public static int calculateAre4a(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1); // 10
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1); // 11
        int intersectionArea = Math.max(Math.min(ax2, bx2) - Math.max(ax1, bx1), 0) * Math.max(Math.min(ay2, by2) - Math.max(ay1, by1), 0); // 12
        return area1 + area2 - intersectionArea;
    }


    public int getAre7a(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1); // 13
        int area2 = (bx2 - bx1) * (by2 - by1); // 14
        int intersectionWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1); // 15
        int intersectionHeight = Math.min(ay2, by2) - Math.max(ay1, by1); // 16
        int intersectionArea = Math.max(intersectionWidth, 0) * Math.max(intersectionHeight, 0); // 17
        return area1 + area2 - intersectionArea;
    }
}
