package hunghh.dev.spingsecurityjwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * AuthenticationResponse
 */
@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    private final String jwt;

}