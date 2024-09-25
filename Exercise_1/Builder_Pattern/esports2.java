public class esports2 {
    String game_type;
    int players;
    String network;
    int size;

    public esports2(String game_type, int players, String network, int size) {
        this.game_type = game_type;
        this.players = players;
        this.network = network;
        this.size = size;
    }

    public String toString() {
        return "esports2 [gametype=" + game_type + ", players=" + players + ", network: " + network + ", size:" + size
                + "]";
    }
}
