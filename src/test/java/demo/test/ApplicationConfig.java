package demo.test;

import demo.business.PublicationService;
import demo.business.PublicationServiceImpl;
import demo.persistence.InMemoryStoryRepository;
import demo.persistence.JdbcStoryRepository;
import demo.persistence.StoryRepository;
import demo.presentation.StoryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
// Configuration class is a factory
@Import(ApplicationConfig2.class)
@PropertySource("classpath:/application.properties")
public class ApplicationConfig {

    // ask spring to inject bean instance
    @Autowired
    private StoryRepository storyRepository;

    @Bean
    public PublicationService publicationService(){
        return new PublicationServiceImpl(storyRepository);
    }
    @Bean
    // by default bean scope is singleton
    @Scope("prototype")
    StoryController storyController(){
        return new StoryController(publicationService());
    }
}
@Configuration
// multiple config is useful when we have a lot of beans
class ApplicationConfig2{

    @Bean
    // a bean is an object created by spring
    public StoryRepository storyRepository(){
        return new JdbcStoryRepository();
    }
}