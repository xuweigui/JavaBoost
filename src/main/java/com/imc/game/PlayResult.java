package com.imc.game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayResult {
    private Play myself;
    private Play opponent;
    private Result result;
}
