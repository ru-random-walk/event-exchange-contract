package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing an event to add firebase device token to TwitterService
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#ADD_DEVICE}
 *
 * @param userId        id of the user owning the device
 * @param deviceToken   firebase device token for notification sending
 */
@Builder
public record AddDeviceTokenEvent(
        UUID userId,
        String deviceToken
) {
}
