import org.example.SimpleTask;
import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TaskTest {
    @Test
    public void matchesForSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(13, "Покормить кота");

        Task task = new Task(20);

        task.matches(String.valueOf(simpleTask));

        boolean expected = false;
        boolean actual = task.matches(String.valueOf(false));

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void matchesForMeeting() {
//        Meeting meeting = new Meeting(
//                855,
//                "Заседание парламента",
//                "Повышение возраста молодежи",
//                "Ровно в 9 утра во вторник"
//        );
//        Task task = new Task(855);
//
//        task.matches();
//
//        boolean expected = true;
//        boolean actual = task.matches(true);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void matchesForEpic() {
//
//        String[] subtasks = {"Пить пива", "Смотреть на костер", "Думать о вечном"};
//        Epic epic = new Epic(22, subtasks);
//
//        Task task = new Task(22);
//
//        task.matches();
//
//        boolean expected = true;
//        boolean actual = task.matches(true);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
