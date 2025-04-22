package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing just excluded user info.
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#USER_EXCLUDE} Kafka topic.
 *
 * @param userId id of excluded user
 * @param clubId id of club
 */
@Builder
public record UserExcludeEvent(
        UUID userId,
        UUID clubId
) {
}
