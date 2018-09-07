package com.example.demo.vm;

import com.example.demo.vm.valid.EnglishNoNumberNoSpecialChar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    @EnglishNoNumberNoSpecialChar(message = "User Name value incorrect.")
    private String name;
    @EnglishNoNumberNoSpecialChar(message = "password value incorrect.")
    private String password;
}
