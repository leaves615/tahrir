package tahrir;

public class TrConstants {
	public static final int MAX_UDP_PACKET_SIZE = 1400; // old value was 1450

	public static final int UDP_CONN_INIT_INTERVAL_SECONDS = 2;

	public static final String version = "0.1";

	public static final int DEFAULT_BAOS_SIZE = 2048;

	public static final int DEFAULT_UDP_ACK_TIMEOUT_MS = 1000;

	public static final int UDP_SHORT_MESSAGE_RETRY_ATTEMPTS = 3; // old value was 5

	public static final int UDP_KEEP_ALIVE_DURATION = 7;

	public static final int PUB_PEER_CONCURRENT_ASSIMILATE = 3;
}
