package com.api.tweteroo.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(
        @NotBlank @Size(min = 1, max = 30) String username,

        @NotBlank @URL String avatar) {
}
