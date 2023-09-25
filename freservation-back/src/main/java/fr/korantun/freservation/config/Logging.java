package fr.korantun.freservation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class Logging {

    @Bean
    CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter requestLoggingFilter = new CommonsRequestLoggingFilter();
        requestLoggingFilter.setIncludeClientInfo(true);
        requestLoggingFilter.setIncludeQueryString(true);
        requestLoggingFilter.setIncludePayload(true);
        requestLoggingFilter.setMaxPayloadLength(65536);
        return requestLoggingFilter;
    }
}
