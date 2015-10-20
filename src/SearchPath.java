import java.util.ArrayList;

/**
 * Created by 1 on 13.10.2015.
 */
public class SearchPath {
    private boolean tabl[][];

    public ArrayList<Integer> getPath() {
        return path;
    }

    public ArrayList<Integer> getViewed() {
        return viewed;
    }

    public ArrayList<String> getManyPath() {
        return manyPath;
    }

    private ArrayList<Integer> path = new ArrayList<Integer>();
    private ArrayList<Integer> viewed = new ArrayList<Integer>();
    private ArrayList<String> manyPath = new ArrayList<String>();
    private int start;
    private int end;
    private int nextIndex = 0;

    public SearchPath(boolean[][] t, int start, int end) {
        tabl = t;
        this.end = end-1;
        this.start = start-1;
        path.add(this.start);
    }

    public void Main() {
        while(!path.isEmpty()) {
            if (path.get(path.size() - 1) != end) {
                Search(nextIndex);
            } else {
                String m = path.toString();
                manyPath.add(m);
                nextIndex = path.get(path.size()-1) + 1;
                path.remove(path.size()-1);
            }
            //return path;
        }
    }

    public void Search(int in) {
        for (int i = in; i < tabl[0].length; i++) {
            if (tabl[path.get(path.size() - 1)][i] && !CheckInPath(i) && !Check(i)) {
                path.add(i);
                nextIndex = 0;
                break;
            }
            else
             if (i == tabl[0].length - 1 && (!tabl[path.get(path.size() - 1)][i] || Check(i))) {
                   if ((path.get(path.size() - 1) + 1 < tabl[0].length)) {
                        nextIndex = (path.get(path.size() - 1)) + 1;
                       viewed.add(path.get(path.size() - 1));
                    }
                 else {
                       nextIndex = path.get(path.size() - 1);
                       viewed.add(path.get(path.size() - 1));
                   }
                    path.remove(path.size() - 1);
                    break;
             }
        }

    }
    public boolean Check(int i) {
        boolean yesOrNo = false;
        for (Integer aViewed : viewed) {
            if (aViewed == i) {
                yesOrNo = true;
            }
        }
        return yesOrNo;
    }
    public boolean CheckInPath(int i) {
        boolean yesOrNo = false;
        for (Integer aPath : path) {
            if (aPath == i) {
                yesOrNo = true;
            }
        }
        return yesOrNo;
    }
}
