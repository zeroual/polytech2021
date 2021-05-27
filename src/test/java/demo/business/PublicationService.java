package demo.business;

import java.util.List;

public interface PublicationService {

    Story publish(Story story);

    List<Story> fetchStories();
}
