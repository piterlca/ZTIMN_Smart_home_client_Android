package IOElements;

import central.CentralController;

public class Numeric1Display extends IOelement {

    public Numeric1Display(String ID, CentralController mcc) {
        super(ID, mcc);
    }
    @Override
    public void UpdateView() {
        System.out.println("View of IOElement: " + IONodeID + " : " + data);
    }

}
