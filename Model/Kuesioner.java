package Model;

import java.util.ArrayList;

public class Kuesioner {
    String id;
    String id_creator;
    ArrayList<String> pertanyaan;

    public Kuesioner(String id, String id_creator) {
        this.id = id;
        this.id_creator = id_creator;
    }

    public String getId() {
        return id;
    }
}
