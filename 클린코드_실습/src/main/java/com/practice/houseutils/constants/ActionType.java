package com.practice.houseutils.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ActionType {
    PURCHASE("매매"), RENT("임대차");
    private String description;
}
