package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;
import jio.System.Collections.*;public class ParameterAutoCompleteEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParameterIndex (java.lang.Integer value){ try { javonetHandle.set("ParameterIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getParameterIndex (){ try { return javonetHandle.get("ParameterIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public IList getValues (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.<NObject>get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ParameterAutoCompleteEventArgs (java.lang.Integer parameterIndex){  super((NObject) null); try {  javonetHandle = Javonet.New("ParameterAutoCompleteEventArgs",parameterIndex); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ParameterAutoCompleteEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}