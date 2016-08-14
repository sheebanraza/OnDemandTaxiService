package notificationManagement.Model;

/**
 * Created by sheebanshaikh on 8/14/16.
 */


public enum NotificationMessages {

    RIDE_INITIATED {
        public String toString() {
            return "Ride has been initiated";
        }
    },

    RIDE_PROCESSING {
        public String toString() {
            return "Ride matching in process";
        }
    },

    RIDE_FINALIZED {
        public String toString() {
            return "Ride request approved";
        }
    },

    RIDE_CANCELLED {
        public String toString() {
            return "Ride has been cancelled";
        }
    },

    PARKING_ALLOTED_SUCCESSFUL {
        public String toString() {
            return "Parked Successfully";
        }
    },

    RIDED_STARTED {
        public String toString() {
            return "Ride Started";
        }
    },

    RIDE_ENDED {
        public String toString() {
            return "Ride Fininshed";
        }
    },

    FIND_NEAREST_PARKING_SLOT {
        public String toString() {
            return " Finding nearest parking slot..........";
        }
    },

    PARKING_BOOKED {
        public String toString() {
            return " Parking Slot Alloted..........";
        }
    }

}
