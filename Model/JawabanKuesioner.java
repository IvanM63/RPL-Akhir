package Model;

import java.util.ArrayList;

public class JawabanKuesioner {
    private String id_responden;
    private Kuesioner kuesioner;
    private ArrayList<String> jawaban;

    public JawabanKuesioner(String id_responden, Kuesioner kuesioner) {
        this.id_responden = id_responden;
        this.kuesioner = kuesioner;
    }

    public void tambahJawaban(String jawabans) {
        jawaban.add(jawabans);
    }

    public ArrayList<String> getAllJawaban() {
        return jawaban;
    }

    public String getOwner() {
        return id_responden;
    }

    public Kuesioner getKuesioner() {
        return kuesioner;
    }

}


