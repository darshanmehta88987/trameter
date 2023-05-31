package com.trameter.entity;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"count"})
@NoArgsConstructor
public class Room {
    private int numberOfAdults;
    private int numberOfChildren;
    private int count;

    public Room(Room roomToUpdate) {
        this.numberOfAdults = roomToUpdate.getNumberOfAdults();
        this.numberOfChildren = roomToUpdate.getNumberOfChildren();
        this.count = roomToUpdate.getCount();
    }
}
