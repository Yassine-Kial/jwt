package com.kial.jwt.auth;

import lombok.Data;

@Data
public class UserInfoResponse {

    private String firstName;
    private String lastName;
    private String email;

}
