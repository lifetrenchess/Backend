package cts.tpm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve uploaded images from the uploads directory
        // This allows the API Gateway to serve images through /api/packages/images/
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:uploads/");
    }
} 