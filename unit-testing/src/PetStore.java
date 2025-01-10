import java.util.ArrayList;

public class PetStore {

    private ArrayList<Pet> pets; // refernce to the pets

    public PetStore() {
        pets = new ArrayList<Pet>();

    }

    public ArrayList<Pet> getPets() {
        return new ArrayList<Pet>(pets);
    }

}
