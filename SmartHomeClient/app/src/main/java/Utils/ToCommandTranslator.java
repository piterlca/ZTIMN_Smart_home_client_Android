package Utils;

import java.util.HashMap;
import java.util.Map;
import IOElements.IOelement;

public class ToCommandTranslator {
    public ToCommandTranslator()
    {
        ID_Command_Map = new HashMap();
    }

    public String TranslateIO_ID_ToCommand(String IO_ID)
    {
        return (ID_Command_Map.get(IO_ID) + "(");
    }

    public void RegisterIO_NodeCommand(String IO_ID, String Command)
    {
        ID_Command_Map.put(IO_ID, Command);
    }

    private Map<String, String> ID_Command_Map;
}
