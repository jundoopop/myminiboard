package happygoat.springapp.miniboard.service;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.util.Arrays;
import java.util.List;

public class urlHandler {

    @Bean
    public ResourceHttpRequestHandler requestHandler() {

        List<String> location = Arrays.asList(new String[]{"/", "classpath:resources/templates/"});
        ResourceHttpRequestHandler phr = new ResourceHttpRequestHandler();

        phr.setLocationValues(location);

        return phr;
    }
}
