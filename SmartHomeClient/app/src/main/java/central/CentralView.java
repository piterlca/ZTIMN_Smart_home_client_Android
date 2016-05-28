package central;

import java.util.ArrayList;
import java.util.List;
import IOElements.IOelement;
import MVC.View;

public class CentralView implements View {

    public CentralView()
    {
        ListOfIOs = new ArrayList<IOelement>();
    }
    public void AddIOEToList(IOelement IO)
    {
        ListOfIOs.add(IO);
    }
    @Override
    public void update(String data) {
        String IOElementID = ExtractIO_ID(data);
        String Params = ExtractIO_Data(data);
        for(IOelement IO : ListOfIOs)
        {
            String CurrentNodeID = IO.GetID();
            if(CurrentNodeID.equals(IOElementID))
            {
                IO.OnNewData(Params);
                IO.UpdateView();
            }
        }
    }

    private String ExtractIO_Data(String data) {
        return data.substring(data.indexOf(" "));
    }

    private String ExtractIO_ID(String data) {
        return data.substring(0,  data.indexOf(" "));
    }

    private List<IOelement> ListOfIOs;

}
