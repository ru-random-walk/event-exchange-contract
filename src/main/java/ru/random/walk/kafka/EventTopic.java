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
     * Default private constructor
     */
    private EventTopic(){
    }
}
