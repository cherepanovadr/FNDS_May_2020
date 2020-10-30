package Songs;

public class Playlist {
    private String type;
    private String name;
    private String time;

    public Playlist(String type,String name,String time){
        this.type=type;
        this.name=name;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
