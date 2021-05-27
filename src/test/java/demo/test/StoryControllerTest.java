package demo.test;

import demo.business.PublicationService;
import demo.business.PublicationServiceImpl;
import demo.business.Story;
import demo.persistence.InMemoryStoryRepository;
import demo.persistence.JdbcStoryRepository;
import demo.persistence.StoryRepository;
import demo.presentation.StoryController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StoryControllerTest {

    @Test
    public void test1() {

        // AnnotationConfigApplicationContext is to start context app
        // is like SpringApplication.run() in spring boot
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // context contain all beans(objects) created by spring

        StoryController storyController = context.getBean(StoryController.class);
        storyController.share("Hello");

        List<Story> stories= storyController.fetchStories();

        Assertions.assertEquals(stories.size(),1);

    }
}
