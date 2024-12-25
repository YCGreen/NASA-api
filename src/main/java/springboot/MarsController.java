package springboot;

import json.MarsResponse;
import json.MarsService;
import json.MarsServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class MarsController {
    MarsServiceFactory factory = new MarsServiceFactory();
    MarsService service = factory.getService();

    @GetMapping("/")
    public String showForm(Model model) {

        MarsResponse marsResponse = service.getPhotos("2015-05-30").blockingGet();
        String image = marsResponse.getPhotos()[0].getImgSrc();
        model.addAttribute("imageUrl", image);
        return "form";
    }

}
