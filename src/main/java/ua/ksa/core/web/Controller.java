package ua.ksa.core.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public final static String ECHO = "/echo";
    public final static String ECHO_DB = "/echo-db";

    @GetMapping(path = ECHO)
    public ResponseEntity<Response> echo() {
        return ResponseEntity.ok(new Response("ok"));
    }


    private final class Response {
        private final String message;

        @JsonCreator
        private Response(@JsonProperty("message") String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
