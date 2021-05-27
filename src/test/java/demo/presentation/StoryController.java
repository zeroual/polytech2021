package demo.presentation;

import demo.business.PublicationService;
import demo.business.Story;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StoryController {


    private PublicationService publicationService;

    public StoryController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }


    public void share(String story){
        publicationService.publish(new Story(story));
    }

   synchronized public List<Story> fetchStories() {
        return publicationService.fetchStories();
    }
}