using System.Linq;
using System;

public class TestClass
{
    public void TestMethod()
    {
        var result = new List<string> {  };
        var map = new Dictionary<string, int>
        {
          { "x", 5 }
        };
        var keys = map.Keys.ToArray();
        Console.WriteLine(result);
        Console.WriteLine(keys);
    }
}

public class Program
{
    static public void Main()
    {
        new TestClass().TestMethod();
    }
}