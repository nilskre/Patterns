package erbauer;

public class KonkreterErbauerImpl implements Erbauer {

    private final long id;
    private String title = "";
    private String description = "";

    public KonkreterErbauerImpl(long id) {
        this.id = id;
    }

    public KonkreterErbauerImpl(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public KonkreterErbauerImpl setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public KonkreterErbauerImpl setDescription(String description) {
        this.description = description;
        return this;
    }

    public Produkt build() {
        return new Produkt(id, title, description);
    }
}
