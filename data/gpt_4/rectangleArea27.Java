public class Main {
	public static void main(String [] args) {
		System.out.println(totalAreaCovered(-3,-4,5,6,-1,-2,7,8));             // Example call to function
	}

	public static int totalAreaCovered(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
		int area1 = (ax2 - ax1) * (ay2 - ay1);
		int area2 = (bx2 - bx1) * (by2 - by1);
		
		int overlapX = Math.min(ax2, bx2) - Math.max(ax1, bx1);
		int overlapY = Math.min(ay2, by2) - Math.max(ay1, by1);
		
		int overlapArea = 0;
		if (overlapX > 0 && overlapY > 0) {
			overlapArea = overlapX * overlapY;
		}

		int totalArea = area1 + area2 - overlapArea;
		return totalArea;
	}
}
public class RectangleArea {
    public static int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);

        int overlap = 0;
        if (right > left && top > bottom) {
            overlap = (right - left) * (top - bottom);
        }

        return area1 + area2 - overlap;
    }
}
public class Solution {
	public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    	int area1 = (ax2 - ax1) * (ay2 - ay1);
    	int area2 = (bx2 - bx1) * (by2 - by1);
   	 
    	int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
    	int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
   	 
    	int overlapArea = 0;
    	if (overlapWidth > 0 && overlapHeight > 0) {
        	overlapArea = overlapWidth * overlapHeight;
    	}
   	 
    	return area1 + area2 - overlapArea;
	}
}
public int totalArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    // Calculate the area of each rectangle.
    int area1 = (ax2 - ax1) * (ay2 - ay1);
    int area2 = (bx2 - bx1) * (by2 - by1);

    // Calculate the overlap area.
    int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
    int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);

    int overlapArea = 0;

    if (overlapWidth > 0 && overlapHeight > 0) {
        overlapArea = overlapWidth * overlapHeight;
    }

    return area1 + area2 - overlapArea;
}

public int areaCovered(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    
    int area1 = (ax2 - ax1) * (ay2 - ay1);
    int area2 = (bx2 - bx1) * (by2 - by1);
    
    int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
    int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
    
    int overlapArea = overlapX * overlapY;
    
    int totalArea = area1 + area2 - overlapArea;
    
    return totalArea;
}
