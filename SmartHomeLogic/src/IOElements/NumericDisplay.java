package IOElements;

import central.CentralController;

public class NumericDisplay extends IOelement {

	public NumericDisplay(String ID, CentralController mcc) {
		super(ID, mcc);
	}
	@Override
	public void UpdateView() {
		System.out.println("View of IOElement: " + IONodeID + " : " + data);
	}

}
