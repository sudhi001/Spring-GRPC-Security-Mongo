import com.nullsafety.webapp.entity.Message;
import com.nullsafety.webapp.repository.MessageRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MessageRepositoryIntegrationTest {

    @Autowired
    private MessageRepository messageRepository;


    @Test
    public void whenReceiveAMessage_ReturnsMessageId() {
        Message message = new Message();
        message.setMessage("Hello");
        message.setName("Sudhi");
        messageRepository.save(message);
        Assertions.assertThat(message.getId()).isNotEmpty();
    }
}