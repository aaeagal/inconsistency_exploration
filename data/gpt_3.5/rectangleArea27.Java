public class  RectangularArea {
    public static int getTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int overlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) * Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        return area1 + area2 - overlap;
    }
}
public class RectangleArea {
    public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaRec1 = Math.abs((ax2 - ax1) * (ay2 - ay1));
        int areaRec2 = Math.abs((bx2 - bx1) * (by2 - by1));
        
        return areaRec1 + areaRec2;
    }
}
public class RectanglesArea {
	public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    	int areaA = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
    	int areaB = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
    	int areaOverlap = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1)) *
            	Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
    	return areaA + areaB - areaOverlap;
	}
}
public class RectangleArea {
    public static int calculateArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int area2 = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int intersectionArea = Math.max(Math.min(ax2, bx2) - Math.max(ax1, bx1), 0) * Math.max(Math.min(ay2, by2) - Math.max(ay1, by1), 0);
        return area1 + area2 - intersectionArea;
    }
}

public class Rectangles {
    public static int getTotalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
        int area2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
        int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        int overlapArea = overlapWidth * overlapHeight;

        return area1 + area2 - overlapArea;
    }
}
