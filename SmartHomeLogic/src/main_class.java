import central.*;

import java.net.HttpRetryException;

import IOElements.*;

public class main_class {

	public static void main(String[] args) {

		CentralView DataDisposal = new CentralView();
		CentralModel HTTPRetriever = new CentralModel(DataDisposal);
		CentralController HTTPDriver = new CentralController(HTTPRetriever);
			
		IOelement butt = new Button("Android_Butt1", HTTPDriver);
		IOelement numdisp = new NumericDisplay("numdisp1", HTTPDriver);
		
		HTTPDriver.RegisterIO_CMD("Android_Butt1", "SetParam");
		
		DataDisposal.AddIOEToList(butt);
		DataDisposal.AddIOEToList(numdisp);
		
		HTTPDriver.Refresh();
		
		butt.OnAction("ON");
		

		
	}

}
