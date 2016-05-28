package central;
import central.CentralView;
import MVC.Model;

public class CentralModel implements Model {
    public CentralModel(CentralView v)
    {
        MyCentralView = v;
    }
    @Override
    public void GetData() {
        String httpreq = GetHTTPRequest();
        String data = parseHTTP(httpreq);

        data = "numdisp1 25";

        MyCentralView.update(data);
    }

    private String parseHTTP(String httpreq) {
        // TODO Auto-generated method stub
        return null;
    }

    private String GetHTTPRequest() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void SaveData(String data) {
        // TODO Auto-generated method stub

    }

    private CentralView MyCentralView;
}
