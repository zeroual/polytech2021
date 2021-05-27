package demo.persistence;

import demo.business.Story;

import java.util.List;

public interface StoryRepository {
    Story save(Story story);

    List<Story> findAll();
}
