package com.example.natv_myP1.DTOS;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDTO {
String channelName;
String logo;
Double pricePerLetter;
List<DiscountsDTO> discounts;
//SSSS




}
