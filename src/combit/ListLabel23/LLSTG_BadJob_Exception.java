package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class LLSTG_BadJob_Exception extends ListLabelException {public NObject javonetHandle; public LLSTG_BadJob_Exception (){  super((NObject) null); try {  javonetHandle = Javonet.New("LLSTG_BadJob_Exception"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LLSTG_BadJob_Exception (java.lang.String message){  super((NObject) null); try {  javonetHandle = Javonet.New("LLSTG_BadJob_Exception",message); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LLSTG_BadJob_Exception (java.lang.String message,jio.System.Exception innerException){  super((NObject) null); try {  javonetHandle = Javonet.New("LLSTG_BadJob_Exception",message,innerException); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LLSTG_BadJob_Exception(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}