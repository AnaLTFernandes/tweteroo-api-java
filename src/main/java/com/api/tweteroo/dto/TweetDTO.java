package com.api.tweteroo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TweetDTO(
        @NotBlank @Size(min = 1, max = 30) String username,
        @NotBlank @Size(min = 1, max = 255) String tweet) {
}
