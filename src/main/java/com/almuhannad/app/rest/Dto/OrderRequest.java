package com.almuhannad.app.rest.Dto;

import com.almuhannad.app.rest.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderRequest {

    private User user;
}
