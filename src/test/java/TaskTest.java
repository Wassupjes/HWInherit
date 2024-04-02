import org.example.Epic;
import org.example.Meeting;
import org.example.SimpleTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TaskTest {
    @Test
    public void matchesForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(13, "Покормить кота");

        boolean actual = simpleTask.matches("кота");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void matchesForMeeting() {
        Meeting meeting = new Meeting(
                855,
                "Заседание парламента",
                "Повышение возраста молодежи",
                "Ровно в 9 утра во вторник"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Заседание");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForEpic() {

        String[] subtasks = {"Пить пиво", "Смотреть на костер", "Думать о вечном"};
        Epic epic = new Epic(22, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Пить пиво");

        Assertions.assertEquals(expected, actual);
    }
}
