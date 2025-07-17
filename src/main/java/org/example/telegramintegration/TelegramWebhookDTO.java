package org.example.telegramintegration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Tan Dang on 17/07/2025
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TelegramWebhookDTO {
    @JsonProperty("update_id")
    private Integer updateId;

    private Object message;
}
