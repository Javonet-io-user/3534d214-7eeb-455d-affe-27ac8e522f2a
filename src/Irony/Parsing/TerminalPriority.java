package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;public class TerminalPriority {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static java.lang.Integer getLow (){ try { return Javonet.getType("TerminalPriority").get("Low");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setLow (java.lang.Integer param){ try { Javonet.getType("TerminalPriority").set("Low",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getNormal (){ try { return Javonet.getType("TerminalPriority").get("Normal");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setNormal (java.lang.Integer param){ try { Javonet.getType("TerminalPriority").set("Normal",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getHigh (){ try { return Javonet.getType("TerminalPriority").get("High");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setHigh (java.lang.Integer param){ try { Javonet.getType("TerminalPriority").set("High",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getReservedWords (){ try { return Javonet.getType("TerminalPriority").get("ReservedWords");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setReservedWords (java.lang.Integer param){ try { Javonet.getType("TerminalPriority").set("ReservedWords",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}