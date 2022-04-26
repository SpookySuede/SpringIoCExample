import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Student")
public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public int getId() {
        return id;
    }
    @Autowired
    @Qualifier("ID")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }
    @Autowired(required = false)
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }
    @Autowired(required = false)
    public void setAdd(Address add) {
        this.add = add;
    }
}
