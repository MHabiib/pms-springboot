package com.future.pms.model.list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class ParkingZoneSlot {
    @Id
    private String slotId;
    private String name;
    private String status;
}
