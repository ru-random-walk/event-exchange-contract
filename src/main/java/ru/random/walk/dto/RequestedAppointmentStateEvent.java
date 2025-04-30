package ru.random.walk.dto;

import lombok.Builder;

import java.util.UUID;

/**
 * Dto with information about accepted or declined appointment
 * This event must be used with the {@link ru.random.walk.topic.EventTopic#REQUESTED_APPOINTMENT_STATE} Kafka topic.
 * @param appointmentId id of the approved or declined appointment
 * @param isAccepted    true if appointment is accepted, false if declined
 */
@Builder
public record RequestedAppointmentStateEvent(
        UUID appointmentId,
        Boolean isAccepted
) {
}
