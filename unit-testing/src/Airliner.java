import java.util.ArrayList;

public class Airliner {

    private ArrayList<CrewMember> crew;

    public Airliner() {
        crew = new ArrayList<CrewMember>();
    }

    public void addCrewMember(CrewMember member) {
        if (member != null) {
            this.crew.add(member);
        }
    }

    public ArrayList<CrewMember> getCrewMembers() {
        return new ArrayList<CrewMember>(crew);
    }

}
