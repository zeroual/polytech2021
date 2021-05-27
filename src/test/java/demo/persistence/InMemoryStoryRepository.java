package demo.persistence;

import demo.business.Story;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InMemoryStoryRepository implements StoryRepository {

    Set<Story> db = new HashSet<>();
    @Override
    public Story save(Story story) {
         db.add(story);
        return story;
    }

    @Override
    public List<Story> findAll() {
        return new ArrayList<>(db);
    }
}
