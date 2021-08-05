//package happygoat.springapp.miniboard.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.UrlBasedViewResolver;
//
//@EnableWebMvc
//@Configuration
//@ComponentScan(basePackages = "happygoat.springapp")
//public class WebConfig implements WebMvcConfigurer {
//
//    // == constants ==
//    public static final String PREFIX = "/MiniBoard/MiniBoard.main/templates/";
//    public static final String SUFFIX = ".html";
//
//    // == bean methods
//    @Bean
//    public ViewResolver viewResolver() {
//        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix(PREFIX);
//        viewResolver.setSuffix(SUFFIX);
//        return viewResolver;
//    }
//
//}
