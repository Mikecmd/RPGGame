package engine.race;

public class Race {
    private String name;
    private String description;

    public Race(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
