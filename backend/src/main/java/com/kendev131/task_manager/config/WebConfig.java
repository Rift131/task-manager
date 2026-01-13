package com.kendev131.task_manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** Classes with the @Configuration annotation are the instruction manuals for how
 * to set up the backend of the application at startup. Spring thereby creates a
 * special instance of this Class (a "bean") and executes the configuration methods
 * you create in this class. This logic could be put into main() but this approach,
 * with this annotation, allows Sping to handle the lifecycle of this Class. This
 * is also the common convention that other developers expect to see. **/
@Configuration
/** "WebMvcConfigurer" is a Spring interface that works as a menu of customization
 * options (pre-build methods). In this case, we're using "CORS settings" (see
 * parameter type). We use the keyword "implements" here because it's declaring
 * this class promises to provide these customization methods rather than "extends"
 * which would state this class would inherit behavior from a parent. When you use
 * "implements" you gain access to the interfaces methods. In this case, we gained
 * access to "addCoresMappings" and are making use of it to create/set our applications
 * API methods. **/
public class WebConfig implements WebMvcConfigurer {
    /** This @Override annotation allows us to take any of the methods provided by
     * "WebMVCConfigurer" (there are 12) and provide our own logic. In this case we're overriding
     * "addCorsMappings". You only override the methods you need. Spring provides
     * sensible defaults for everything else. We use the annotation so that the Java compiler
     * safely sees we're intentionally overriding something, other developers clearly see
     * what we're doing and to catch type errors; if you misspell the method name, the compiler will
     * throw an error. "@Override" is not required but IT IS a best practice. **/
    @Override
    public void addCorsMappings(CorsRegistry registry){
        /** We limit Cors Mappings to only our API's that have "api" in the mapping to prevent it
         * from applying to other API's we may not want it to. The allowedOrigins setting to 5173
         * is how the frontend will have to be configured to send its API requests from when that
         * part of the project is reached. By setting the port to 5173, we're telling the browser
         * to not block this port, we trust it. Otherwise, the browser CORS policy will block the
         * traffic.
         *
         * We're specifying all of our CRUD request types here (allowedMethods) because CORS may,
         * by default, block any request that isn't a GET request. Here we're stating the frontend
         * has permission to use any one of these request types. **/
        registry.addMapping("/api/**").allowedOrigins("http://localhost:5173").allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
