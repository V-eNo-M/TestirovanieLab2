/**
 * Created by 1 on 13.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        boolean[][] t = {{false,false,false,true,false},
                         {false,false,true,true,true},
                         {false,true,false,false,false},
                         {true,true,false,false,false},
                         {false,true,false,false,false}};

        SearchPath m = new SearchPath(t,1,3);
        m.Main();
        for (int i = 0; i < m.getManyPath().size(); i++) {
            System.out.print("Path " + i+1 + " " + m.getManyPath().get(i));
        }
        System.out.println("");
        System.out.print("Viewed ");
        for (int i = 0; i < m.getViewed().size(); i++) {
            System.out.print(" " + m.getViewed().get(i));
        }
    }
}
