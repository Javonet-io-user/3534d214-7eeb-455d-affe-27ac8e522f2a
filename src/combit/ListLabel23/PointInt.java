package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class PointInt extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getx (){ try { return javonetHandle.get("x");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setx (java.lang.Integer param){ try { javonetHandle.set("x",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer gety (){ try { return javonetHandle.get("y");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void sety (java.lang.Integer param){ try { javonetHandle.set("y",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PointInt(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}