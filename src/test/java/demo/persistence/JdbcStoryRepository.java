package demo.persistence;

import demo.business.Story;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStoryRepository implements StoryRepository {
    @Override
    public Story save(Story story) {

        String sql = "INSERT INTO T_STORY (content) VALUES('" + story.getContent() + "')";
        try {

            Connection connection = getConnexion();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return story;
    }

    private Connection getConnexion() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
    }

    @Override
    public List<Story> findAll() {
        String sql = "SELECT * FROM T_STORY ";
        List<Story> results=new ArrayList<>();
        try {

            Connection connection = getConnexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String content = resultSet.getString("content");
                long id = resultSet.getLong("id");
                Story story = new Story(id, content);
                results.add(story);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
}
