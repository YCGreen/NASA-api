import io.reactivex.rxjava3.schedulers.Schedulers;
import json.MarsResponse;
import json.MarsService;
import json.MarsServiceFactory;
import json.MissionManifestResponse;

public class Main {
    public static void main(String[] args) {
        MarsServiceFactory factory = new MarsServiceFactory();
        MarsService service = factory.getService();

        String roverName = "curiosity";

        MarsResponse marsResponse = service.getPhotos("2024-12-12").blockingGet();
        System.out.println(marsResponse.getPhotos()[0].getId());
    }
}
