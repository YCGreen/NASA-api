package json;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MarsService {
    @GET("rovers/curiosity/photos")
    Single<MarsResponse> getPhotos(
            @Query("earth_date") String earthDate
    );

    @GET("manifests/{rover_name}")
    Single<MissionManifestResponse> getMissionManifest(
            @Path("rover_name") String roverName
    );
}