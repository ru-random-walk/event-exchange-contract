package ru.random.walk.dto;

import lombok.Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing an event to send notification to user device via TwitterService
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#SEND_NOTIFICATION}
 *
 * @param userId    user to send notification
 * @param body      notification body
 * @param title     notification title
 * @param additionalData additional data to attach to notification
 */
@Builder
public record SendNotificationEvent(
        UUID userId,
        String title,
        String body,
        Map<String, Object> additionalData
) {

    public SendNotificationEvent(UUID userId, String title, String body) {
        this(userId, title, body, new HashMap<>());
    }
}
