import java.util.HashMap;

class MapTestClass {
    public void mapTest() throws Exception
    {
        HashMap<String, int> map_obj = new HashMap<String, int>();
        map_obj.put("x", 5);
        //let containsX = "x" in mapObj;
        //delete mapObj["x"];
        map_obj.put("x", 3);
        return map_obj.get("x");
    }
}

class Program {
    public static void main(String[] args) throws Exception {
        new TestClass().testMethod();
    }
}