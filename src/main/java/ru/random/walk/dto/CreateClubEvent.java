package ru.random.walk.dto;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing an event to create a club.
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#CREATE_CLUB} Kafka topic.
 *
 * @param clubId The UUID of club.
 */
public record CreateClubEvent(
        UUID clubId
) {
}
