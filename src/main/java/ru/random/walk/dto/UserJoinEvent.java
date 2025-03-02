package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing just joined user info.
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#USER_JOIN} Kafka topic.
 *
 * @param userId id of user
 * @param clubId id of club
 */
@Builder
public record UserJoinEvent(
        UUID userId,
        UUID clubId
) {
}
