package json;

import java.net.URL;
import java.util.Date;

public class Photo {
    private int id;
    private int sol;
    private Camera camera;
    private URL img_src;
    private Date earth_date;
    private Rover rover;

    public int getId() {
        return id;
    }
}
