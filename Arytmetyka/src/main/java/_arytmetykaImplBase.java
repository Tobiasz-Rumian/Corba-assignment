
/**
* _arytmetykaImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Arytmetyka.idl
* sobota, 6 czerwca 2020 18:12:09 CEST
*/

public abstract class _arytmetykaImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements arytmetyka, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _arytmetykaImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_s1", new java.lang.Integer (0));
    _methods.put ("_set_s1", new java.lang.Integer (1));
    _methods.put ("_get_s2", new java.lang.Integer (2));
    _methods.put ("_set_s2", new java.lang.Integer (3));
    _methods.put ("_get_wynik", new java.lang.Integer (4));
    _methods.put ("_set_wynik", new java.lang.Integer (5));
    _methods.put ("Suma", new java.lang.Integer (6));
    _methods.put ("Roznica", new java.lang.Integer (7));
    _methods.put ("Iloczyn", new java.lang.Integer (8));
    _methods.put ("Iloraz", new java.lang.Integer (9));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // arytmetyka/_get_s1
       {
         double $result = (double)0;
         $result = this.s1 ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // arytmetyka/_set_s1
       {
         double newS1 = in.read_double ();
         this.s1 (newS1);
         out = $rh.createReply();
         break;
       }

       case 2:  // arytmetyka/_get_s2
       {
         double $result = (double)0;
         $result = this.s2 ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 3:  // arytmetyka/_set_s2
       {
         double newS2 = in.read_double ();
         this.s2 (newS2);
         out = $rh.createReply();
         break;
       }

       case 4:  // arytmetyka/_get_wynik
       {
         double $result = (double)0;
         $result = this.wynik ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 5:  // arytmetyka/_set_wynik
       {
         double newWynik = in.read_double ();
         this.wynik (newWynik);
         out = $rh.createReply();
         break;
       }

       case 6:  // arytmetyka/Suma
       {
         this.Suma ();
         out = $rh.createReply();
         break;
       }

       case 7:  // arytmetyka/Roznica
       {
         this.Roznica ();
         out = $rh.createReply();
         break;
       }

       case 8:  // arytmetyka/Iloczyn
       {
         this.Iloczyn ();
         out = $rh.createReply();
         break;
       }

       case 9:  // arytmetyka/Iloraz
       {
         try {
           this.Iloraz ();
           out = $rh.createReply();
         } catch (arytmetykaPackage.DzieleniePrzezZero $ex) {
           out = $rh.createExceptionReply ();
           arytmetykaPackage.DzieleniePrzezZeroHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:arytmetyka:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _arytmetykaImplBase
