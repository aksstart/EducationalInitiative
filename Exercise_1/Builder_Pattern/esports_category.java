
class esports_category {
    String game_type;
    int players;
    String network;
    int size;

    esports_category set_gametype(String game_type) {
        this.game_type = game_type;
        return this;
    }

    esports_category set_players(int players) {
        this.players = players;
        return this;
    }

    esports_category set_network(String network) {
        this.network = network;
        return this;
    }

    esports_category set_size(int size) {
        this.size = size;
        return this;
    }

    esports2 get_esports() {
        return new esports2(game_type, players, network, size);
    }

}
