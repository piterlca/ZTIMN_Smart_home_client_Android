package central;

import MVC.Controller;
import Utils.ToCommandTranslator;

public class CentralController implements Controller {
	public CentralController(CentralModel m)
	{
		MyCentralModel = m;
		translator = new ToCommandTranslator();
	}
	
	public void IOElementStateChanged(String params)
	{	
		String ElementID = params.substring(0, params.indexOf(" "));
		
		String Command = translator.TranslateIO_ID_ToCommand(ElementID);
		
		String req = FormHTTPRequest(Command, params);
		SendHTTPRequest(req);
	}

	public void RegisterIO_CMD(String ID, String cmd)
	{
		translator.RegisterIO_NodeCommand(ID, cmd);
	}
	private void SendHTTPRequest(String req) {
		// TODO Auto-generated method stub
		System.out.println(req);
	}

	private String FormHTTPRequest(String Command, String newState) {
		return "POST " + "127.0.0.1 " + Command + newState + ")";
	}

	public void Refresh() 
	{
		MyCentralModel.GetData();
		
	}
	
	private CentralModel MyCentralModel;
	private ToCommandTranslator translator;
}
