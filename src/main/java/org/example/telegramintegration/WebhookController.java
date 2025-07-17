package org.example.telegramintegration;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tan Dang on 16/07/2025
 */
@RestController
@Log4j2
public class WebhookController {

    @PostMapping("/webhook")
    public ResponseEntity<Boolean> webhook(@RequestBody String data) {
        // This endpoint is used to set up the webhook for Telegram
        // You can add logic here to handle the webhook setup if needed
        log.info("webhook data: {}", data);
        return ResponseEntity.ok(true);
    }
}
