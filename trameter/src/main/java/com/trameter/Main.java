package com.trameter;

import com.trameter.entity.Room;
import com.trameter.service.RoomDistributionService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        RoomDistributionService roomDistributionService = new RoomDistributionService();
        List<Room> distributedRooms = roomDistributionService.distributeRooms(2, 2);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(1, 2, 1);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 6, 3);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(2, 6);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(2, 3);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 4);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 7, 1);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(2, 4, 1);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 6, 1);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(4, 9, 2);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 7);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 7, 1);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(5, 7, 2);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(5, 7, 4);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 5, 4);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 5, 7);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 4, 4);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 5);
        System.out.println(distributedRooms);

        distributedRooms = roomDistributionService.distributeRooms(3, 5, 1);
        System.out.println(distributedRooms);

    }
}

/*
3 7 1
r1  r2  r3
a1  a2  a3
a4  a5  a6
a7  c1

[
Room(numberOfAdults=2, numberOfChildren=1, count=1),
Room(numberOfAdults=2, numberOfChildren=0, count=1),
Room(numberOfAdults=3, numberOfChildren=0, count=1)
]
 */

// continue from you stop
