package com.example.natv_myP1.DTOS;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TextOrderCalculateDTO {
    String  text;
    Integer daysCount;
    Long channelId;
    Double price;
    Double priceWithDiscount;






}
