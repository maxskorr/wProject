package root.application.service.WeatherApp;

/**
* WeatherApp/WeatherInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from F:/IdeaProjects/wProject/src/root/application/service/Weather.idl
* 26 ������� 2014 �. 21:29:34 MSK
*/

public final class WeatherInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public WeatherInterface value = null;

  public WeatherInterfaceHolder ()
  {
  }

  public WeatherInterfaceHolder (WeatherInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = WeatherInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    WeatherInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return WeatherInterfaceHelper.type ();
  }

}
