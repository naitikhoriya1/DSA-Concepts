public class shortes_path {
    public static float shortestPath(String str){
        int x = 0, y = 0;
        for(int i = 0; i<str.length();i++){
            char dir = str.charAt(i);
            //south
            if (dir == 'S') {
                y--;
            }
            
            // north
            else if (dir == 'N') {
                y++;
            }
            //east

            else if (dir == 'W') {
                x--;
            }
            //west

            if (dir == 'E') {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str = "NS";
        System.out.println(shortestPath(str));
    }
}
