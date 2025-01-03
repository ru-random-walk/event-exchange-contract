package ru.random.walk.kafka;

/**
 * Class representing Kafka event topics.
 * Topic name must be matches with Pattern: &lt;event&gt;.&lt;entity&gt;
 */
public class EventTopic {
    /**
     * The Kafka topic for creating a private chat.
     */
    public static final String CREATE_CHAT = "create.chat";

    /**
     * The Kafka topic with information about new random-walk user.
     */
    public static final String USER_REGISTRATION = "registration.user";

    /**
     * Default private constructor
     */
    private EventTopic(){
    }
}
