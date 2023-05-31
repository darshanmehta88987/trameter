package com.trameter.service;

import com.trameter.entity.Room;

import java.util.*;

public class RoomDistributionService {

    /**
     * @param rooms  Number Of Rooms
     * @param adults Number Of Adults
     * @return Rooms to be alloted with number adults or for one person(adult in this case)
     */
    public List<Room> distributeRooms(int rooms, int adults) {
        return distributeRooms(rooms, adults, 0);
    }

    /**
     * @param rooms    Number Of Rooms
     * @param adults   Number Of Adults
     * @param children Number Of children
     * @return Rooms to be alloted with number adults or for one person(adult in this case)
     */

    public List<Room> distributeRooms(int rooms, int adults, int children) {

        if (rooms > adults) {
            System.out.println("Number Of Rooms cannot be more than number of adults");
            return Collections.emptyList();
        }

        System.out.println(rooms + " " + adults + " " + children);
        List<Room> roomList = new ArrayList<>(rooms);

        // Initialize rooms
        for (int i = 0; i < rooms; i++) {
            roomList.add(new Room());
        }

        // distribute adults children in rooms
        distributePeopleInRooms(adults, children, roomList);

        // Merge rooms for room type of single, identical , non-identical or mixed
        Map<Room, Room> mergedRooms = getMergedRooms(roomList);

        return new ArrayList<>(mergedRooms.values());
    }

    /**
     * Merge rooms for the room type of single, identical, non-identical or mixed
     *
     * @param roomList Will consist rooms of all room type
     * @return Merged rooms which can be grouped together
     */
    private Map<Room, Room> getMergedRooms(List<Room> roomList) {
        Map<Room, Room> mergedRooms = new LinkedHashMap<>();
        for (Room room : roomList) {
            Room roomToUpdate;
            if (mergedRooms.containsKey(room)) {
                roomToUpdate = mergedRooms.get(room);
            } else {
                roomToUpdate = new Room(room);
            }
            roomToUpdate.setCount(roomToUpdate.getCount() + 1);
            mergedRooms.put(room, roomToUpdate);
        }
        return mergedRooms;
    }

    /**
     * Distribute people(children and adults) in room
     *
     * @param adults   total number of adults to be distributed
     * @param children total number of children to be distributed
     * @param roomList rooms in which adults and children will be distributed
     */
    private void distributePeopleInRooms(int adults, int children, List<Room> roomList) {

        int indexRoom = 0;

        while (adults > 0 || children > 0) {
            if (indexRoom == roomList.size()) {
                indexRoom = 0;
            }

            Room currentRoom = roomList.get(indexRoom);
            if (adults > 0) {
                currentRoom.setNumberOfAdults(currentRoom.getNumberOfAdults() + 1);
                adults--;
            } else if (children > 0) {
                currentRoom.setNumberOfChildren(currentRoom.getNumberOfChildren() + 1);
                children--;
            }
            indexRoom++;
        }

    }

}


