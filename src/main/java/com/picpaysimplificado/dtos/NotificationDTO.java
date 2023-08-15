package com.picpaysimplificado.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotificationDTO{
    private String email;
    private String message;
}
