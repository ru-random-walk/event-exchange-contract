package ru.random.walk.dto;

import lombok.Builder;

/**
 * Event to send email to recipient
 * <p>
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#SEND_EMAIL}
 *
 * @param recipient email to send message
 * @param subject   title of the message
 * @param body      content of the message
 * @param isHtml    determines whether the message content is html or not
 */
@Builder
public record SendEmailEvent(
        String recipient,
        String subject,
        String body,
        boolean isHtml
) {}
