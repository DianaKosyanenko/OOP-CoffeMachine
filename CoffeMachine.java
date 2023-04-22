import java.util.ArrayList;
import java.util.List;

public class CoffeMachine {
    List<Coffe> list = new ArrayList<>();
    private int amount = 0;


    public int getAmount() {
        return amount;
    }

    public CoffeMachine addCoffe(Coffe coffe) {
        list.add(coffe);
        return this;
    }

    public  List<Coffe> getList() {
        return list;

    }

    public Coffe findCoffe(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }

        }
        return null;

    }
    public  Coffe sellCoffe(Coffe coffe) {

        try {
            Coffe cofFound = findCoffe(coffe.getName());
            getList().remove(cofFound);
            amount += cofFound.getCost();
            return cofFound;

        } catch (Exception ex) {
            throw new RuntimeException("Coffe not found");

        }
    }
}

