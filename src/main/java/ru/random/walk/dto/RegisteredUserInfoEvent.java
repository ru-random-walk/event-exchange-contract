package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing just registered user information.
 * <p>
 * This event must be used with the {@link ru.random.walk.kafka.EventTopic#USER_REGISTRATION} Kafka topic.
 *
 * @param id            id of user
 * @param fullName      user name
 */
@Builder
public record RegisteredUserInfoEvent(
        UUID id,
        String fullName
) {
}
