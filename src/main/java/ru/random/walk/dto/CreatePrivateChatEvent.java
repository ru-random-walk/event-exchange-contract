package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Data Transfer Object (DTO) representing an event to create a private chat with two members.
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#CREATE_CHAT} Kafka topic.
 *
 * @param chatMember1 The UUID of the first chat member.
 * @param chatMember2 The UUID of the second chat member.
 */
@Builder
public record CreatePrivateChatEvent(
        UUID chatMember1,
        UUID chatMember2
) {
}
