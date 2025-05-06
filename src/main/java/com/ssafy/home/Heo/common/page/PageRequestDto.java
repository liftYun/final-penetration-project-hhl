package com.ssafy.home.Heo.common.page;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDto {
    @Builder.Default
    private int page = 1;
    @Builder.Default
    private int size = 10;

    @JsonIgnore
    public int getOffset() {
        return (page - 1) * size;
    }
}
