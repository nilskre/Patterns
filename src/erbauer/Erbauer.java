package erbauer;

public interface Erbauer {

    String title = "";
    String description = "";

    public KonkreterErbauerImpl setTitle(String title);
    public KonkreterErbauerImpl setDescription(String description);
}
