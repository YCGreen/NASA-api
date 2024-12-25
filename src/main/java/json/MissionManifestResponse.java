package json;

import java.util.Date;

public class MissionManifestResponse {
    private String name;
    private Date landing_date;
    private Date launch_date;
    private String status;
    private int max_sol;
    private Date max_date;
    private int total_photos;

    public String getName() {
        return name;
    }
}
