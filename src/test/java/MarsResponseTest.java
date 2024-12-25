import json.MarsResponse;
import json.MarsService;
import json.MarsServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsResponseTest {

    @Test
    void marsResponse() {
        MarsServiceFactory factory = new MarsServiceFactory();
        MarsService service = factory.getService();
        MarsResponse marsResponse = service.getPhotos("2015-05-30").blockingGet();
        int actual = marsResponse.getPhotos()[0].getId();
        assertEquals(102693, actual);
    }
}
