package com.almuhannad.app.order.dto;

import com.almuhannad.app.order.entity.User;
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
