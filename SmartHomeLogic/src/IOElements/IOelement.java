package IOElements;
import MVC.*;
import central.CentralController;

public abstract class IOelement {

	public IOelement(String IO_ID, CentralController MCC)
	{
		IONodeID = IO_ID;
		MyCentralController = MCC;
	}
	public abstract void UpdateView();
	
	public void OnAction(String params)
	{
		MyCentralController.IOElementStateChanged(IONodeID + " " + params);
	}
	
	public void OnNewData(String tdata)
	{
		data = tdata;
	}
	
	public String GetID()
	{
		return IONodeID;
	}
	
	protected String 			IONodeID;
	protected Controller 		MyCentralController;
	
	protected String 			data;

}
