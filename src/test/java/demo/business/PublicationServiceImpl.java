package demo.business;

import demo.persistence.StoryRepository;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class PublicationServiceImpl implements PublicationService {
    private StoryRepository storyRepository;

    @Value("${story-max-length}")
    private int storyMaxLength;

    public PublicationServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Override
    public Story publish(Story story) {
        if(story.getContent().length()> storyMaxLength){
            return null;
        }
        return storyRepository.save(story);
    }

    @Override
    public List<Story> fetchStories() {
        return storyRepository.findAll();
    }
}
