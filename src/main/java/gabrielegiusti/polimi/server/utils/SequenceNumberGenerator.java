package gabrielegiusti.polimi.server.utils;


import gabrielegiusti.polimi.server.messages.SensorData;

public class SequenceNumberGenerator {

    private static long counter = 0;

    public static long generateSequenceNumber() {
        synchronized (SensorData.class) { // Ensure thread-safety for counter access
            return counter++;
        }
    }
}
