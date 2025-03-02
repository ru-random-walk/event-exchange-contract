package ru.random.walk.dto;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing just joined user info.
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#USER_JOIN} Kafka topic.
 *
 * @param userId id of user
 * @param clubId id of club
 */
public record UserJoinEvent(
        UUID userId,
        UUID clubId
) {
}
