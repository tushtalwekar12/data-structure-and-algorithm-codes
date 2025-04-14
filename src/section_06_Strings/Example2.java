package section_06_Strings;
// Given a route containing 4 direction (E,W,N,S)
// Find the shortest path to reach direction
public class Example2 {
    public static float getShortestPath(String path){
        int x =0, y=0;

        for (int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if (dir == 'S'){
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        // take Square root
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String path ="WNEENESENNN";// 5
        System.out.println(getShortestPath(path));
    }
}
