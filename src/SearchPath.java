import java.util.ArrayList;

/**
 * Created by 1 on 13.10.2015.
 */
public class SearchPath {
    private ArrayList<ArrayList<Integer>> tabl = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> path = new ArrayList<Integer>();
    private ArrayList<Integer> viewed= new ArrayList<Integer>();
    private Integer start;
    private Integer end;

    public void SearchPath() {

    }

    public int SearchInTabl() {
        path.add(start);

        int numberString = 0;
        for (int i = 1; i < tabl.get(0).size(); i++) {
            if (tabl.get(start).get(i) == 1) {
                if (tabl.get(0).get(i) != end) {
                    path.add((tabl.get(0).get(i)));
                }
            }


        }
        return numberString;
    }

    public int SearchStart() {
        int numberString = -101;
        for (int i = 0; i < tabl.size(); i++) {
            if(start == tabl.get(i).get(0));
            numberString = i;
        }
        return numberString;
    }
    public  int Search(int str, int stolb) {
        int next = -102;
        for (int i = stolb; i < tabl.get(str).size(); i++) {
            if (tabl.get(str).get(i) == 1) {
                next = tabl.get(0).get(i);
                break;
            }
        }
        return next;
    }
}
