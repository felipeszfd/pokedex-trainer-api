package io.github.felipeszfd.pokedex_trainer_api.exceptions;

import java.util.List;

public record ErrorResponse(int status, String message, List<FieldError> errors) {
    public record FieldError(String field, String message) {}
}
