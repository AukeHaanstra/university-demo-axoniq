package io.axoniq.demo.university.faculty;

import io.axoniq.demo.university.faculty.write.renamecourse.RenameCourseConfiguration;
import org.axonframework.eventsourcing.configuration.EventSourcingConfigurer;

public class FacultyModuleConfiguration {

    public static EventSourcingConfigurer configure(EventSourcingConfigurer configurer) {
        configurer = RenameCourseConfiguration.configure(configurer);
        return configurer;
    }
}
