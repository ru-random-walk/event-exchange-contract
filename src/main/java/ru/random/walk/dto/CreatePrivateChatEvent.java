package ru.random.walk.dto;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing an event to create a private chat with two members.
 * <p>
 * This event must be used with the {@link ru.random.walk.kafka.EventTopic#CREATE_CHAT} Kafka topic.
 */
public record CreatePrivateChatEvent(
        UUID chatMember1,
        UUID chatMember2
) {
}
