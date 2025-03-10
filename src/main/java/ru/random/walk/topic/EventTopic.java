package ru.random.walk.topic;

/**
 * Class representing event topics.
 * Topic name must be matches with Pattern: &lt;event&gt;.&lt;entity&gt;
 */
public class EventTopic {
    /**
     * The topic for creating a private chat.
     */
    public static final String CREATE_CHAT = "create.chat";

    /**
     * The topic with information about new random-walk user.
     */
    public static final String USER_REGISTRATION = "registration.user";

    /**
     * The topic with joining user to club
     */
    public static final String USER_JOIN = "join.user";

    /**
     * Default private constructor
     */
    private EventTopic() {
    }
}
