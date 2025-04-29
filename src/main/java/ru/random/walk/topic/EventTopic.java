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
     * The topic with excluding user from club
     */
    public static final String USER_EXCLUDE = "exclude.user";

    public static final String ADD_DEVICE = "add.device";

    /**
     * Topic to send push-notification on user's device
     */
    public static final String SEND_NOTIFICATION = "send.notification";

    /**
     * The topic with information about approved or declined requested appointments
     */
    public static final String REQUESTED_APPOINTMENT_STATE = "get.requested.appointment.state";

    /**
     * Default private constructor
     */
    private EventTopic() {
    }
}
