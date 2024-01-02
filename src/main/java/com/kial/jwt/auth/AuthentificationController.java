package com.kial.jwt.auth;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthentificationController {

    private final AuthentificationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody RegisterRequest request
    )
    {

        return ResponseEntity.ok(service.register(request));

    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (
            @RequestBody AuthentificationRequest request
    )
    {

        return ResponseEntity.ok(service.authenticate(request));

    }
    @GetMapping("/user-info")
    public ResponseEntity<UserInfoResponse> getUserInfo() {
        UserInfoResponse userInfoResponse = service.getUserInfo();
        return ResponseEntity.ok(userInfoResponse);
    }


}
